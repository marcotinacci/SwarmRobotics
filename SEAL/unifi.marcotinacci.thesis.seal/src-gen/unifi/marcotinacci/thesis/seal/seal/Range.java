/**
 */
package unifi.marcotinacci.thesis.seal.seal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Range#getModule <em>Module</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Range#getVariable <em>Variable</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Range#getFrom <em>From</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Range#getTo <em>To</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Range#getDelta <em>Delta</em>}</li>
 * </ul>
 * </p>
 *
 * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends EObject
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' reference.
   * @see #setModule(ModuleDefine)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getRange_Module()
   * @model
   * @generated
   */
  ModuleDefine getModule();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Range#getModule <em>Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' reference.
   * @see #getModule()
   * @generated
   */
  void setModule(ModuleDefine value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(VariableDeclaration)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getRange_Variable()
   * @model
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Range#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getRange_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Range#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(String)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getRange_To()
   * @model
   * @generated
   */
  String getTo();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Range#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(String value);

  /**
   * Returns the value of the '<em><b>Delta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delta</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delta</em>' attribute.
   * @see #setDelta(String)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getRange_Delta()
   * @model
   * @generated
   */
  String getDelta();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Range#getDelta <em>Delta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delta</em>' attribute.
   * @see #getDelta()
   * @generated
   */
  void setDelta(String value);

} // Range
