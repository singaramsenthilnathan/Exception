package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RajRegex1 
{
public static void main(String[] args) 
{
	String str ="This is an apple. These are 33(Thirty-Three) apples";
	//Pattern p =Pattern.compile("apples$");//Ending//Dollar
	//Pattern p = Pattern.compile("^This");//Beginning//Caret Symbol
	Pattern p = Pattern.compile("T|x");//Pipe Symbol//Any one
	Matcher m = p.matcher(str);
	while(m.find())
	{
		//System.out.println(m.group()+" starts at "+m.start()+" and it ends at "+ m.end());
		System.out.println(m.group()+" starts at "+m.start());
	}
}

}
