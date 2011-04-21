package org.protege.owl.codegeneration.names;

public class NamingUtilities {

	private NamingUtilities() {
	}

	public static String convertToJavaIdentifier(String s) {
		return s;
	}
	
    /** Returns the provided string with initial letter as capital
     * @param name
     * @return
     */
    public static String convertInitialLetterToUpperCase(String name) {
        if (name == null) {
            return null;
        }
        if (name.length() > 1) {
            return Character.toUpperCase(name.charAt(0)) + name.substring(1);
        } else {
            return name.toUpperCase();
        }
    }
}