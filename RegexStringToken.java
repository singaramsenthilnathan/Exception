package Regex;

import java.util.StringTokenizer;

public class RegexStringToken 
{
public static void main(String[] args) 
{
//StringTokenizer stz = new StringTokenizer("Raja Peravurani");
//StringTokenizer stz = new StringTokenizer("www.payilagam.com",".");
//StringTokenizer stz = new StringTokenizer("01-01-1991","-");
	StringTokenizer stz = new StringTokenizer("01-01-1991","-",true);
//System.out.println("Count of Tokens :"+ stz.countTokens());
while(stz.hasMoreTokens())
{
	System.out.println(stz.nextToken());
}
}

}
