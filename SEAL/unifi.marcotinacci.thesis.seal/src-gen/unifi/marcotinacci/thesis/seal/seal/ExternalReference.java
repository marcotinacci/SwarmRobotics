/**
 */
package unifi.marcotinacci.thesis.seal.seal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.ExternalReference#getModule <em>Module</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.ExternalReference#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getExternalReference()
 * @model
 * @generated
 */
public interface ExternalReference extends Expression
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
   * @see #setModule(Quantifier)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getExternalReference_Module()
   * @model
   * @generated
   */
  Quantifier getModule();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.ExternalReference#getModule <em>Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' reference.
   * @see #getModule()
   * @generated
   */
  void setModule(Quantifier value);

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
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getExternalReference_Variable()
   * @model
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.ExternalReference#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

} // ExternalReference
