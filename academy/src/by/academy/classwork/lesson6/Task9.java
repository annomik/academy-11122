package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9{
    public static void main(String[] args){
        System.out.println(test("google.com"));
        System.out.println(test("reference1.by"));
        System.out.println(test("reference1.org"));

    }
    public static boolean test(String testString){
        Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|org)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();

    }
    
}   
