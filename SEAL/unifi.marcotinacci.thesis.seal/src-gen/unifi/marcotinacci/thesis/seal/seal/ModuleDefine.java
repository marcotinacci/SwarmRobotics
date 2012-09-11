/**
 */
package unifi.marcotinacci.thesis.seal.seal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Define</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getName <em>Name</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getVariables <em>Variables</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getRules <em>Rules</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getNever <em>Never</em>}</li>
 * </ul>
 * </p>
 *
 * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getModuleDefine()
 * @model
 * @generated
 */
public interface ModuleDefine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getModuleDefine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.ModuleDefine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getModuleDefine_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getVariables();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getModuleDefine_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

  /**
   * Returns the value of the '<em><b>Never</b></em>' containment reference list.
   * The list contents are of type {@link unifi.marcotinacci.thesis.seal.seal.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Never</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Never</em>' containment reference list.
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getModuleDefine_Never()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getNever();

} // ModuleDefine
