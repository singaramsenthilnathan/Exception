package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RajRegQuanti 
{
public static void main(String[] args) 
{
String sentence="abaabbaaabbbabab";
//Pattern p = Pattern.compile("a");
//Pattern p = Pattern.compile("a+");
//Pattern p = Pattern.compile("a*");
Pattern p = Pattern.compile("c?");
//Pattern p = Pattern.compile("a{2}");
//Pattern p = Pattern.compile("a{1,3}");
Matcher m =p.matcher(sentence);
while(m.find())
{
System.out.println(m.group()+" starts at "+m.start());
}
}

}
