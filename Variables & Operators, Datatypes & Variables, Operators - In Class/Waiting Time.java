/*Problem Statement
Sara is standing in a line for her turn to see the doctor. There are N people standing in front of Sara and for each person, the doctor takes exactly X minutes. Sara wants to know the time after which her number comes. Since Sara is weak in maths, your task is to calculate the time for her.
Input
You don't have to worry about the input, you just have to complete the function waitingTime()

Constraints:-
1 <= N <= 1000
1 <= X <= 1000
Output
Return the total time Sara needs to wait before her turn in minutes.
Example
Sample Input:-
5 3

Sample Output:-
15
*/


import java.util.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int s=sc.nextInt();
		// int sara=s-c;
		System.out.println((c*s));
	}
}