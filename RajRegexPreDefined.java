package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RajRegexPreDefined 
{
public static void main(String[] args) 
{
	//String sentence =" $ Cumulatively, 25,48,49,301 COVID-19 vaccine doses have been administered so far under the nationwide vaccination drive.";
	//String sentence ="Failure is not the Opposite of Success.It's Part of Success";
	String sentence ="Repetition of Words,The last Word of a clause or sentence is repeated as the first Word of the next one.";	
	//Pattern p =Pattern.compile("vaccin");
	//Pattern p =Pattern.compile("\\s");
	//Pattern p =Pattern.compile("\\S");
	//Pattern p =Pattern.compile("\\d");
	//Pattern p =Pattern.compile("\\D");
	//Pattern p =Pattern.compile("\\w");
	//Pattern p =Pattern.compile("\\W");
	//Pattern p =Pattern.compile("\\bSuccess");
	//Pattern p =Pattern.compile("\\bSuccess\\b");
	Pattern p =Pattern.compile("Word\\B");
	Matcher m = p.matcher(sentence);
	while(m.find())
	{
		System.out.println(m.group()+" Starts at "+m.start());
	}
}
}

/* OUTPUT 1:
vaccin Starts at 36
vaccin Starts at 101
*/

/*OUTPUT 2:
Starts at 13
Starts at 26
Starts at 35
Starts at 43
Starts at 49
Starts at 54
Starts at 59
Starts at 72
Starts at 75
Starts at 79
Starts at 85
Starts at 89
Starts at 100
Starts at 112
*/

/* OUTPUT 3:
C Starts at 0
u Starts at 1
m Starts at 2
u Starts at 3
l Starts at 4
a Starts at 5
t Starts at 6
i Starts at 7
v Starts at 8
e Starts at 9
l Starts at 10
y Starts at 11
, Starts at 12
2 Starts at 14
5 Starts at 15
, Starts at 16
4 Starts at 17
8 Starts at 18
, Starts at 19
4 Starts at 20
9 Starts at 21
, Starts at 22
3 Starts at 23
0 Starts at 24
1 Starts at 25
C Starts at 27
O Starts at 28
V Starts at 29
I Starts at 30
D Starts at 31
- Starts at 32
1 Starts at 33
9 Starts at 34
v Starts at 36
a Starts at 37
c Starts at 38
c Starts at 39
i Starts at 40
n Starts at 41
e Starts at 42
d Starts at 44
o Starts at 45
s Starts at 46
e Starts at 47
s Starts at 48
h Starts at 50
a Starts at 51
v Starts at 52
e Starts at 53
b Starts at 55
e Starts at 56
e Starts at 57
n Starts at 58
a Starts at 60
d Starts at 61
m Starts at 62
i Starts at 63
n Starts at 64
i Starts at 65
s Starts at 66
t Starts at 67
e Starts at 68
r Starts at 69
e Starts at 70
d Starts at 71
s Starts at 73
o Starts at 74
f Starts at 76
a Starts at 77
r Starts at 78
u Starts at 80
n Starts at 81
d Starts at 82
e Starts at 83
r Starts at 84
t Starts at 86
h Starts at 87
e Starts at 88
n Starts at 90
a Starts at 91
t Starts at 92
i Starts at 93
o Starts at 94
n Starts at 95
w Starts at 96
i Starts at 97
d Starts at 98
e Starts at 99
v Starts at 101
a Starts at 102
c Starts at 103
c Starts at 104
i Starts at 105
n Starts at 106
a Starts at 107
t Starts at 108
i Starts at 109
o Starts at 110
n Starts at 111
d Starts at 113
r Starts at 114
i Starts at 115
v Starts at 116
e Starts at 117
. Starts at 118
*/

/* OUTPUT 4:

2 Starts at 14
5 Starts at 15
4 Starts at 17
8 Starts at 18
*/

