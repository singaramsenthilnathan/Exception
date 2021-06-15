package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RajRegex 
{
public static void main(String[] args) 
{
String str ="This is an apple. These are 33(Thirty-Three) apples";
Pattern p =Pattern.compile("Th");
Matcher m=p.matcher(str);
int count=0;
while(m.find())
{
	count++;
	System.out.println(m.group()+" Starts at "+m.start()+" and Ends at "+m.end());
}
System.out.println("Th appears "+ count + " times ");
}

}
