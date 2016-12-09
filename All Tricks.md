#Chess knight navigation using for loops
1. Code
```
for(int r = -2; r<=2; r++)
{
	for(int c = -2; c<=2; c++)
	{
		if(Math.abs(r*c) == 2)
		{
			sysout("This is valid knight movement!");
		}
	}
}
```
2. Examples - [KnightTour] (https://community.topcoder.com/stat?c=problem_statement&pm=7245)
3. [Solution] (https://github.com/nirmitleo/Competitive-Programming-notes/blob/master/KnightTour.java)

#Avoid Integer/Long overflow
1. If we have two integer(or long), A and B, to multiply and test if they are less than a particular MAX, then -
```
A * B <= MAX
```
will result in overflow. A better approach is to use division - 
```
A <= (MAX / B)
```
2. Examples - [Multifactorial] (https://community.topcoder.com/stat?c=problem_statement&pm=6835)
3. [Solution] (https://github.com/nirmitleo/Competitive-Programming-notes/commit/2fd7690c7f0213f18edf9bd5f7c523a86626f862)

