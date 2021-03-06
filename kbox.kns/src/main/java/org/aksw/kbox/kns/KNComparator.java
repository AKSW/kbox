package org.aksw.kbox.kns;

public class KNComparator {
	
	public final static String NAME = "NAME";
	public final static String VERSION = "VERSION";
	public final static String FORMAT = "FORMAT";
	
	
	public static boolean equals (KN kn, String[]... params) {
		boolean equals = false;
		for(String[] param : params) {
			String paramName = param[0];
			String paramValue = param[1];
			if(NAME.equals(paramName)) {
				equals = compare(kn.getName(), paramValue);
			} else if (VERSION.equals(paramName)) {
				equals = compare(kn.getVersion(), paramValue);
			} else if (FORMAT.equals(paramName)) {
				equals = compare(kn.getFormat(), paramValue);
			}
			if(!equals) {
				return false;
			}
		}
		return equals;
	}
	
	private static boolean compare(Object o1, Object o2) {
		return (o1 == o2 || (o1 != null && o1.equals(o2)));
	}
}
