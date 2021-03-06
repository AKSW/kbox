package org.aksw.kbox.apple;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import org.aksw.kbox.InputStreamFactory;

/**
 * 
 * @author {@linkplain http://emarx.org}
 *
 */
public class KBox extends org.aksw.kbox.KBox {
	
	
	static {
		System.setProperty("http.agent", "Chrome");
	}
	
	/**
	 * Creates a mirror for the given file in a given {@link URL}. This function allows
	 * KBox to serve files to applications, acting as proxy to the mirrored
	 * file. The file that is published in a give {@link URL} will be located when the
	 * client execute the function {@link KBox#getResource(URL)}.
	 * 
	 * @param source the {@link URL} of the file that is going to be published at the
	 *        given URL.
	 * @param dest the {@link URL} where the file is going to be published.
	 * @param install a customized method for installation.
	 * 
	 * @throws {@link Exception} if the resource does not exist or can not be copied or some
	 *             error occurs during the resource publication.
	 */
	public static void install(URL source,
			URL dest,
			String format,
			String version,
			AppInstall install)
			throws Exception {
		install.install(source, dest, format, version);
	}
	
	/**
	 * Creates a mirror for the given file in a given {@link URL}. This function allows
	 * KBox to serve files to applications, acting as proxy to the mirrored
	 * file. The file that is published in a give {@link URL} will be located when the
	 * client execute the function {@link KBox#getResource(URL)}.
	 * 
	 * @param source the {@link URL} of the file that is going to be published at the
	 *        given URL.
	 * @param dest the {@link URL} where the file is going to be published.
	 * @param install a customized method for installation.
	 * 
	 * @throws {@link Exception} if the resource does not exist or can not be copied or some
	 *             error occurs during the resource publication.
	 */
	public static void install(
			String format,
			String version,
			AppInstall install,
			URL dest, 
			URL... sources)
			throws Exception {
		install.install(sources, dest, format, version);
	}
	
	/**
	 * Creates a mirror for the given file in a given {@link URL}. This function allows
	 * KBox to serve files to applications, acting as proxy to the mirrored
	 * file. The file that is published in a give {@link URL} will be located when the
	 * client execute the function {@link KBox#getResource(URL)}.
	 * 
	 * @param source the {@link URL} of the file that is going to be published at the
	 *        given {@link URL}.
	 * @param dest the {@link URL} where the file is going to be published.
	 * @param install a customized method for installation.
	 * 
	 * @throws {@link Exception} if the resource does not exist or can not be copied or some
	 *             error occurs during the resource publication.
	 */
	public static void install(InputStream source, 
			URL dest, 
			String format,
			String version, 
			AppInstall install)
			throws Exception {
		install.install(source, dest, format, version);	
	}
	
	/**
	 * Returns the local resource path given by the locate.
	 * 
	 * @param url the resource URL
	 * @return the local path of the resource.
	 */
	public static File locate(URL url, String format, String version, Locate locate) throws Exception  {
		return locate.locate(url, format, version);
	}
	
	/**
	 * Creates a mirror for the given file in a given {@link URL}. This function allows
	 * KBox to serve files to applications, acting as proxy to the mirrored
	 * file. The file that is published in a give {@link URL} will be located when the
	 * client execute the function {@link KBox#getResource(URL)}.
	 * 
	 * @param source the URL of the file that is going to be published at the
	 *        given {@link URL}.
	 * @param target the {@link URL} where the resource is going to be published.
	 * @param install a customized method for installation.
	 * 
	 * @throws {@link Exception} if the resource does not exist or can not be copied or some
	 *             error occurs during the resource publication.
	 */
	public static void install(URL source, 
			URL target,
			String format,
			String version,
			AppInstall install,
			InputStreamFactory isFactory)
			throws Exception {
		install.install(source, target, format, version, isFactory);
	}
	
	/**
	 * Creates a mirror for the given file in a given {@link URL}. This function allows
	 * KBox to serve files to applications, acting as proxy to the mirrored
	 * file. The file that is published in a give {@link URL} will be located when the
	 * client execute the function {@link KBox#getResource(URL)}.
	 * 
	 * @param sources the URLs of the files that are going to be published at the
	 *        given {@link URL}.
	 * @param target the {@link URL} where the resource is going to be published.
	 * @param install a customized method for installation.
	 * 
	 * @throws {@link Exception} if the resource does not exist or can not be copied or some
	 *             error occurs during the resource publication.
	 */
	public static void install(URL[] sources, 
			URL target,
			String format,
			String version,
			AppInstall install,
			InputStreamFactory isFactory)
			throws Exception {
		install.install(sources, target, format, version, isFactory);
	}

	public static void register(URL resourceName, File localPath, String format, String version) {
		
	}
}
