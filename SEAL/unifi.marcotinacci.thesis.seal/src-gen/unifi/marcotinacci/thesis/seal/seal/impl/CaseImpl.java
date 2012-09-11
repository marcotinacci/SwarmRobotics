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

import unifi.marcotinacci.thesis.seal.seal.Case;
import unifi.marcotinacci.thesis.seal.seal.Expression;
import unifi.marcotinacci.thesis.seal.seal.SealPackage;
import unifi.marcotinacci.thesis.seal.seal.Update;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.CaseImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.CaseImpl#isHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.CaseImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.CaseImpl#getUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseImpl extends MinimalEObjectImpl.Container implements Case
{
  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected Expression weight;

  /**
   * The default value of the '{@link #isHasCondition() <em>Has Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasCondition()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_CONDITION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasCondition() <em>Has Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasCondition()
   * @generated
   * @ordered
   */
  protected boolean hasCondition = HAS_CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected Expression cond;

  /**
   * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdate()
   * @generated
   * @ordered
   */
  protected EList<Update> update;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseImpl()
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
    return SealPackage.Literals.CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWeight(Expression newWeight, NotificationChain msgs)
  {
    Expression oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SealPackage.CASE__WEIGHT, oldWeight, newWeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeight(Expression newWeight)
  {
    if (newWeight != weight)
    {
      NotificationChain msgs = null;
      if (weight != null)
        msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SealPackage.CASE__WEIGHT, null, msgs);
      if (newWeight != null)
        msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SealPackage.CASE__WEIGHT, null, msgs);
      msgs = basicSetWeight(newWeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SealPackage.CASE__WEIGHT, newWeight, newWeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasCondition()
  {
    return hasCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasCondition(boolean newHasCondition)
  {
    boolean oldHasCondition = hasCondition;
    hasCondition = newHasCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SealPackage.CASE__HAS_CONDITION, oldHasCondition, hasCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(Expression newCond, NotificationChain msgs)
  {
    Expression oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SealPackage.CASE__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(Expression newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SealPackage.CASE__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SealPackage.CASE__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SealPackage.CASE__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Update> getUpdate()
  {
    if (update == null)
    {
      update = new EObjectContainmentEList<Update>(Update.class, this, SealPackage.CASE__UPDATE);
    }
    return update;
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
      case SealPackage.CASE__WEIGHT:
        return basicSetWeight(null, msgs);
      case SealPackage.CASE__COND:
        return basicSetCond(null, msgs);
      case SealPackage.CASE__UPDATE:
        return ((InternalEList<?>)getUpdate()).basicRemove(otherEnd, msgs);
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
      case SealPackage.CASE__WEIGHT:
        return getWeight();
      case SealPackage.CASE__HAS_CONDITION:
        return isHasCondition();
      case SealPackage.CASE__COND:
        return getCond();
      case SealPackage.CASE__UPDATE:
        return getUpdate();
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
      case SealPackage.CASE__WEIGHT:
        setWeight((Expression)newValue);
        return;
      case SealPackage.CASE__HAS_CONDITION:
        setHasCondition((Boolean)newValue);
        return;
      case SealPackage.CASE__COND:
        setCond((Expression)newValue);
        return;
      case SealPackage.CASE__UPDATE:
        getUpdate().clear();
        getUpdate().addAll((Collection<? extends Update>)newValue);
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
      case SealPackage.CASE__WEIGHT:
        setWeight((Expression)null);
        return;
      case SealPackage.CASE__HAS_CONDITION:
        setHasCondition(HAS_CONDITION_EDEFAULT);
        return;
      case SealPackage.CASE__COND:
        setCond((Expression)null);
        return;
      case SealPackage.CASE__UPDATE:
        getUpdate().clear();
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
      case SealPackage.CASE__WEIGHT:
        return weight != null;
      case SealPackage.CASE__HAS_CONDITION:
        return hasCondition != HAS_CONDITION_EDEFAULT;
      case SealPackage.CASE__COND:
        return cond != null;
      case SealPackage.CASE__UPDATE:
        return update != null && !update.isEmpty();
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
    result.append(" (hasCondition: ");
    result.append(hasCondition);
    result.append(')');
    return result.toString();
  }

} //CaseImpl
