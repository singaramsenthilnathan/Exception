package Regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class RegexSplit2 
{
public static void main(String[] args) 
{
System.out.println("Enter input text:");	
Scanner sc = new Scanner(System.in);
String input=sc.nextLine();
Pattern p = Pattern.compile("\\s");
String[]str=p.split(input);
for(int i=0;i<str.length;i++)
{
	System.out.println(str[i]);
}
}
}

/* OUTPUT:
Enter input text:
Java regular expressions are very similar to the Perl programming language and very easy to learn.
Java
regular
expressions
are
very
similar
to
the
Perl
programming
language
and
very
easy
to
learn.
*/