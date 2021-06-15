package Regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMobile
{
public static void main(String[] args) throws FileNotFoundException 
{
File f =new File("F:\\Methods\\test\\Raja.txt");
if(!f.exists());
f.mkdir();
Scanner sc = new Scanner(f);
boolean linePresent=sc.hasNext();
while(linePresent)
{
	String word=sc.next();
	int i = word.lastIndexOf("-");
	String mobile=word.substring(i+1);
	
	Pattern p =Pattern.compile("(0|91)?[6-9][0-9]{9}");
	Matcher m=p.matcher(mobile);
	if(m.find())
	{
		System.out.println(m.group()+ " is valid mobile no");
	}
	else
	{
		System.out.println(mobile + " is not valid mobile no");
		linePresent=sc.hasNext();
	}
}

}
}
