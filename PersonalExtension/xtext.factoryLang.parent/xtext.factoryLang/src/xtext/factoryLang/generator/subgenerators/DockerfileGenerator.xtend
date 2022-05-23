package xtext.factoryLang.generator.subgenerators

import org.eclipse.xtext.generator.IFileSystemAccess2

class DockerfileGenerator {
	def static generate(IFileSystemAccess2 fsa) {
		fsa.generateFile('OrchestratorService/Dockerfile', 
		'''
		FROM mcr.microsoft.com/dotnet/runtime:6.0 AS final
		WORKDIR /app
		ARG TARGETARCH
		ADD ./${TARGETARCH}.tar /app
		ENTRYPOINT ["dotnet", "OrchestratorService.dll"]
		'''
		)
		
		fsa.generateFile('OrchestratorService/DockerfileBuild', 
		'''
		FROM mcr.microsoft.com/dotnet/sdk:6.0 AS build
		WORKDIR /src
		COPY ["OrchestratorService.csproj", "./"]
		
		ARG TARGETPLATFORM
		
		RUN if [ "$TARGETPLATFORM" = "linux/amd64" ]; then \
		        RID=linux-x64 ; \
		    elif [ "$TARGETPLATFORM" = "linux/arm64" ]; then \
		        RID=linux-arm64 ; \
		    elif [ "$TARGETPLATFORM" = "linux/arm/v7" ]; then \
		        RID=linux-arm ; \
		    else\
		        RID=linux-x64 ; \
		    fi \
		    && dotnet restore -r $RID
		COPY . .
		RUN dotnet build "OrchestratorService.csproj" -c Release -o /app/build
		RUN dotnet publish "OrchestratorService.csproj" -c Release -o /app/publish
		
		FROM scratch as copy-state
		COPY --from=build /app/publish /
		'''
		)
		
		fsa.generateFile('OrchestratorService/build.sh', 
		'''
		folder=./output/OrchestratorService
		tag=ghcr.io/olnor18/software-engineering-f22/orchestrator-service
		docker buildx build -o type=tar,dest=- --build-arg TARGETPLATFORM=linux/amd64 -f $folder/DockerfileBuild -t app:amd64 $folder > $folder/amd64.tar
		docker buildx build -o type=tar,dest=- --build-arg TARGETPLATFORM=linux/arm64 -f $folder/DockerfileBuild -t app:arm64 $folder > $folder/arm64.tar
		docker buildx build -o type=tar,dest=- --build-arg TARGETPLATFORM=linux/arm/v7 -f $folder/DockerfileBuild -t app:arm $folder > $folder/arm.tar
		docker buildx build --push -t $tag:latest --platform linux/arm/v7,linux/arm64,linux/amd64 $folder
		exit 0
		'''
		)
	}
}