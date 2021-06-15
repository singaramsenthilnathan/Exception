package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RajRegexMeta 
{
public static void main(String[] args) 
{
String sentence ="TamilTamilan TamilNadu 614903 !@#*)(";
//Pattern p = Pattern.compile("\\GTamil");//group
Pattern p = Pattern.compile(".");//all characters including spl characters
Matcher m = p.matcher(sentence);
while(m.find())
{
	System.out.println(m.group()+" Starts at "+m.start());
}
}
}
