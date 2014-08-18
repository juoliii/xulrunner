package org.mozilla.xulrunner.impl;

import java.io.File;
import java.net.URI;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.osgi.service.urlconversion.URLConverter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {

		URL resource = context.getBundle().getResource("xulrunner");
		URI uri = FileLocator.toFileURL(
				resource).toURI();

		System.setProperty("org.eclipse.swt.browser.XULRunnerPath", new File(
				uri).getAbsolutePath());

	}

	public void stop(BundleContext context) throws Exception {
	}

}
