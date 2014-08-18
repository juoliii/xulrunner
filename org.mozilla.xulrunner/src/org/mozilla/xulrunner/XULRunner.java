package org.mozilla.xulrunner;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;

public class XULRunner {

	public static final Browser createBrowser(Composite parent, int style) {
		return new Browser(parent, SWT.MOZILLA | style);
	}

}
