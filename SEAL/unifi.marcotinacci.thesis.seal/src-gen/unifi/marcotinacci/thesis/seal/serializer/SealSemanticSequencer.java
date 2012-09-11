package unifi.marcotinacci.thesis.seal.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import unifi.marcotinacci.thesis.seal.seal.Action;
import unifi.marcotinacci.thesis.seal.seal.And;
import unifi.marcotinacci.thesis.seal.seal.Assign;
import unifi.marcotinacci.thesis.seal.seal.Case;
import unifi.marcotinacci.thesis.seal.seal.Div;
import unifi.marcotinacci.thesis.seal.seal.Environment;
import unifi.marcotinacci.thesis.seal.seal.Eq;
import unifi.marcotinacci.thesis.seal.seal.ExternalReference;
import unifi.marcotinacci.thesis.seal.seal.Geq;
import unifi.marcotinacci.thesis.seal.seal.Gtr;
import unifi.marcotinacci.thesis.seal.seal.Leq;
import unifi.marcotinacci.thesis.seal.seal.Less;
import unifi.marcotinacci.thesis.seal.seal.Literal;
import unifi.marcotinacci.thesis.seal.seal.LocalReference;
import unifi.marcotinacci.thesis.seal.seal.Minus;
import unifi.marcotinacci.thesis.seal.seal.ModuleDefine;
import unifi.marcotinacci.thesis.seal.seal.Multi;
import unifi.marcotinacci.thesis.seal.seal.NDCase;
import unifi.marcotinacci.thesis.seal.seal.Neq;
import unifi.marcotinacci.thesis.seal.seal.NoAction;
import unifi.marcotinacci.thesis.seal.seal.Not;
import unifi.marcotinacci.thesis.seal.seal.Or;
import unifi.marcotinacci.thesis.seal.seal.Plus;
import unifi.marcotinacci.thesis.seal.seal.Program;
import unifi.marcotinacci.thesis.seal.seal.Quantifier;
import unifi.marcotinacci.thesis.seal.seal.Range;
import unifi.marcotinacci.thesis.seal.seal.Rule;
import unifi.marcotinacci.thesis.seal.seal.SealPackage;
import unifi.marcotinacci.thesis.seal.seal.Type;
import unifi.marcotinacci.thesis.seal.seal.VariableDeclaration;
import unifi.marcotinacci.thesis.seal.services.SealGrammarAccess;

