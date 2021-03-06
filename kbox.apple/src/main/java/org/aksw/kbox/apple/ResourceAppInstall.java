package org.aksw.kbox.apple;

import java.io.File;
import java.io.InputStream;

import org.aksw.kbox.utils.StreamUtils;

/**
 * 
 * @author {@linkplain http://emarx.org}
 *
 */
public class ResourceAppInstall extends AbstractAppInstall {	
	@Override
	public void install(InputStream source, File target) throws Exception {
		StreamUtils.stream(source, target);
	}
}