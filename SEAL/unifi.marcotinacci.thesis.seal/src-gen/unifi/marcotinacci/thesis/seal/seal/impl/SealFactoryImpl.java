/**
 */
package unifi.marcotinacci.thesis.seal.seal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import unifi.marcotinacci.thesis.seal.seal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SealFactoryImpl extends EFactoryImpl implements SealFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SealFactory init()
  {
    try
    {
      SealFactory theSealFactory = (SealFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.marcotinacci.unifi/thesis/seal/Seal"); 
      if (theSealFactory != null)
      {
        return theSealFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SealFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SealFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SealPackage.PROGRAM: return createProgram();
      case SealPackage.RANGE: return createRange();
      case SealPackage.ACTION: return createAction();
      case SealPackage.MODULE_DEFINE: return createModuleDefine();
      case SealPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case SealPackage.TYPE: return createType();
      case SealPackage.RULE: return createRule();
      case SealPackage.ND_CASE: return createNDCase();
      case SealPackage.CASE: return createCase();
      case SealPackage.UPDATE: return createUpdate();
      case SealPackage.ENVIRONMENT: return createEnvironment();
      case SealPackage.EXPRESSION: return createExpression();
      case SealPackage.NO_ACTION: return createNoAction();
      case SealPackage.ASSIGN: return createAssign();
      case SealPackage.AND: return createAnd();
      case SealPackage.OR: return createOr();
      case SealPackage.LEQ: return createLeq();
      case SealPackage.LESS: return createLess();
      case SealPackage.EQ: return createEq();
      case SealPackage.NEQ: return createNeq();
      case SealPackage.GEQ: return createGeq();
      case SealPackage.GTR: return createGtr();
      case SealPackage.PLUS: return createPlus();
      case SealPackage.MINUS: return createMinus();
      case SealPackage.MULTI: return createMulti();
      case SealPackage.DIV: return createDiv();
      case SealPackage.NOT: return createNot();
      case SealPackage.LITERAL: return createLiteral();
      case SealPackage.QUANTIFIER: return createQuantifier();
      case SealPackage.EXTERNAL_REFERENCE: return createExternalReference();
      case SealPackage.LOCAL_REFERENCE: return createLocalReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleDefine createModuleDefine()
  {
    ModuleDefineImpl moduleDefine = new ModuleDefineImpl();
    return moduleDefine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NDCase createNDCase()
  {
    NDCaseImpl ndCase = new NDCaseImpl();
    return ndCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Update createUpdate()
  {
    UpdateImpl update = new UpdateImpl();
    return update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment createEnvironment()
  {
    EnvironmentImpl environment = new EnvironmentImpl();
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoAction createNoAction()
  {
    NoActionImpl noAction = new NoActionImpl();
    return noAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assign createAssign()
  {
    AssignImpl assign = new AssignImpl();
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Leq createLeq()
  {
    LeqImpl leq = new LeqImpl();
    return leq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Less createLess()
  {
    LessImpl less = new LessImpl();
    return less;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Eq createEq()
  {
    EqImpl eq = new EqImpl();
    return eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Neq createNeq()
  {
    NeqImpl neq = new NeqImpl();
    return neq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Geq createGeq()
  {
    GeqImpl geq = new GeqImpl();
    return geq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gtr createGtr()
  {
    GtrImpl gtr = new GtrImpl();
    return gtr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantifier createQuantifier()
  {
    QuantifierImpl quantifier = new QuantifierImpl();
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalReference createExternalReference()
  {
    ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
    return externalReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalReference createLocalReference()
  {
    LocalReferenceImpl localReference = new LocalReferenceImpl();
    return localReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SealPackage getSealPackage()
  {
    return (SealPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SealPackage getPackage()
  {
    return SealPackage.eINSTANCE;
  }

} //SealFactoryImpl
