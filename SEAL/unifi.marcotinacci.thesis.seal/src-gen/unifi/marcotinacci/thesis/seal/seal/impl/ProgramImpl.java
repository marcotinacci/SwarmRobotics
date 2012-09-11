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

import unifi.marcotinacci.thesis.seal.seal.Action;
import unifi.marcotinacci.thesis.seal.seal.Environment;
import unifi.marcotinacci.thesis.seal.seal.ModuleDefine;
import unifi.marcotinacci.thesis.seal.seal.Program;
import unifi.marcotinacci.thesis.seal.seal.Range;
import unifi.marcotinacci.thesis.seal.seal.SealPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ProgramImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ProgramImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ProgramImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ProgramImpl#isIsEmptyEnv <em>Is Empty Env</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ProgramImpl#getRanges <em>Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModules()
   * @generated
   * @ordered
   */
  protected EList<ModuleDefine> modules;

  /**
   * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironment()
   * @generated
   * @ordered
   */
  protected Environment environment;

  /**
   * The default value of the '{@link #isIsEmptyEnv() <em>Is Empty Env</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsEmptyEnv()
   * @generated
   * @ordered
   */
  protected static final boolean IS_EMPTY_ENV_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsEmptyEnv() <em>Is Empty Env</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsEmptyEnv()
   * @generated
   * @ordered
   */
  protected boolean isEmptyEnv = IS_EMPTY_ENV_EDEFAULT;

  /**
   * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRanges()
   * @generated
   * @ordered
   */
  protected EList<Range> ranges;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return SealPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, SealPackage.PROGRAM__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModuleDefine> getModules()
  {
    if (modules == null)
    {
      modules = new EObjectContainmentEList<ModuleDefine>(ModuleDefine.class, this, SealPackage.PROGRAM__MODULES);
    }
    return modules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment getEnvironment()
  {
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs)
  {
    Environment oldEnvironment = environment;
    environment = newEnvironment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SealPackage.PROGRAM__ENVIRONMENT, oldEnvironment, newEnvironment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnvironment(Environment newEnvironment)
  {
    if (newEnvironment != environment)
    {
      NotificationChain msgs = null;
      if (environment != null)
        msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SealPackage.PROGRAM__ENVIRONMENT, null, msgs);
      if (newEnvironment != null)
        msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SealPackage.PROGRAM__ENVIRONMENT, null, msgs);
      msgs = basicSetEnvironment(newEnvironment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SealPackage.PROGRAM__ENVIRONMENT, newEnvironment, newEnvironment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsEmptyEnv()
  {
    return isEmptyEnv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsEmptyEnv(boolean newIsEmptyEnv)
  {
    boolean oldIsEmptyEnv = isEmptyEnv;
    isEmptyEnv = newIsEmptyEnv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SealPackage.PROGRAM__IS_EMPTY_ENV, oldIsEmptyEnv, isEmptyEnv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Range> getRanges()
  {
    if (ranges == null)
    {
      ranges = new EObjectContainmentEList<Range>(Range.class, this, SealPackage.PROGRAM__RANGES);
    }
    return ranges;
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
      case SealPackage.PROGRAM__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case SealPackage.PROGRAM__MODULES:
        return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
      case SealPackage.PROGRAM__ENVIRONMENT:
        return basicSetEnvironment(null, msgs);
      case SealPackage.PROGRAM__RANGES:
        return ((InternalEList<?>)getRanges()).basicRemove(otherEnd, msgs);
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
      case SealPackage.PROGRAM__ACTIONS:
        return getActions();
      case SealPackage.PROGRAM__MODULES:
        return getModules();
      case SealPackage.PROGRAM__ENVIRONMENT:
        return getEnvironment();
      case SealPackage.PROGRAM__IS_EMPTY_ENV:
        return isIsEmptyEnv();
      case SealPackage.PROGRAM__RANGES:
        return getRanges();
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
      case SealPackage.PROGRAM__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
        return;
      case SealPackage.PROGRAM__MODULES:
        getModules().clear();
        getModules().addAll((Collection<? extends ModuleDefine>)newValue);
        return;
      case SealPackage.PROGRAM__ENVIRONMENT:
        setEnvironment((Environment)newValue);
        return;
      case SealPackage.PROGRAM__IS_EMPTY_ENV:
        setIsEmptyEnv((Boolean)newValue);
        return;
      case SealPackage.PROGRAM__RANGES:
        getRanges().clear();
        getRanges().addAll((Collection<? extends Range>)newValue);
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
      case SealPackage.PROGRAM__ACTIONS:
        getActions().clear();
        return;
      case SealPackage.PROGRAM__MODULES:
        getModules().clear();
        return;
      case SealPackage.PROGRAM__ENVIRONMENT:
        setEnvironment((Environment)null);
        return;
      case SealPackage.PROGRAM__IS_EMPTY_ENV:
        setIsEmptyEnv(IS_EMPTY_ENV_EDEFAULT);
        return;
      case SealPackage.PROGRAM__RANGES:
        getRanges().clear();
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
      case SealPackage.PROGRAM__ACTIONS:
        return actions != null && !actions.isEmpty();
      case SealPackage.PROGRAM__MODULES:
        return modules != null && !modules.isEmpty();
      case SealPackage.PROGRAM__ENVIRONMENT:
        return environment != null;
      case SealPackage.PROGRAM__IS_EMPTY_ENV:
        return isEmptyEnv != IS_EMPTY_ENV_EDEFAULT;
      case SealPackage.PROGRAM__RANGES:
        return ranges != null && !ranges.isEmpty();
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
    result.append(" (isEmptyEnv: ");
    result.append(isEmptyEnv);
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
