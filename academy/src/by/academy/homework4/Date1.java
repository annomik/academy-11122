package by.academy.homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date1 {
		  
	  public boolean check(String testString){  
	        Pattern pattern = Pattern.compile("(0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-([1-2]\\d\\d\\d)");	        					 
	        Matcher matcher = pattern.matcher(testString);
	        return matcher.matches();
	      } 
}
