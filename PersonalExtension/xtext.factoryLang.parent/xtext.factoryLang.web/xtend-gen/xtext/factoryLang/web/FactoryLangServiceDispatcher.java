package xtext.factoryLang.web;

import com.google.common.base.Objects;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Consumer;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.apache.log4j.Logger;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.concurrent.CancelableUnitOfWork;
import org.eclipse.xtext.util.internal.Log;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.ServiceConflictResult;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.generator.GeneratorResult;
import org.eclipse.xtext.web.server.generator.GeneratorService;
import org.eclipse.xtext.web.server.model.IXtextWebDocument;
import org.eclipse.xtext.web.server.model.XtextWebDocumentAccess;
import org.eclipse.xtext.web.server.validation.ValidationResult;
import org.eclipse.xtext.web.server.validation.ValidationService;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xtext.factoryLang.validation.UppaalHelper;

@Log
@Singleton
@SuppressWarnings("all")
public class FactoryLangServiceDispatcher extends XtextServiceDispatcher {
  @Inject
  private GeneratorService generatorService;
  
  @Inject
  private ValidationService validationService;
  
  @Override
  protected XtextServiceDispatcher.ServiceDescriptor getValidationService(final IServiceContext context) throws InvalidRequestException {
    final XtextWebDocumentAccess document = this.getDocumentAccess(context);
    final XtextServiceDispatcher.ServiceDescriptor serviceDescriptor = new XtextServiceDispatcher.ServiceDescriptor();
    ((FactoryLangValidationService) this.validationService).setCheckMode(CheckMode.NORMAL_AND_FAST);
    final Function0<IServiceResult> _function = () -> {
      try {
        document.<FactoryLangValidationService>readOnly(new CancelableUnitOfWork<FactoryLangValidationService, IXtextWebDocument>() {
          @Override
          public FactoryLangValidationService exec(final IXtextWebDocument state, final CancelIndicator cancelIndicator) throws Exception {
            FactoryLangServiceDispatcher.this.validationService.compute(state, cancelIndicator);
            return ((FactoryLangValidationService) FactoryLangServiceDispatcher.this.validationService);
          }
        });
        return this.validationService.getResult(document);
      } catch (final Throwable _t) {
        if (_t instanceof Throwable) {
          final Throwable throwable = (Throwable)_t;
          return this.handleError(serviceDescriptor, throwable);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    };
    serviceDescriptor.setService(_function);
    return serviceDescriptor;
  }
  
  @Override
  protected XtextServiceDispatcher.ServiceDescriptor createServiceDescriptor(final String serviceType, final IServiceContext context) {
    XtextServiceDispatcher.ServiceDescriptor _xblockexpression = null;
    {
      boolean _equals = Objects.equal(serviceType, "generate");
      if (_equals) {
        return this.getGeneratorAllService(context);
      }
      boolean _equals_1 = Objects.equal(serviceType, "check-uppaal");
      if (_equals_1) {
        return this.getUppaalValidationService(context);
      }
      _xblockexpression = super.createServiceDescriptor(serviceType, context);
    }
    return _xblockexpression;
  }
  
  protected XtextServiceDispatcher.ServiceDescriptor getUppaalValidationService(final IServiceContext context) throws InvalidRequestException {
    final XtextWebDocumentAccess document = this.getDocumentAccess(context);
    final XtextServiceDispatcher.ServiceDescriptor serviceDescriptor = new XtextServiceDispatcher.ServiceDescriptor();
    ((FactoryLangValidationService) this.validationService).setCheckMode(CheckMode.EXPENSIVE_ONLY);
    final Function0<IServiceResult> _function = () -> {
      try {
        document.<FactoryLangValidationService>readOnly(new CancelableUnitOfWork<FactoryLangValidationService, IXtextWebDocument>() {
          @Override
          public FactoryLangValidationService exec(final IXtextWebDocument state, final CancelIndicator cancelIndicator) throws Exception {
            FactoryLangServiceDispatcher.this.validationService.compute(state, cancelIndicator);
            return ((FactoryLangValidationService) FactoryLangServiceDispatcher.this.validationService);
          }
        });
        return this.validationService.getResult(document);
      } catch (final Throwable _t) {
        if (_t instanceof Throwable) {
          final Throwable throwable = (Throwable)_t;
          return this.handleError(serviceDescriptor, throwable);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    };
    serviceDescriptor.setService(_function);
    return serviceDescriptor;
  }
  
  protected XtextServiceDispatcher.ServiceDescriptor getGeneratorAllService(final IServiceContext context) throws InvalidRequestException {
    XtextServiceDispatcher.ServiceDescriptor _xblockexpression = null;
    {
      final XtextWebDocumentAccess document = this.getDocumentAccess(context);
      XtextServiceDispatcher.ServiceDescriptor _serviceDescriptor = new XtextServiceDispatcher.ServiceDescriptor();
      final Procedure1<XtextServiceDispatcher.ServiceDescriptor> _function = (XtextServiceDispatcher.ServiceDescriptor it) -> {
        final Function0<IServiceResult> _function_1 = () -> {
          ServiceConflictResult _xtrycatchfinallyexpression = null;
          try {
            ((FactoryLangValidationService) this.validationService).setCheckMode(CheckMode.ALL);
            document.<FactoryLangValidationService>readOnly(new CancelableUnitOfWork<FactoryLangValidationService, IXtextWebDocument>() {
              @Override
              public FactoryLangValidationService exec(final IXtextWebDocument state, final CancelIndicator cancelIndicator) throws Exception {
                FactoryLangServiceDispatcher.this.validationService.compute(state, cancelIndicator);
                return ((FactoryLangValidationService) FactoryLangServiceDispatcher.this.validationService);
              }
            });
            final GeneratorService.GeneratedArtifacts result = this.generatorService.getResult(document);
            final String folder = "output/";
            final Consumer<GeneratorResult> _function_2 = (GeneratorResult a) -> {
              try {
                String name = a.getName();
                boolean _startsWith = name.startsWith(IFileSystemAccess.DEFAULT_OUTPUT);
                if (_startsWith) {
                  name = name.replaceFirst(IFileSystemAccess.DEFAULT_OUTPUT, "");
                }
                final File file = new File((folder + name));
                Files.createDirectories(Paths.get(file.getParentFile().toURI()));
                final FileWriter fw = new FileWriter(file);
                fw.write(a.getContent());
                fw.close();
              } catch (Throwable _e) {
                throw Exceptions.sneakyThrow(_e);
              }
            };
            result.getArtifacts().forEach(_function_2);
            final String output = UppaalHelper.getOutputFromProgram("bash -c \'dos2unix ./output/OrchestratorService/build.sh && ./output/OrchestratorService/build.sh\'");
            final ValidationResult returnValue = this.validationService.getResult(document);
            boolean _startsWith = output.startsWith("ERROR:");
            if (_startsWith) {
              List<ValidationResult.Issue> _issues = returnValue.getIssues();
              String _substring = output.substring(6);
              String _plus = ("Deployment failed with:\n" + _substring);
              ValidationResult.Issue _issue = new ValidationResult.Issue(_plus, "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0));
              _issues.add(_issue);
            }
            return returnValue;
          } catch (final Throwable _t) {
            if (_t instanceof Throwable) {
              final Throwable throwable = (Throwable)_t;
              _xtrycatchfinallyexpression = this.handleError(it, throwable);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          return _xtrycatchfinallyexpression;
        };
        it.setService(_function_1);
      };
      _xblockexpression = ObjectExtensions.<XtextServiceDispatcher.ServiceDescriptor>operator_doubleArrow(_serviceDescriptor, _function);
    }
    return _xblockexpression;
  }
  
  private static final Logger LOG = Logger.getLogger(FactoryLangServiceDispatcher.class);
}