@SuppressWarnings("all")
public class SealSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SealGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SealPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SealPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.AND:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Logical(context, (And) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.ASSIGN:
				if(context == grammarAccess.getUpdateRule()) {
					sequence_Update(context, (Assign) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.CASE:
				if(context == grammarAccess.getCaseRule()) {
					sequence_Case(context, (Case) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Multiplication(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.ENVIRONMENT:
				if(context == grammarAccess.getEnvironmentRule()) {
					sequence_Environment(context, (Environment) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.EQ:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Relation(context, (Eq) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.EXTERNAL_REFERENCE:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_PrimaryExpression(context, (ExternalReference) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.GEQ:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Relation(context, (Geq) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.GTR:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Relation(context, (Gtr) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.LEQ:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Relation(context, (Leq) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.LESS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Relation(context, (Less) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_PrimaryExpression(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.LOCAL_REFERENCE:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_PrimaryExpression(context, (LocalReference) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.MINUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Addition(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.MODULE_DEFINE:
				if(context == grammarAccess.getModuleDefineRule()) {
					sequence_ModuleDefine(context, (ModuleDefine) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.MULTI:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Multiplication(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.ND_CASE:
				if(context == grammarAccess.getNDCaseRule()) {
					sequence_NDCase(context, (NDCase) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.NEQ:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Relation(context, (Neq) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.NO_ACTION:
				if(context == grammarAccess.getUpdateRule()) {
					sequence_Update(context, (NoAction) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.NOT:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_PrimaryExpression(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.OR:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Logical(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.PLUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_Addition(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.QUANTIFIER:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalRule() ||
				   context == grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0() ||
				   context == grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0() ||
				   context == grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0() ||
				   context == grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0() ||
				   context == grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0() ||
				   context == grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0()) {
					sequence_PrimaryExpression(context, (Quantifier) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.RANGE:
				if(context == grammarAccess.getRangeRule()) {
					sequence_Range(context, (Range) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case SealPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.ACTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (weight=Expression (hasCondition?=',' cond=Expression)? update+=Update update+=Update*)
	 */
	protected void sequence_Case(EObject context, Case semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modules+=[ModuleDefine|ID] (actions+=[Action|ID]+ modules+=[ModuleDefine|ID])*)
	 */
	protected void sequence_Environment(EObject context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Logical_And_1_0_0_0 right=Relation)
	 */
	protected void sequence_Logical(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Logical_Or_1_0_1_0 right=Relation)
	 */
	protected void sequence_Logical(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID variables+=VariableDeclaration+ rules+=Rule+ never+=Expression*)
	 */
	protected void sequence_ModuleDefine(EObject context, ModuleDefine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Div_1_0_1_0 right=PrimaryExpression)
	 */
	protected void sequence_Multiplication(EObject context, Div semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=PrimaryExpression)
	 */
	protected void sequence_Multiplication(EObject context, Multi semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.MULTI__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.MULTI__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.MULTI__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.MULTI__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=Case cases+=Case*)
	 */
	protected void sequence_NDCase(EObject context, NDCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (module=[Quantifier|ID] variable=[VariableDeclaration|ID])
	 */
	protected void sequence_PrimaryExpression(EObject context, ExternalReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.EXTERNAL_REFERENCE__MODULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.EXTERNAL_REFERENCE__MODULE));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.EXTERNAL_REFERENCE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.EXTERNAL_REFERENCE__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getModuleQuantifierIDTerminalRuleCall_4_1_0_1(), semanticObject.getModule());
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationIDTerminalRuleCall_4_3_0_1(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Value
	 */
	protected void sequence_PrimaryExpression(EObject context, Literal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueValueParserRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     variable=[VariableDeclaration|ID]
	 */
	protected void sequence_PrimaryExpression(EObject context, LocalReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.LOCAL_REFERENCE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.LOCAL_REFERENCE__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getVariableVariableDeclarationIDTerminalRuleCall_5_2_0_1(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     cond=PrimaryExpression
	 */
	protected void sequence_PrimaryExpression(EObject context, Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.NOT__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.NOT__COND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getCondPrimaryExpressionParserRuleCall_1_2_0(), semanticObject.getCond());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID module=[ModuleDefine|ID] cond=PrimaryExpression)
	 */
	protected void sequence_PrimaryExpression(EObject context, Quantifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.QUANTIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.QUANTIFIER__NAME));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.QUANTIFIER__MODULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.QUANTIFIER__MODULE));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.QUANTIFIER__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.QUANTIFIER__COND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_3_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getModuleModuleDefineIDTerminalRuleCall_3_4_0_1(), semanticObject.getModule());
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getCondPrimaryExpressionParserRuleCall_3_6_0(), semanticObject.getCond());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (actions+=Action+ modules+=ModuleDefine modules+=ModuleDefine* (environment=Environment | isEmptyEnv?='is empty') (ranges+=Range ranges+=Range*)?)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (module=[ModuleDefine|ID] variable=[VariableDeclaration|ID] from=Value to=Value delta=Value?)
	 */
	protected void sequence_Range(EObject context, Range semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Relation_Eq_1_0_2_0 right=Addition)
	 */
	protected void sequence_Relation(EObject context, Eq semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.EQ__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.EQ__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.EQ__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.EQ__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Relation_Geq_1_0_4_0 right=Addition)
	 */
	protected void sequence_Relation(EObject context, Geq semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.GEQ__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.GEQ__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.GEQ__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.GEQ__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationAccess().getGeqLeftAction_1_0_4_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Relation_Gtr_1_0_5_0 right=Addition)
	 */
	protected void sequence_Relation(EObject context, Gtr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.GTR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.GTR__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.GTR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.GTR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationAccess().getGtrLeftAction_1_0_5_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Relation_Leq_1_0_0_0 right=Addition)
	 */
	protected void sequence_Relation(EObject context, Leq semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.LEQ__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.LEQ__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.LEQ__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.LEQ__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Relation_Less_1_0_1_0 right=Addition)
	 */
	protected void sequence_Relation(EObject context, Less semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.LESS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.LESS__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.LESS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.LESS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Relation_Neq_1_0_3_0 right=Addition)
	 */
	protected void sequence_Relation(EObject context, Neq semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.NEQ__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.NEQ__LEFT));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.NEQ__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.NEQ__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationAccess().getNeqLeftAction_1_0_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cond=Expression action=[Action|ID] ndCases+=NDCase+)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='int' | name='float' | name='bool')
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[VariableDeclaration|ID] expr=Expression)
	 */
	protected void sequence_Update(EObject context, Assign semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.ASSIGN__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.ASSIGN__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.ASSIGN__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.ASSIGN__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateAccess().getVariableVariableDeclarationIDTerminalRuleCall_1_1_0_1(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getUpdateAccess().getExprExpressionParserRuleCall_1_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {NoAction}
	 */
	protected void sequence_Update(EObject context, NoAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID expr=Expression)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.VARIABLE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.VARIABLE_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.VARIABLE_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, SealPackage.Literals.VARIABLE_DECLARATION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SealPackage.Literals.VARIABLE_DECLARATION__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getExprExpressionParserRuleCall_3_0(), semanticObject.getExpr());
		feeder.finish();
	}
}
