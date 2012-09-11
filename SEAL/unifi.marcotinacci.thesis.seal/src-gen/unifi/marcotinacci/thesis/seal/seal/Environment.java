/**
 */
package unifi.marcotinacci.thesis.seal.seal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Environment#getModules <em>Modules</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Environment#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject
{
  /**
   * Returns the value of the '<em><b>Modules</b></em>' reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modules</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modules</em>' reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getEnvironment_Modules()
   * @model
   * @generated
   */
  EList<ModuleDefine> getModules();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getEnvironment_Actions()
   * @model
   * @generated
   */
  EList<Action> getActions();

} // Environment