/* OUTPUT 5:

C Starts at 0
u Starts at 1
m Starts at 2
u Starts at 3
l Starts at 4
a Starts at 5
t Starts at 6
i Starts at 7
v Starts at 8
e Starts at 9
l Starts at 10
y Starts at 11
, Starts at 12
  Starts at 13
, Starts at 16
, Starts at 19
, Starts at 22
  Starts at 26
C Starts at 27
O Starts at 28
V Starts at 29
I Starts at 30
D Starts at 31
- Starts at 32
  Starts at 35
v Starts at 36
a Starts at 37
c Starts at 38
c Starts at 39
i Starts at 40
n Starts at 41
e Starts at 42
  Starts at 43
d Starts at 44
o Starts at 45
s Starts at 46
e Starts at 47
s Starts at 48
  Starts at 49
h Starts at 50
a Starts at 51
v Starts at 52
e Starts at 53
  Starts at 54
b Starts at 55
e Starts at 56
e Starts at 57
n Starts at 58
  Starts at 59
a Starts at 60
d Starts at 61
m Starts at 62
i Starts at 63
n Starts at 64
i Starts at 65
s Starts at 66
t Starts at 67
e Starts at 68
r Starts at 69
e Starts at 70
d Starts at 71
  Starts at 72
s Starts at 73
o Starts at 74
  Starts at 75
f Starts at 76
a Starts at 77
r Starts at 78
  Starts at 79
u Starts at 80
n Starts at 81
d Starts at 82
e Starts at 83
r Starts at 84
  Starts at 85
t Starts at 86
h Starts at 87
e Starts at 88
  Starts at 89
n Starts at 90
a Starts at 91
t Starts at 92
i Starts at 93
o Starts at 94
n Starts at 95
w Starts at 96
i Starts at 97
d Starts at 98
e Starts at 99
  Starts at 100
v Starts at 101
a Starts at 102
c Starts at 103
c Starts at 104
i Starts at 105
n Starts at 106
a Starts at 107
t Starts at 108
i Starts at 109
o Starts at 110
n Starts at 111
  Starts at 112
d Starts at 113
r Starts at 114
i Starts at 115
v Starts at 116
e Starts at 117
. Starts at 118
*/

/* OUTPUT 6:
C Starts at 3
u Starts at 4
m Starts at 5
u Starts at 6
l Starts at 7
a Starts at 8
t Starts at 9
i Starts at 10
v Starts at 11
e Starts at 12
l Starts at 13
y Starts at 14
2 Starts at 17
5 Starts at 18
4 Starts at 20
8 Starts at 21
4 Starts at 23
9 Starts at 24
3 Starts at 26
0 Starts at 27
1 Starts at 28
C Starts at 30
O Starts at 31
V Starts at 32
I Starts at 33
D Starts at 34
1 Starts at 36
9 Starts at 37
v Starts at 39
a Starts at 40
c Starts at 41
c Starts at 42
i Starts at 43
n Starts at 44
e Starts at 45
d Starts at 47
o Starts at 48
s Starts at 49
e Starts at 50
s Starts at 51
h Starts at 53
a Starts at 54
v Starts at 55
e Starts at 56
b Starts at 58
e Starts at 59
e Starts at 60
n Starts at 61
a Starts at 63
d Starts at 64
m Starts at 65
i Starts at 66
n Starts at 67
i Starts at 68
s Starts at 69
t Starts at 70
e Starts at 71
r Starts at 72
e Starts at 73
d Starts at 74
s Starts at 76
o Starts at 77
f Starts at 79
a Starts at 80
r Starts at 81
u Starts at 83
n Starts at 84
d Starts at 85
e Starts at 86
r Starts at 87
t Starts at 89
h Starts at 90
e Starts at 91
n Starts at 93
a Starts at 94
t Starts at 95
i Starts at 96
o Starts at 97
n Starts at 98
w Starts at 99
i Starts at 100
d Starts at 101
e Starts at 102
v Starts at 104
a Starts at 105
c Starts at 106
c Starts at 107
i Starts at 108
n Starts at 109
a Starts at 110
t Starts at 111
i Starts at 112
o Starts at 113
n Starts at 114
d Starts at 116
r Starts at 117
i Starts at 118
v Starts at 119
e Starts at 120
*/

/*OUTPUT 7:

  Starts at 0
$ Starts at 1
Starts at 2
, Starts at 15
Starts at 16
, Starts at 19
, Starts at 22
, Starts at 25
Starts at 29
- Starts at 35
  Starts at 38
  Starts at 46
  Starts at 52
  Starts at 57
  Starts at 62
  Starts at 75
  Starts at 78
  Starts at 82
  Starts at 88
  Starts at 92
  Starts at 103
  Starts at 115
. Starts at 121
*/

/* OUTPUT 8:
Success Starts at 31
Success Starts at 52
*/

/* OUTPUT 9:
Success Starts at 31
Success Starts at 52
*/

/* OUTPUT 10:
Word Starts at 14
*/