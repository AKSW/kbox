package org.aksw.kbox.appel;

import java.io.IOException;
import java.net.URL;

public class KBox extends org.aksw.kbox.KBox {
	/**
	 * Install the given URL in your personal Knowledge Name Service.
	 * This service will be used to Lookup Knowledge bases.
	 * 
	 * @param url the URL of the KNS (Knowledge Name Service)
	 */
	public static void installKNS(URL url) {
		KNSServerList knsServerList = new KNSServerList();
		knsServerList.add(url.toString());
	}
	
	/**
	 * Remove the given URL from your personal Knowledge Name Service.
	 * 
	 * @param url the URL of the KNS (Knowledge Name Service)
	 */
	public static void removeKNS(URL url) {
		KNSServerList knsServerList = new KNSServerList();
		knsServerList.remove(url.toString());
	}
		
	/**
	 * Resolve the given URL in the available KNS.
	 * The first KNS to be checked is the default KNS, 
	 * thereafter the user's KNS.
	 * 
	 * @param resourceURL the URL to be resolved by the KNS.
	 * @param knsServerList list of KNS servers
	 * 
	 * @return the resolved URL.
	 * 
	 * @throws IOException if any error occurs during the operation.
	 */
	public static URL resolve(KNSServerList knsServerList, URL resourceURL) throws Exception {
		KNSResolveVisitor resolveVisitor = new KNSResolveVisitor(resourceURL);
		knsServerList.visit(resolveVisitor);
		return resolveVisitor.getResolvedURL();
	}
	
	/**
	 * Resolve the given URL in the available KNS.
	 * The first KNS to be checked is the default KNS, 
	 * thereafter the user's KNS.
	 * 
	 * @param resourceURL the URL to be resolved by the KNS.
	 * @param knsServerURL the URL of the KNS Server.
	 * 
	 * @return the resolved URL.
	 * 
	 * @throws IOException if any error occurs during the operation.
	 */
	public static URL resolve(URL resourceURL, URL knsServerURL) throws Exception {
		return KNSTable.resolve(resourceURL, knsServerURL);
	}
}