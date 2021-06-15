package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SingRegex1 
{
public static void main(String[] args) 
{
String s ="Today's temperature in Chennai is 35°c.Day's maximum temperature would hover at 37°c, while minimum temperature is predicted to be 28°c.";
//Pattern p = Pattern.compile(".");//[0-9]-all characters to print including spl characters
//Pattern p = Pattern.compile("\\d");//[^0-9]-Only Digits to Print
//Pattern p = Pattern.compile("\\D");//Except Digits,Other Charcters and Spl Characters are to Print.
//Pattern p = Pattern.compile("\\h");//Only Spacing to Print
//Pattern p = Pattern.compile("\\H");//[^\h]-Except Spacing,Remainning All Characters are to Print.
//Pattern p = Pattern.compile("\\s");//Only Spacing to Print
//Pattern p = Pattern.compile("\\S");//Except Spacing,Remainning All Characters are to Print.
//Pattern p = Pattern.compile("\\v");//Vertical Whitespace Character.
//Pattern p = Pattern.compile("\\V");//A non-vertical whitespace character: [^\v]
//Pattern p = Pattern.compile("\\w");//A word character: [a-zA-Z_0-9]//Spl Character not Allowed
Pattern p = Pattern.compile("\\W");//Spacing and Spl Characters only Allowed.//	A non-word character: [^\w].

Matcher m =p.matcher(s);
while(m.find())
{
	System.out.println(m.group()+" Starts at "+m.start()+" and Ends at "+ m.end());
}
}
}
