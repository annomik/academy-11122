package by.academy.deal;

import java.util.regex.Pattern;

   public class AmericanPhoneValidator implements Validator {
	   private static final Pattern p = Pattern.compile("\\+1\\d{10}");

	   public Pattern getPattern() {
		   return p;
	}
}
