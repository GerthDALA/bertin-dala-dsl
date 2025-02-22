/**
 * generated by Xtext 2.36.0
 */
package fr.imt.bertin.dala.project.browser;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Checkboxes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imt.bertin.dala.project.browser.CheckCheckboxes#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see fr.imt.bertin.dala.project.browser.BrowserPackage#getCheckCheckboxes()
 * @model
 * @generated
 */
public interface CheckCheckboxes extends Statement
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' attribute list.
   * @see fr.imt.bertin.dala.project.browser.BrowserPackage#getCheckCheckboxes_Items()
   * @model unique="false"
   * @generated
   */
  EList<String> getItems();

} // CheckCheckboxes
