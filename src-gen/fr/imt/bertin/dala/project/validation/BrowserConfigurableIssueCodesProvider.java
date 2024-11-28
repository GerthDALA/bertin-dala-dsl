/*
 * generated by Xtext 2.36.0
 */
package fr.imt.bertin.dala.project.validation;

import org.eclipse.xtext.preferences.PreferenceKey;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.ConfigurableIssueCodesProvider;
import org.eclipse.xtext.validation.SeverityConverter;

public class BrowserConfigurableIssueCodesProvider extends ConfigurableIssueCodesProvider {
	protected static final String ISSUE_CODE_PREFIX = "fr.imt.bertin.dala.project.";

	public static final String DEPRECATED_MODEL_PART = ISSUE_CODE_PREFIX + "deprecatedModelPart";

	@Override
	protected void initialize(IAcceptor<PreferenceKey> acceptor) {
		super.initialize(acceptor);
		acceptor.accept(create(DEPRECATED_MODEL_PART, SeverityConverter.SEVERITY_WARNING));
	}
}
