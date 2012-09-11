/**
 */
package unifi.marcotinacci.thesis.seal.seal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Rule#getCond <em>Cond</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Rule#getAction <em>Action</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Rule#getNdCases <em>Nd Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expression)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getRule_Cond()
   * @model containment="true"
   * @generated
   */
  Expression getCond();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Rule#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expression value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Action)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getRule_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Rule#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Nd Cases</b></em>' containment reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.NDCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nd Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nd Cases</em>' containment reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getRule_NdCases()
   * @model containment="true"
   * @generated
   */
  EList<NDCase> getNdCases();

} // Rule
