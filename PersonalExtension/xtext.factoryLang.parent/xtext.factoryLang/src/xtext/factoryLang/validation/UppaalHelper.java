package xtext.factoryLang.validation;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.uppaal.engine.Engine;
import com.uppaal.engine.EngineException;
import com.uppaal.engine.EngineStub;
import com.uppaal.engine.Problem;
import com.uppaal.engine.QueryFeedback;
import com.uppaal.engine.QueryResult;
import com.uppaal.model.core2.Document;
import com.uppaal.model.core2.PrototypeDocument;
import com.uppaal.model.system.UppaalSystem;
import com.uppaal.model.system.concrete.ConcreteTrace;
import com.uppaal.model.system.symbolic.SymbolicTrace;

public class UppaalHelper {
	public static Document loadModel(String location) throws IOException
    {
		//com.uppaal.model.io2.XMLReader.setXMLResolver(new com.uppaal.model.io2.UXMLResolver());
		try {
			// try URL scheme (useful to fetch from Internet):
			return new PrototypeDocument().load(new URL(location));
		} catch (MalformedURLException ex) {
			// not URL, retry as it were a local filepath:
			return new PrototypeDocument().load(new URL("file", null, location));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    }
	
	public static Engine connectToEngine() throws EngineException, IOException
    {
		String path = new File("uppaal/bin-Linux/server").getPath();
		Engine engine = new Engine();
		engine.setServerPath(path);
		engine.setServerHost("localhost");
		engine.setConnectionMode(EngineStub.BOTH);
		engine.connect();
		return engine;
    }
	
	public static UppaalSystem compile(Engine engine, Document doc)
			throws EngineException, IOException
    {
		// compile the model into system:
		ArrayList<Problem> problems = new ArrayList<>();
		UppaalSystem sys = engine.getSystem(doc, problems);
		if (!problems.isEmpty()) {
			System.out.println("There are problems with the document:");
			for (Problem p : problems) {
				System.out.println(p.toString());
				if (!"warning".equals(p.getType())) { // ignore warnings
				}
			}
		}
		return sys;
    }
	
	public static String getOutputFromProgram(String program) throws IOException {
	    Process proc = Runtime.getRuntime().exec(program);
	    String returnValue = Stream.of(proc.getErrorStream(), proc.getInputStream()).parallel().map((InputStream isForOutput) -> {
	        StringBuilder output = new StringBuilder();
	        try (BufferedReader br = new BufferedReader(new InputStreamReader(isForOutput))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                output.append(line);
	                output.append("\n");
	            }
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	        return output;
	    }).collect(Collectors.joining());
	    if (proc.exitValue() != 0) {
	    	return "ERROR:"+returnValue;
	    }
	    return returnValue;
	}
	
	public static class StreamGobbler implements Runnable {
	    private InputStream inputStream;
	    private Consumer<String> consumer;
	    private StringBuilder sb;
	    public StreamGobbler(InputStream inputStream){//, Consumer<String> consumer) {
	        this.inputStream = inputStream;
	        //this.consumer = System.out::println;
	        this.sb = new StringBuilder();
	        this.consumer = sb::append;
	    }
	    
	    public String getOutput() {
	    	return sb.toString();
	    }
	    
	    @Override
	    public void run() {
	        new BufferedReader(new InputStreamReader(inputStream)).lines()
	          .forEach(consumer);
	    }
	}
	
	
	public static QueryFeedback qf =
			new QueryFeedback() {
				@Override
				public void setProgressAvail(boolean availability)
				{
				}

				@Override
				public void setProgress(int load, long vm, long rss, long cached, long avail, long swap, long swapfree, long user, long sys, long timestamp)
				{
				}

				@Override
				public void setSystemInfo(long vmsize, long physsize, long swapsize)
				{
				}

				@Override
				public void setLength(int length)
				{
				}

				@Override
				public void setCurrent(int pos)
				{
				}

				@Override
				public void setTrace(char result, String feedback,
									 SymbolicTrace trace, QueryResult queryVerificationResult)
				{
					//strace = trace;
				}

				public void setTrace(char result, String feedback,
									 ConcreteTrace trace, QueryResult queryVerificationResult)
				{
					//ctrace = trace;
				}
				@Override
				public void setFeedback(String feedback)
				{
					if (feedback != null && feedback.length() > 0) {
						System.out.println("Feedback: "+feedback);
					}
				}

				@Override
				public void appendText(String s)
				{
					if (s != null && s.length() > 0) {
						System.out.println("Append: "+s);
					}
				}

				@Override
				public void setResultText(String s)
				{
					if (s != null && s.length() > 0) {
						System.out.println("Result: "+s);
					}
				}
			};
}
