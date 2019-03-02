package core;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Expression {

	public static boolean test(String testString) {
		Pattern p = Pattern.compile("[a-zA-Z]{0,4}");
		Matcher m = p.matcher(testString);
		return m.matches();
	}
	
	public static boolean test1(String testString) {
		Pattern p = Pattern.compile(".{4}");
		Matcher m = p.matcher(testString);
		return m.matches();
	}
}
