/**
 */
package unifi.marcotinacci.thesis.seal.seal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import unifi.marcotinacci.thesis.seal.seal.Expression;
import unifi.marcotinacci.thesis.seal.seal.ModuleDefine;
import unifi.marcotinacci.thesis.seal.seal.Rule;
import unifi.marcotinacci.thesis.seal.seal.SealPackage;
import unifi.marcotinacci.thesis.seal.seal.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Define</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ModuleDefineImpl#getName <em>Name</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ModuleDefineImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ModuleDefineImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ModuleDefineImpl#getNever <em>Never</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleDefineImpl extends MinimalEObjectImpl.Container implements ModuleDefine
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> variables;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * The cached value of the '{@link #getNever() <em>Never</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNever()
   * @generated
   * @ordered
   */
  protected EList<Expression> never;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleDefineImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SealPackage.Literals.MODULE_DEFINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SealPackage.MODULE_DEFINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, SealPackage.MODULE_DEFINE__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, SealPackage.MODULE_DEFINE__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getNever()
  {
    if (never == null)
    {
      never = new EObjectContainmentEList<Expression>(Expression.class, this, SealPackage.MODULE_DEFINE__NEVER);
    }
    return never;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SealPackage.MODULE_DEFINE__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case SealPackage.MODULE_DEFINE__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
      case SealPackage.MODULE_DEFINE__NEVER:
        return ((InternalEList<?>)getNever()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SealPackage.MODULE_DEFINE__NAME:
        return getName();
      case SealPackage.MODULE_DEFINE__VARIABLES:
        return getVariables();
      case SealPackage.MODULE_DEFINE__RULES:
        return getRules();
      case SealPackage.MODULE_DEFINE__NEVER:
        return getNever();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SealPackage.MODULE_DEFINE__NAME:
        setName((String)newValue);
        return;
      case SealPackage.MODULE_DEFINE__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends VariableDeclaration>)newValue);
        return;
      case SealPackage.MODULE_DEFINE__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
        return;
      case SealPackage.MODULE_DEFINE__NEVER:
        getNever().clear();
        getNever().addAll((Collection<? extends Expression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SealPackage.MODULE_DEFINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SealPackage.MODULE_DEFINE__VARIABLES:
        getVariables().clear();
        return;
      case SealPackage.MODULE_DEFINE__RULES:
        getRules().clear();
        return;
      case SealPackage.MODULE_DEFINE__NEVER:
        getNever().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SealPackage.MODULE_DEFINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SealPackage.MODULE_DEFINE__VARIABLES:
        return variables != null && !variables.isEmpty();
      case SealPackage.MODULE_DEFINE__RULES:
        return rules != null && !rules.isEmpty();
      case SealPackage.MODULE_DEFINE__NEVER:
        return never != null && !never.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModuleDefineImpl
