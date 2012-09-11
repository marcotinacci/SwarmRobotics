/**
 */
package unifi.marcotinacci.thesis.seal.seal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Case#getWeight <em>Weight</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Case#isHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Case#getCond <em>Cond</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Case#getUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject
{
  /**
   * Returns the value of the '<em><b>Weight</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' containment reference.
   * @see #setWeight(Expression)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getCase_Weight()
   * @model containment="true"
   * @generated
   */
  Expression getWeight();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Case#getWeight <em>Weight</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' containment reference.
   * @see #getWeight()
   * @generated
   */
  void setWeight(Expression value);

  /**
   * Returns the value of the '<em><b>Has Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Condition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Condition</em>' attribute.
   * @see #setHasCondition(boolean)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getCase_HasCondition()
   * @model
   * @generated
   */
  boolean isHasCondition();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Case#isHasCondition <em>Has Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Condition</em>' attribute.
   * @see #isHasCondition()
   * @generated
   */
  void setHasCondition(boolean value);

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
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getCase_Cond()
   * @model containment="true"
   * @generated
   */
  Expression getCond();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Case#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expression value);

  /**
   * Returns the value of the '<em><b>Update</b></em>' containment reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.Update}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update</em>' containment reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getCase_Update()
   * @model containment="true"
   * @generated
   */
  EList<Update> getUpdate();

} // Case
