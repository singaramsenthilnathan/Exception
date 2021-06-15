package Regex;

import java.util.regex.Pattern;

public class RajRegexSplit 
{
public static void main(String[] args) 
{
String sentence ="Payilagam Chennai Tamil Nadu";
String sentence2="www.payilagam.com";
String[] st = sentence.split("\\s");
String[]st2=sentence2.split("\\.");
for(int i=0;i<st2.length;i++)
{
	//System.out.println(st2[i]);
}

//Pattern p = Pattern.compile("\\.");
Pattern p = Pattern.compile("a");
String[]st3=p.split(sentence);
for(int i=0;i<st3.length;i++)
{
	System.out.println(st3[i]);
}
}

}
