package by.academy.deal;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator  {

	private static final Pattern p = Pattern.compile("\\+375((29)|(33)|(25)(44))[1-9][0-9]{6}");

	@Override
	public Pattern getPattern() {
		return p;
	}
}
