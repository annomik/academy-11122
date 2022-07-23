package by.academy.deal;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	private static final Pattern p = Pattern.compile("(\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6})");

	@Override
	public Pattern getPattern() {
		return p;
	}
}
