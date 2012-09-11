/**
 */
package unifi.marcotinacci.thesis.seal.seal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see unifi.marcotinacci.thesis.seal.seal.SealFactory
 * @model kind="package"
 * @generated
 */
public interface SealPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "seal";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.marcotinacci.unifi/thesis/seal/Seal";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "seal";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SealPackage eINSTANCE = unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl.init();

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.ProgramImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__ACTIONS = 0;

  /**
   * The feature id for the '<em><b>Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__MODULES = 1;

  /**
   * The feature id for the '<em><b>Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__ENVIRONMENT = 2;

  /**
   * The feature id for the '<em><b>Is Empty Env</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__IS_EMPTY_ENV = 3;

  /**
   * The feature id for the '<em><b>Ranges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__RANGES = 4;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.RangeImpl <em>Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.RangeImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getRange()
   * @generated
   */
  int RANGE = 1;

  /**
   * The feature id for the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__MODULE = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__FROM = 2;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__TO = 3;

  /**
   * The feature id for the '<em><b>Delta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__DELTA = 4;

  /**
   * The number of structural features of the '<em>Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.ActionImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.ModuleDefineImpl <em>Module Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.ModuleDefineImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getModuleDefine()
   * @generated
   */
  int MODULE_DEFINE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DEFINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DEFINE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DEFINE__RULES = 2;

  /**
   * The feature id for the '<em><b>Never</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DEFINE__NEVER = 3;

  /**
   * The number of structural features of the '<em>Module Define</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DEFINE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.VariableDeclarationImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__EXPR = 2;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.TypeImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getType()
   * @generated
   */
  int TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.RuleImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getRule()
   * @generated
   */
  int RULE = 6;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__COND = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__ACTION = 1;

  /**
   * The feature id for the '<em><b>Nd Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__ND_CASES = 2;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.NDCaseImpl <em>ND Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.NDCaseImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getNDCase()
   * @generated
   */
  int ND_CASE = 7;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CASE__CASES = 0;

  /**
   * The number of structural features of the '<em>ND Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ND_CASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.CaseImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getCase()
   * @generated
   */
  int CASE = 8;

  /**
   * The feature id for the '<em><b>Weight</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__WEIGHT = 0;

  /**
   * The feature id for the '<em><b>Has Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__HAS_CONDITION = 1;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__COND = 2;

  /**
   * The feature id for the '<em><b>Update</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__UPDATE = 3;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.UpdateImpl <em>Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.UpdateImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getUpdate()
   * @generated
   */
  int UPDATE = 9;

  /**
   * The number of structural features of the '<em>Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.EnvironmentImpl <em>Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.EnvironmentImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getEnvironment()
   * @generated
   */
  int ENVIRONMENT = 10;

  /**
   * The feature id for the '<em><b>Modules</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__MODULES = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__ACTIONS = 1;

  /**
   * The number of structural features of the '<em>Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.ExpressionImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 11;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.NoActionImpl <em>No Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.NoActionImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getNoAction()
   * @generated
   */
  int NO_ACTION = 12;

  /**
   * The number of structural features of the '<em>No Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_ACTION_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.AssignImpl <em>Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.AssignImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getAssign()
   * @generated
   */
  int ASSIGN = 13;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__VARIABLE = UPDATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__EXPR = UPDATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.AndImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getAnd()
   * @generated
   */
  int AND = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.OrImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getOr()
   * @generated
   */
  int OR = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.LeqImpl <em>Leq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.LeqImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getLeq()
   * @generated
   */
  int LEQ = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Leq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.LessImpl <em>Less</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.LessImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getLess()
   * @generated
   */
  int LESS = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Less</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.EqImpl <em>Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.EqImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getEq()
   * @generated
   */
  int EQ = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.NeqImpl <em>Neq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.NeqImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getNeq()
   * @generated
   */
  int NEQ = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Neq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.GeqImpl <em>Geq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.GeqImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getGeq()
   * @generated
   */
  int GEQ = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEQ__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Geq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.GtrImpl <em>Gtr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.GtrImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getGtr()
   * @generated
   */
  int GTR = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Gtr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.PlusImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.MinusImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 23;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.MultiImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.DivImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getDiv()
   * @generated
   */
  int DIV = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.NotImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getNot()
   * @generated
   */
  int NOT = 26;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__COND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.LiteralImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.QuantifierImpl <em>Quantifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.QuantifierImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getQuantifier()
   * @generated
   */
  int QUANTIFIER = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__MODULE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__COND = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Quantifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.ExternalReferenceImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getExternalReference()
   * @generated
   */
  int EXTERNAL_REFERENCE = 29;

  /**
   * The feature id for the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_REFERENCE__MODULE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_REFERENCE__VARIABLE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>External Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.LocalReferenceImpl <em>Local Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unifi.marcotinacci.thesis.seal.seal.impl.LocalReferenceImpl
   * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getLocalReference()
   * @generated
   */
  int LOCAL_REFERENCE = 30;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_REFERENCE__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link unifi.marcotinacci.thesis.seal.seal.Program#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Program#getActions()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link unifi.marcotinacci.thesis.seal.seal.Program#getModules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modules</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Program#getModules()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Modules();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Program#getEnvironment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Environment</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Program#getEnvironment()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Environment();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.Program#isIsEmptyEnv <em>Is Empty Env</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Empty Env</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Program#isIsEmptyEnv()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_IsEmptyEnv();

  /**
   * Returns the meta object for the containment reference list '{@link unifi.marcotinacci.thesis.seal.seal.Program#getRanges <em>Ranges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ranges</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Program#getRanges()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Ranges();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Range
   * @generated
   */
  EClass getRange();

  /**
   * Returns the meta object for the reference '{@link unifi.marcotinacci.thesis.seal.seal.Range#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Module</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Range#getModule()
   * @see #getRange()
   * @generated
   */
  EReference getRange_Module();

  /**
   * Returns the meta object for the reference '{@link unifi.marcotinacci.thesis.seal.seal.Range#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Range#getVariable()
   * @see #getRange()
   * @generated
   */
  EReference getRange_Variable();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.Range#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Range#getFrom()
   * @see #getRange()
   * @generated
   */
  EAttribute getRange_From();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.Range#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Range#getTo()
   * @see #getRange()
   * @generated
   */
  EAttribute getRange_To();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.Range#getDelta <em>Delta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delta</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Range#getDelta()
   * @see #getRange()
   * @generated
   */
  EAttribute getRange_Delta();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine <em>Module Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Define</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.ModuleDefine
   * @generated
   */
  EClass getModuleDefine();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getName()
   * @see #getModuleDefine()
   * @generated
   */
  EAttribute getModuleDefine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getVariables()
   * @see #getModuleDefine()
   * @generated
   */
  EReference getModuleDefine_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getRules()
   * @see #getModuleDefine()
   * @generated
   */
  EReference getModuleDefine_Rules();

  /**
   * Returns the meta object for the containment reference list '{@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getNever <em>Never</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Never</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getNever()
   * @see #getModuleDefine()
   * @generated
   */
  EReference getModuleDefine_Never();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.VariableDeclaration#getType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.VariableDeclaration#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.VariableDeclaration#getExpr()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Expr();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Rule#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Rule#getCond()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Cond();

  /**
   * Returns the meta object for the reference '{@link unifi.marcotinacci.thesis.seal.seal.Rule#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Rule#getAction()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Action();

  /**
   * Returns the meta object for the containment reference list '{@link unifi.marcotinacci.thesis.seal.seal.Rule#getNdCases <em>Nd Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nd Cases</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Rule#getNdCases()
   * @see #getRule()
   * @generated
   */
  EReference getRule_NdCases();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.NDCase <em>ND Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ND Case</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.NDCase
   * @generated
   */
  EClass getNDCase();

  /**
   * Returns the meta object for the containment reference list '{@link unifi.marcotinacci.thesis.seal.seal.NDCase#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.NDCase#getCases()
   * @see #getNDCase()
   * @generated
   */
  EReference getNDCase_Cases();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Case#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Weight</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Case#getWeight()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Weight();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.Case#isHasCondition <em>Has Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Condition</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Case#isHasCondition()
   * @see #getCase()
   * @generated
   */
  EAttribute getCase_HasCondition();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Case#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Case#getCond()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Cond();

  /**
   * Returns the meta object for the containment reference list '{@link unifi.marcotinacci.thesis.seal.seal.Case#getUpdate <em>Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Update</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Case#getUpdate()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Update();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Update <em>Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Update
   * @generated
   */
  EClass getUpdate();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Environment
   * @generated
   */
  EClass getEnvironment();

  /**
   * Returns the meta object for the reference list '{@link unifi.marcotinacci.thesis.seal.seal.Environment#getModules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Modules</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Environment#getModules()
   * @see #getEnvironment()
   * @generated
   */
  EReference getEnvironment_Modules();

  /**
   * Returns the meta object for the reference list '{@link unifi.marcotinacci.thesis.seal.seal.Environment#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Actions</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Environment#getActions()
   * @see #getEnvironment()
   * @generated
   */
  EReference getEnvironment_Actions();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.NoAction <em>No Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Action</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.NoAction
   * @generated
   */
  EClass getNoAction();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Assign
   * @generated
   */
  EClass getAssign();

  /**
   * Returns the meta object for the reference '{@link unifi.marcotinacci.thesis.seal.seal.Assign#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Assign#getVariable()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Variable();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Assign#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Assign#getExpr()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Expr();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Leq <em>Leq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leq</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Leq
   * @generated
   */
  EClass getLeq();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Leq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Leq#getLeft()
   * @see #getLeq()
   * @generated
   */
  EReference getLeq_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Leq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Leq#getRight()
   * @see #getLeq()
   * @generated
   */
  EReference getLeq_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Less <em>Less</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Less
   * @generated
   */
  EClass getLess();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Less#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Less#getLeft()
   * @see #getLess()
   * @generated
   */
  EReference getLess_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Less#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Less#getRight()
   * @see #getLess()
   * @generated
   */
  EReference getLess_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Eq <em>Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eq</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Eq
   * @generated
   */
  EClass getEq();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Eq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Eq#getLeft()
   * @see #getEq()
   * @generated
   */
  EReference getEq_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Eq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Eq#getRight()
   * @see #getEq()
   * @generated
   */
  EReference getEq_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Neq <em>Neq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neq</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Neq
   * @generated
   */
  EClass getNeq();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Neq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Neq#getLeft()
   * @see #getNeq()
   * @generated
   */
  EReference getNeq_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Neq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Neq#getRight()
   * @see #getNeq()
   * @generated
   */
  EReference getNeq_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Geq <em>Geq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geq</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Geq
   * @generated
   */
  EClass getGeq();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Geq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Geq#getLeft()
   * @see #getGeq()
   * @generated
   */
  EReference getGeq_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Geq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Geq#getRight()
   * @see #getGeq()
   * @generated
   */
  EReference getGeq_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Gtr <em>Gtr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gtr</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Gtr
   * @generated
   */
  EClass getGtr();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Gtr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Gtr#getLeft()
   * @see #getGtr()
   * @generated
   */
  EReference getGtr_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Gtr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Gtr#getRight()
   * @see #getGtr()
   * @generated
   */
  EReference getGtr_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Not#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Not#getCond()
   * @see #getNot()
   * @generated
   */
  EReference getNot_Cond();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.Literal#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Literal#getValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Value();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.Quantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantifier</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Quantifier
   * @generated
   */
  EClass getQuantifier();

  /**
   * Returns the meta object for the attribute '{@link unifi.marcotinacci.thesis.seal.seal.Quantifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Quantifier#getName()
   * @see #getQuantifier()
   * @generated
   */
  EAttribute getQuantifier_Name();

  /**
   * Returns the meta object for the reference '{@link unifi.marcotinacci.thesis.seal.seal.Quantifier#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Module</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Quantifier#getModule()
   * @see #getQuantifier()
   * @generated
   */
  EReference getQuantifier_Module();

  /**
   * Returns the meta object for the containment reference '{@link unifi.marcotinacci.thesis.seal.seal.Quantifier#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.Quantifier#getCond()
   * @see #getQuantifier()
   * @generated
   */
  EReference getQuantifier_Cond();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.ExternalReference <em>External Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Reference</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.ExternalReference
   * @generated
   */
  EClass getExternalReference();

  /**
   * Returns the meta object for the reference '{@link unifi.marcotinacci.thesis.seal.seal.ExternalReference#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Module</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.ExternalReference#getModule()
   * @see #getExternalReference()
   * @generated
   */
  EReference getExternalReference_Module();

  /**
   * Returns the meta object for the reference '{@link unifi.marcotinacci.thesis.seal.seal.ExternalReference#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.ExternalReference#getVariable()
   * @see #getExternalReference()
   * @generated
   */
  EReference getExternalReference_Variable();

  /**
   * Returns the meta object for class '{@link unifi.marcotinacci.thesis.seal.seal.LocalReference <em>Local Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Reference</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.LocalReference
   * @generated
   */
  EClass getLocalReference();

  /**
   * Returns the meta object for the reference '{@link unifi.marcotinacci.thesis.seal.seal.LocalReference#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see unifi.marcotinacci.thesis.seal.seal.LocalReference#getVariable()
   * @see #getLocalReference()
   * @generated
   */
  EReference getLocalReference_Variable();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SealFactory getSealFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.ProgramImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__ACTIONS = eINSTANCE.getProgram_Actions();

    /**
     * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__MODULES = eINSTANCE.getProgram_Modules();

    /**
     * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__ENVIRONMENT = eINSTANCE.getProgram_Environment();

    /**
     * The meta object literal for the '<em><b>Is Empty Env</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__IS_EMPTY_ENV = eINSTANCE.getProgram_IsEmptyEnv();

    /**
     * The meta object literal for the '<em><b>Ranges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__RANGES = eINSTANCE.getProgram_Ranges();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.RangeImpl <em>Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.RangeImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getRange()
     * @generated
     */
    EClass RANGE = eINSTANCE.getRange();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__MODULE = eINSTANCE.getRange_Module();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__VARIABLE = eINSTANCE.getRange_Variable();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__FROM = eINSTANCE.getRange_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__TO = eINSTANCE.getRange_To();

    /**
     * The meta object literal for the '<em><b>Delta</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE__DELTA = eINSTANCE.getRange_Delta();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.ActionImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.ModuleDefineImpl <em>Module Define</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.ModuleDefineImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getModuleDefine()
     * @generated
     */
    EClass MODULE_DEFINE = eINSTANCE.getModuleDefine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_DEFINE__NAME = eINSTANCE.getModuleDefine_Name();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_DEFINE__VARIABLES = eINSTANCE.getModuleDefine_Variables();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_DEFINE__RULES = eINSTANCE.getModuleDefine_Rules();

    /**
     * The meta object literal for the '<em><b>Never</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_DEFINE__NEVER = eINSTANCE.getModuleDefine_Never();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.VariableDeclarationImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__EXPR = eINSTANCE.getVariableDeclaration_Expr();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.TypeImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.RuleImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__COND = eINSTANCE.getRule_Cond();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__ACTION = eINSTANCE.getRule_Action();

    /**
     * The meta object literal for the '<em><b>Nd Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__ND_CASES = eINSTANCE.getRule_NdCases();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.NDCaseImpl <em>ND Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.NDCaseImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getNDCase()
     * @generated
     */
    EClass ND_CASE = eINSTANCE.getNDCase();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ND_CASE__CASES = eINSTANCE.getNDCase_Cases();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.CaseImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__WEIGHT = eINSTANCE.getCase_Weight();

    /**
     * The meta object literal for the '<em><b>Has Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE__HAS_CONDITION = eINSTANCE.getCase_HasCondition();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__COND = eINSTANCE.getCase_Cond();

    /**
     * The meta object literal for the '<em><b>Update</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__UPDATE = eINSTANCE.getCase_Update();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.UpdateImpl <em>Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.UpdateImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getUpdate()
     * @generated
     */
    EClass UPDATE = eINSTANCE.getUpdate();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.EnvironmentImpl <em>Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.EnvironmentImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getEnvironment()
     * @generated
     */
    EClass ENVIRONMENT = eINSTANCE.getEnvironment();

    /**
     * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT__MODULES = eINSTANCE.getEnvironment_Modules();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENVIRONMENT__ACTIONS = eINSTANCE.getEnvironment_Actions();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.ExpressionImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.NoActionImpl <em>No Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.NoActionImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getNoAction()
     * @generated
     */
    EClass NO_ACTION = eINSTANCE.getNoAction();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.AssignImpl <em>Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.AssignImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getAssign()
     * @generated
     */
    EClass ASSIGN = eINSTANCE.getAssign();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__VARIABLE = eINSTANCE.getAssign_Variable();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__EXPR = eINSTANCE.getAssign_Expr();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.AndImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.OrImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.LeqImpl <em>Leq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.LeqImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getLeq()
     * @generated
     */
    EClass LEQ = eINSTANCE.getLeq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEQ__LEFT = eINSTANCE.getLeq_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEQ__RIGHT = eINSTANCE.getLeq_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.LessImpl <em>Less</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.LessImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getLess()
     * @generated
     */
    EClass LESS = eINSTANCE.getLess();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS__LEFT = eINSTANCE.getLess_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS__RIGHT = eINSTANCE.getLess_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.EqImpl <em>Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.EqImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getEq()
     * @generated
     */
    EClass EQ = eINSTANCE.getEq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQ__LEFT = eINSTANCE.getEq_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQ__RIGHT = eINSTANCE.getEq_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.NeqImpl <em>Neq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.NeqImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getNeq()
     * @generated
     */
    EClass NEQ = eINSTANCE.getNeq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEQ__LEFT = eINSTANCE.getNeq_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEQ__RIGHT = eINSTANCE.getNeq_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.GeqImpl <em>Geq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.GeqImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getGeq()
     * @generated
     */
    EClass GEQ = eINSTANCE.getGeq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEQ__LEFT = eINSTANCE.getGeq_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEQ__RIGHT = eINSTANCE.getGeq_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.GtrImpl <em>Gtr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.GtrImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getGtr()
     * @generated
     */
    EClass GTR = eINSTANCE.getGtr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GTR__LEFT = eINSTANCE.getGtr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GTR__RIGHT = eINSTANCE.getGtr_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.PlusImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.MinusImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.MultiImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.DivImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.NotImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT__COND = eINSTANCE.getNot_Cond();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.LiteralImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.QuantifierImpl <em>Quantifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.QuantifierImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getQuantifier()
     * @generated
     */
    EClass QUANTIFIER = eINSTANCE.getQuantifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIER__NAME = eINSTANCE.getQuantifier_Name();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIER__MODULE = eINSTANCE.getQuantifier_Module();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIER__COND = eINSTANCE.getQuantifier_Cond();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.ExternalReferenceImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getExternalReference()
     * @generated
     */
    EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_REFERENCE__MODULE = eINSTANCE.getExternalReference_Module();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_REFERENCE__VARIABLE = eINSTANCE.getExternalReference_Variable();

    /**
     * The meta object literal for the '{@link unifi.marcotinacci.thesis.seal.seal.impl.LocalReferenceImpl <em>Local Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unifi.marcotinacci.thesis.seal.seal.impl.LocalReferenceImpl
     * @see unifi.marcotinacci.thesis.seal.seal.impl.SealPackageImpl#getLocalReference()
     * @generated
     */
    EClass LOCAL_REFERENCE = eINSTANCE.getLocalReference();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_REFERENCE__VARIABLE = eINSTANCE.getLocalReference_Variable();

  }

} //SealPackage
