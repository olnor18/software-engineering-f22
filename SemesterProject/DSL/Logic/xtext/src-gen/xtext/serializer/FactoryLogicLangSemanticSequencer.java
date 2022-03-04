/*
 * generated by Xtext 2.25.0
 */
package xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import xtext.factoryLogicLang.Conditional;
import xtext.factoryLogicLang.FactoryLogicLangPackage;
import xtext.factoryLogicLang.Loop;
import xtext.factoryLogicLang.Model;
import xtext.services.FactoryLogicLangGrammarAccess;

@SuppressWarnings("all")
public class FactoryLogicLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FactoryLogicLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FactoryLogicLangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FactoryLogicLangPackage.CONDITIONAL:
				sequence_Conditional(context, (Conditional) semanticObject); 
				return; 
			case FactoryLogicLangPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case FactoryLogicLangPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Declaration returns Conditional
	 *     Conditional returns Conditional
	 *
	 * Constraint:
	 *     (variable=VARIABLE operator=BOOLEAN_OPERATOR? comparison=VARIABLE)
	 */
	protected void sequence_Conditional(ISerializationContext context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (
	 *         loopvar=VARIABLE 
	 *         variable=VARIABLE 
	 *         STRING1=STRING? 
	 *         operator=BOOLEAN_OPERATOR? 
	 *         comparison=VARIABLE 
	 *         STRING2=STRING?
	 *     )
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     declarations+=Declaration+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
