package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SingRegex 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	String input =sc.nextLine();
String s = "Your Future Is Created By What You Do Today,Not Tomorrow";
//Pattern p = Pattern.compile(" ");// to check spacing
//Pattern p = Pattern.compile("[abc]");//to check abc letters
//Pattern p = Pattern.compile("[^abc]");//remainning letters,not allowed capital & numeric letters.
//Pattern p = Pattern.compile("[a-zA-Z]");//to check abc & ABC letters
//Pattern p = Pattern.compile("[a-d[m-p]]");//a through d, or m through p: [a-dm-p] (union)
//Pattern p = Pattern.compile("[[a-z&&[def]]]");//d, e, or f (intersection)//only small letters.
//Pattern p = Pattern.compile("[a-z&&[^ur]]");//a-z&&[^bc]//a through z, except for b and c: [ad-z] (subtraction)
Pattern p = Pattern.compile("[a-z&&[^m-p]]");//Except m,n,o,p;Remainning Small Letters Allowed.
Matcher m =p.matcher(s);
//System.out.println(m.find());
int count =0;
while(m.find())
{
count++;
System.out.println(m.group()+" Starts at "+m.start()+" and Ends at "+m.end());
}

System.out.println(input +" appears "+ count + " times ");
}

}

/* OUTPUT 1:
 
  :true
 :8
*/

/* OUTPUT 2:
abc
true
a Starts at 28 and Ends at 29
a Starts at 41 and Ends at 42
abc appears 2 times 
*/
