/**
 */
package unifi.marcotinacci.thesis.seal.seal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Program#getActions <em>Actions</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Program#getModules <em>Modules</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Program#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Program#isIsEmptyEnv <em>Is Empty Env</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Program#getRanges <em>Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getProgram_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

  /**
   * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modules</em>' containment reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getProgram_Modules()
   * @model containment="true"
   * @generated
   */
  EList<ModuleDefine> getModules();

  /**
   * Returns the value of the '<em><b>Environment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Environment</em>' containment reference.
   * @see #setEnvironment(Environment)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getProgram_Environment()
   * @model containment="true"
   * @generated
   */
  Environment getEnvironment();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Program#getEnvironment <em>Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Environment</em>' containment reference.
   * @see #getEnvironment()
   * @generated
   */
  void setEnvironment(Environment value);

  /**
   * Returns the value of the '<em><b>Is Empty Env</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Empty Env</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Empty Env</em>' attribute.
   * @see #setIsEmptyEnv(boolean)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getProgram_IsEmptyEnv()
   * @model
   * @generated
   */
  boolean isIsEmptyEnv();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Program#isIsEmptyEnv <em>Is Empty Env</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Empty Env</em>' attribute.
   * @see #isIsEmptyEnv()
   * @generated
   */
  void setIsEmptyEnv(boolean value);

  /**
   * Returns the value of the '<em><b>Ranges</b></em>' containment reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.Range}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ranges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ranges</em>' containment reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getProgram_Ranges()
   * @model containment="true"
   * @generated
   */
  EList<Range> getRanges();

} // Program
