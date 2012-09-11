/**
 */
package unifi.marcotinacci.thesis.seal.seal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ND Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.NDCase#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getNDCase()
 * @model
 * @generated
 */
public interface NDCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.Case}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getNDCase_Cases()
   * @model containment="true"
   * @generated
   */
  EList<Case> getCases();

} // NDCase
