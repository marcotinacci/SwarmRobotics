/**
 */
package unifi.marcotinacci.thesis.seal.seal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import unifi.marcotinacci.thesis.seal.seal.ExternalReference;
import unifi.marcotinacci.thesis.seal.seal.Quantifier;
import unifi.marcotinacci.thesis.seal.seal.SealPackage;
import unifi.marcotinacci.thesis.seal.seal.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ExternalReferenceImpl#getModule <em>Module</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.impl.ExternalReferenceImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalReferenceImpl extends ExpressionImpl implements ExternalReference
{
  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected Quantifier module;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VariableDeclaration variable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalReferenceImpl()
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
    return SealPackage.Literals.EXTERNAL_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantifier getModule()
  {
    if (module != null && module.eIsProxy())
    {
      InternalEObject oldModule = (InternalEObject)module;
      module = (Quantifier)eResolveProxy(oldModule);
      if (module != oldModule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SealPackage.EXTERNAL_REFERENCE__MODULE, oldModule, module));
      }
    }
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantifier basicGetModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModule(Quantifier newModule)
  {
    Quantifier oldModule = module;
    module = newModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SealPackage.EXTERNAL_REFERENCE__MODULE, oldModule, module));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (VariableDeclaration)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SealPackage.EXTERNAL_REFERENCE__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(VariableDeclaration newVariable)
  {
    VariableDeclaration oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SealPackage.EXTERNAL_REFERENCE__VARIABLE, oldVariable, variable));
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
      case SealPackage.EXTERNAL_REFERENCE__MODULE:
        if (resolve) return getModule();
        return basicGetModule();
      case SealPackage.EXTERNAL_REFERENCE__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SealPackage.EXTERNAL_REFERENCE__MODULE:
        setModule((Quantifier)newValue);
        return;
      case SealPackage.EXTERNAL_REFERENCE__VARIABLE:
        setVariable((VariableDeclaration)newValue);
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
      case SealPackage.EXTERNAL_REFERENCE__MODULE:
        setModule((Quantifier)null);
        return;
      case SealPackage.EXTERNAL_REFERENCE__VARIABLE:
        setVariable((VariableDeclaration)null);
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
      case SealPackage.EXTERNAL_REFERENCE__MODULE:
        return module != null;
      case SealPackage.EXTERNAL_REFERENCE__VARIABLE:
        return variable != null;
    }
    return super.eIsSet(featureID);
  }

} //ExternalReferenceImpl
