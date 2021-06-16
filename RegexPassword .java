package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexPassword 
{
public static void main(String[] args) 
{
System.out.println("Enter Your Password:");
Scanner sc = new Scanner(System.in);
String password =sc.nextLine();
Pattern p = Pattern.compile("(?=.*[a-z])+(?=.*[A-Z])+(?=.*[0-9])+(?=.*[$@])+(?=.\\S)+(?=.{8})");
Matcher m =p.matcher(password);
if(m.find())
{
if(password.length()<9)
{
System.out.println("PROCEED");
}
}
else
{
System.out.println("Incorrect Password");
}
}
}
