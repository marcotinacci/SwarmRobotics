/*
* generated by Xtext
*/
package unifi.marcotinacci.thesis.seal.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import unifi.marcotinacci.thesis.seal.services.SealGrammarAccess;

public class SealParser extends AbstractContentAssistParser {
	
	@Inject
	private SealGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected unifi.marcotinacci.thesis.seal.ui.contentassist.antlr.internal.InternalSealParser createParser() {
		unifi.marcotinacci.thesis.seal.ui.contentassist.antlr.internal.InternalSealParser result = new unifi.marcotinacci.thesis.seal.ui.contentassist.antlr.internal.InternalSealParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getProgramAccess().getAlternatives_8(), "rule__Program__Alternatives_8");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getUpdateAccess().getAlternatives(), "rule__Update__Alternatives");
					put(grammarAccess.getLogicalAccess().getAlternatives_1_0(), "rule__Logical__Alternatives_1_0");
					put(grammarAccess.getRelationAccess().getAlternatives_1_0(), "rule__Relation__Alternatives_1_0");
					put(grammarAccess.getAdditionAccess().getAlternatives_1_0(), "rule__Addition__Alternatives_1_0");
					put(grammarAccess.getMultiplicationAccess().getAlternatives_1_0(), "rule__Multiplication__Alternatives_1_0");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_9(), "rule__Program__Group_9__0");
					put(grammarAccess.getProgramAccess().getGroup_9_3(), "rule__Program__Group_9_3__0");
					put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
					put(grammarAccess.getRangeAccess().getGroup_9(), "rule__Range__Group_9__0");
					put(grammarAccess.getModuleDefineAccess().getGroup(), "rule__ModuleDefine__Group__0");
					put(grammarAccess.getModuleDefineAccess().getGroup_3(), "rule__ModuleDefine__Group_3__0");
					put(grammarAccess.getModuleDefineAccess().getGroup_4(), "rule__ModuleDefine__Group_4__0");
					put(grammarAccess.getModuleDefineAccess().getGroup_5(), "rule__ModuleDefine__Group_5__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getNDCaseAccess().getGroup(), "rule__NDCase__Group__0");
					put(grammarAccess.getNDCaseAccess().getGroup_2(), "rule__NDCase__Group_2__0");
					put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
					put(grammarAccess.getCaseAccess().getGroup_2(), "rule__Case__Group_2__0");
					put(grammarAccess.getCaseAccess().getGroup_5(), "rule__Case__Group_5__0");
					put(grammarAccess.getUpdateAccess().getGroup_0(), "rule__Update__Group_0__0");
					put(grammarAccess.getUpdateAccess().getGroup_1(), "rule__Update__Group_1__0");
					put(grammarAccess.getEnvironmentAccess().getGroup(), "rule__Environment__Group__0");
					put(grammarAccess.getEnvironmentAccess().getGroup_1(), "rule__Environment__Group_1__0");
					put(grammarAccess.getLogicalAccess().getGroup(), "rule__Logical__Group__0");
					put(grammarAccess.getLogicalAccess().getGroup_1(), "rule__Logical__Group_1__0");
					put(grammarAccess.getLogicalAccess().getGroup_1_0_0(), "rule__Logical__Group_1_0_0__0");
					put(grammarAccess.getLogicalAccess().getGroup_1_0_1(), "rule__Logical__Group_1_0_1__0");
					put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
					put(grammarAccess.getRelationAccess().getGroup_1(), "rule__Relation__Group_1__0");
					put(grammarAccess.getRelationAccess().getGroup_1_0_0(), "rule__Relation__Group_1_0_0__0");
					put(grammarAccess.getRelationAccess().getGroup_1_0_1(), "rule__Relation__Group_1_0_1__0");
					put(grammarAccess.getRelationAccess().getGroup_1_0_2(), "rule__Relation__Group_1_0_2__0");
					put(grammarAccess.getRelationAccess().getGroup_1_0_3(), "rule__Relation__Group_1_0_3__0");
					put(grammarAccess.getRelationAccess().getGroup_1_0_4(), "rule__Relation__Group_1_0_4__0");
					put(grammarAccess.getRelationAccess().getGroup_1_0_5(), "rule__Relation__Group_1_0_5__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_0(), "rule__Addition__Group_1_0_0__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_1(), "rule__Addition__Group_1_0_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_0(), "rule__Multiplication__Group_1_0_0__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_1(), "rule__Multiplication__Group_1_0_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_3(), "rule__PrimaryExpression__Group_3__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_4(), "rule__PrimaryExpression__Group_4__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_5(), "rule__PrimaryExpression__Group_5__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_5_1(), "rule__PrimaryExpression__Group_5_1__0");
					put(grammarAccess.getProgramAccess().getActionsAssignment_2(), "rule__Program__ActionsAssignment_2");
					put(grammarAccess.getProgramAccess().getModulesAssignment_5(), "rule__Program__ModulesAssignment_5");
					put(grammarAccess.getProgramAccess().getModulesAssignment_6(), "rule__Program__ModulesAssignment_6");
					put(grammarAccess.getProgramAccess().getEnvironmentAssignment_8_0(), "rule__Program__EnvironmentAssignment_8_0");
					put(grammarAccess.getProgramAccess().getIsEmptyEnvAssignment_8_1(), "rule__Program__IsEmptyEnvAssignment_8_1");
					put(grammarAccess.getProgramAccess().getRangesAssignment_9_2(), "rule__Program__RangesAssignment_9_2");
					put(grammarAccess.getProgramAccess().getRangesAssignment_9_3_1(), "rule__Program__RangesAssignment_9_3_1");
					put(grammarAccess.getRangeAccess().getModuleAssignment_0(), "rule__Range__ModuleAssignment_0");
					put(grammarAccess.getRangeAccess().getVariableAssignment_2(), "rule__Range__VariableAssignment_2");
					put(grammarAccess.getRangeAccess().getFromAssignment_5(), "rule__Range__FromAssignment_5");
					put(grammarAccess.getRangeAccess().getToAssignment_7(), "rule__Range__ToAssignment_7");
					put(grammarAccess.getRangeAccess().getDeltaAssignment_9_2(), "rule__Range__DeltaAssignment_9_2");
					put(grammarAccess.getActionAccess().getNameAssignment(), "rule__Action__NameAssignment");
					put(grammarAccess.getModuleDefineAccess().getNameAssignment_1(), "rule__ModuleDefine__NameAssignment_1");
					put(grammarAccess.getModuleDefineAccess().getVariablesAssignment_3_0(), "rule__ModuleDefine__VariablesAssignment_3_0");
					put(grammarAccess.getModuleDefineAccess().getRulesAssignment_4_0(), "rule__ModuleDefine__RulesAssignment_4_0");
					put(grammarAccess.getModuleDefineAccess().getNeverAssignment_5_2(), "rule__ModuleDefine__NeverAssignment_5_2");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0(), "rule__VariableDeclaration__TypeAssignment_0");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
					put(grammarAccess.getVariableDeclarationAccess().getExprAssignment_3(), "rule__VariableDeclaration__ExprAssignment_3");
					put(grammarAccess.getTypeAccess().getNameAssignment_0(), "rule__Type__NameAssignment_0");
					put(grammarAccess.getTypeAccess().getNameAssignment_1(), "rule__Type__NameAssignment_1");
					put(grammarAccess.getTypeAccess().getNameAssignment_2(), "rule__Type__NameAssignment_2");
					put(grammarAccess.getRuleAccess().getCondAssignment_0(), "rule__Rule__CondAssignment_0");
					put(grammarAccess.getRuleAccess().getActionAssignment_2(), "rule__Rule__ActionAssignment_2");
					put(grammarAccess.getRuleAccess().getNdCasesAssignment_4(), "rule__Rule__NdCasesAssignment_4");
					put(grammarAccess.getNDCaseAccess().getCasesAssignment_1(), "rule__NDCase__CasesAssignment_1");
					put(grammarAccess.getNDCaseAccess().getCasesAssignment_2_1(), "rule__NDCase__CasesAssignment_2_1");
					put(grammarAccess.getCaseAccess().getWeightAssignment_1(), "rule__Case__WeightAssignment_1");
					put(grammarAccess.getCaseAccess().getHasConditionAssignment_2_0(), "rule__Case__HasConditionAssignment_2_0");
					put(grammarAccess.getCaseAccess().getCondAssignment_2_1(), "rule__Case__CondAssignment_2_1");
					put(grammarAccess.getCaseAccess().getUpdateAssignment_4(), "rule__Case__UpdateAssignment_4");
					put(grammarAccess.getCaseAccess().getUpdateAssignment_5_1(), "rule__Case__UpdateAssignment_5_1");
					put(grammarAccess.getUpdateAccess().getVariableAssignment_1_1(), "rule__Update__VariableAssignment_1_1");
					put(grammarAccess.getUpdateAccess().getExprAssignment_1_3(), "rule__Update__ExprAssignment_1_3");
					put(grammarAccess.getEnvironmentAccess().getModulesAssignment_0(), "rule__Environment__ModulesAssignment_0");
					put(grammarAccess.getEnvironmentAccess().getActionsAssignment_1_1(), "rule__Environment__ActionsAssignment_1_1");
					put(grammarAccess.getEnvironmentAccess().getModulesAssignment_1_3(), "rule__Environment__ModulesAssignment_1_3");
					put(grammarAccess.getLogicalAccess().getRightAssignment_1_1(), "rule__Logical__RightAssignment_1_1");
					put(grammarAccess.getRelationAccess().getRightAssignment_1_1(), "rule__Relation__RightAssignment_1_1");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_1(), "rule__Addition__RightAssignment_1_1");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1(), "rule__Multiplication__RightAssignment_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getCondAssignment_1_2(), "rule__PrimaryExpression__CondAssignment_1_2");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1(), "rule__PrimaryExpression__ValueAssignment_2_1");
					put(grammarAccess.getPrimaryExpressionAccess().getNameAssignment_3_2(), "rule__PrimaryExpression__NameAssignment_3_2");
					put(grammarAccess.getPrimaryExpressionAccess().getModuleAssignment_3_4(), "rule__PrimaryExpression__ModuleAssignment_3_4");
					put(grammarAccess.getPrimaryExpressionAccess().getCondAssignment_3_6(), "rule__PrimaryExpression__CondAssignment_3_6");
					put(grammarAccess.getPrimaryExpressionAccess().getModuleAssignment_4_1(), "rule__PrimaryExpression__ModuleAssignment_4_1");
					put(grammarAccess.getPrimaryExpressionAccess().getVariableAssignment_4_3(), "rule__PrimaryExpression__VariableAssignment_4_3");
					put(grammarAccess.getPrimaryExpressionAccess().getVariableAssignment_5_2(), "rule__PrimaryExpression__VariableAssignment_5_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			unifi.marcotinacci.thesis.seal.ui.contentassist.antlr.internal.InternalSealParser typedParser = (unifi.marcotinacci.thesis.seal.ui.contentassist.antlr.internal.InternalSealParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SealGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SealGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
