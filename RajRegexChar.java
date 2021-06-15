package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RajRegexChar 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter input text: ");
String input=sc.nextLine();
//Pattern p = Pattern.compile("aj");
//Pattern p = Pattern.compile("[aj]");
//Pattern p = Pattern.compile("[^aj]");
//Pattern p = Pattern.compile("[a-z]");
//Pattern p = Pattern.compile("[A-Z]");
//Pattern p = Pattern.compile("[a-zA-Z]");
//Pattern p = Pattern.compile("[0-9]");
//Pattern p = Pattern.compile("[a-zA-Z0-9]");
Pattern p = Pattern.compile("[^a-zA-Z0-9]");//checking for spacing
Matcher m =p.matcher(input);
while(m.find())
{
	System.out.println(m.group()+" starts at "+m.start());	
}
}
}

/* OUTPUT 1:
Enter input text: 
Raja

aj
*/

/*OUTPUT 2:
Enter input text: 
Raja

a
j
a
*/

/* OUTPUT 3:

Enter input text: 

Raja
R starts at 0

*/

/* OUTPUT 4:

Enter input text: 
A regular expression is a sequence of characters that forms a search pattern.

r starts at 2
e starts at 3
g starts at 4
u starts at 5
l starts at 6
a starts at 7
r starts at 8
e starts at 10
x starts at 11
p starts at 12
r starts at 13
e starts at 14
s starts at 15
s starts at 16
i starts at 17
o starts at 18
n starts at 19
i starts at 21
s starts at 22
a starts at 24
s starts at 26
e starts at 27
q starts at 28
u starts at 29
e starts at 30
n starts at 31
c starts at 32
e starts at 33
o starts at 35
f starts at 36
c starts at 38
h starts at 39
a starts at 40
r starts at 41
a starts at 42
c starts at 43
t starts at 44
e starts at 45
r starts at 46
s starts at 47
t starts at 49
h starts at 50
a starts at 51
t starts at 52
f starts at 54
o starts at 55
r starts at 56
m starts at 57
s starts at 58
a starts at 60
s starts at 62
e starts at 63
a starts at 64
r starts at 65
c starts at 66
h starts at 67
p starts at 69
a starts at 70
t starts at 71
t starts at 72
e starts at 73
r starts at 74
n starts at 75
*/

/* OUTPUT 5:

Enter input text: 
A regular expression is a sequence of characters that forms a search pattern.

A starts at 0
*/

/* OUTPUT 6:

Enter input text: 
A regular expression is a sequence of characters that forms a search pattern.
A starts at 0
r starts at 2
e starts at 3
g starts at 4
u starts at 5
l starts at 6
a starts at 7
r starts at 8
e starts at 10
x starts at 11
p starts at 12
r starts at 13
e starts at 14
s starts at 15
s starts at 16
i starts at 17
o starts at 18
n starts at 19
i starts at 21
s starts at 22
a starts at 24
s starts at 26
e starts at 27
q starts at 28
u starts at 29
e starts at 30
n starts at 31
c starts at 32
e starts at 33
o starts at 35
f starts at 36
c starts at 38
h starts at 39
a starts at 40
r starts at 41
a starts at 42
c starts at 43
t starts at 44
e starts at 45
r starts at 46
s starts at 47
t starts at 49
h starts at 50
a starts at 51
t starts at 52
f starts at 54
o starts at 55
r starts at 56
m starts at 57
s starts at 58
a starts at 60
s starts at 62
e starts at 63
a starts at 64
r starts at 65
c starts at 66
h starts at 67
p starts at 69
a starts at 70
t starts at 71
t starts at 72
e starts at 73
r starts at 74
n starts at 75
*/

/* OUTPUT 7:
  
Enter input text: 
Raja Id is 111740
1 starts at 11
1 starts at 12
1 starts at 13
7 starts at 14
4 starts at 15
0 starts at 16
*/

/* OUTPUT 8:
 
Enter input text: 
Raj Id is 111740
R starts at 0
a starts at 1
j starts at 2
I starts at 4
d starts at 5
i starts at 7
s starts at 8
1 starts at 10
1 starts at 11
1 starts at 12
7 starts at 13
4 starts at 14
0 starts at 15
*/

/* OUTPUT 9:

Enter input text: 
1117111%$#^
% starts at 7
$ starts at 8
# starts at 9
^ starts at 10
*/