package by.academy.deal;

import java.util.regex.Pattern;

public interface Validator {
	
				
		default boolean isValid(String s) {
			return getPattern().matcher(s).matches();
		}
		Pattern getPattern();
}
