package org.aksw.kbox.kns;

import org.aksw.kbox.apple.BZ2AppInstall;
import org.aksw.kbox.apple.GZipAppInstall;
import org.aksw.kbox.apple.ResourceAppInstall;
import org.aksw.kbox.apple.ZipAppInstall;

public class DefaultInstallFactory extends InstallFactory {

	public DefaultInstallFactory() {
		put("kb", new ZipAppInstall());
		put("bz2", new BZ2AppInstall());
		put("gzip", new GZipAppInstall());
		put("zip", new ZipAppInstall());
		put("plain", new ResourceAppInstall());
	}

}