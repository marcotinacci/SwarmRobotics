/**
 */
package unifi.marcotinacci.thesis.seal.seal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Assign#getVariable <em>Variable</em>}</li>
 *   <li>{@link unifi.marcotinacci.thesis.seal.seal.Assign#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends Update
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
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getAssign_Variable()
   * @model
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Assign#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see unifi.marcotinacci.thesis.seal.seal.SealPackage#getAssign_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link unifi.marcotinacci.thesis.seal.seal.Assign#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // Assign
