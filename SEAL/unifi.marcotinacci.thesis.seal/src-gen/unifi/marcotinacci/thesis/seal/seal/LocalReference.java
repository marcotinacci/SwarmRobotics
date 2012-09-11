/**
 */
package unifi.marcotinacci.thesis.seal.seal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.LocalReference#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getLocalReference()
 * @model
 * @generated
 */
public interface LocalReference extends Expression
{
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
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getLocalReference_Variable()
   * @model
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.LocalReference#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

} // LocalReference
