package xtext.factoryLang.web;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.web.server.model.IXtextWebDocument;
import org.eclipse.xtext.web.server.validation.ValidationResult;
import org.eclipse.xtext.web.server.validation.ValidationService;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

public class FactoryLangValidationService extends ValidationService {
	@Inject
	private IResourceValidator resourceValidator;
	
	private CheckMode cm = CheckMode.NORMAL_AND_FAST;
	
	public void setCheckMode(CheckMode cm) {
		this.cm = cm;
	}
	
	@Override
	public ValidationResult compute(IXtextWebDocument it, CancelIndicator cancelIndicator){
		List<Issue> issues = resourceValidator.validate(it.getResource(), cm, cancelIndicator);
		ValidationResult result = new ValidationResult();
		IterableExtensions.filter(issues, i -> !Severity.IGNORE.equals(i.getSeverity())).forEach(issue -> {
			result.getIssues().add(new ValidationResult.Issue(issue.getMessage(), translate(issue.getSeverity()),
					issue.getLineNumber(), issue.getColumn(), issue.getOffset(), issue.getLength()));
		});
		return result;
	}
}
