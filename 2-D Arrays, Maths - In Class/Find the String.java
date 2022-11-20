// Problem Statement
// You are given a matrix of characters. The matrix has N rows and M columns. Given a string s, you have to tell if it is possible to generate that string from given matrix.
// Rules for generating string from matrix are:

// You have to pick first character of string from row 1, second character from row 2 and so on. The (N+1)th character of string is to be picked from row 1, that is, you can traverse the rows in a cyclic manner (row 1 comes after row N).
// If an occurrence of a character is picked from a row, you cannot pick the same occurrence again from that row.
// You have to print Yes if given string can be generated from matrix using the given rules, else print No.
// Input
// First line consists of two integers N and M, denoting the matrix dimensions.
// Next N lines consist of M characters each.
// Last line consists of a string s.

// Constraints:
// 1 ≤ N, M ≤ 200
// 1 ≤ S.length() ≤ 4*104
// S contains only lowercase English letters .

// Output
// Print "Yes" if string can be generated else print "No". Answer for each test case should come in a new line.

// Example
// Sample Input 1:
// 3 3
// aba
// xyz
// bdr
// axbaydb

// Sample Output 1:
// Yes

// Explanation
// We pick "a" from row 1. Now, we can only pick one more "a" from row 1 as one "a" is already used.
// Similarly, "x" from row 2, "b" from row 3.
// Now, we again go back to row 1.
// We pick "a" from row 1, "y" from row 2 and so on.





import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.util.stream.*;
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String [][]arr=new String[N][1];
		for(int j=0;j<N;j++){
			arr[j][0]=sc.next();
		}
		String s1=sc.next();
		int I = 0;
		boolean ans = true;
		while(s1.length()!=I)
		{
			if (arr[I%N][0].contains(String.valueOf(s1.charAt(I))))
			{
				ans=true;
				arr[I%N][0]=arr[I%N][0].replaceFirst(String.valueOf(s1.charAt(I)),"");
			}
			else{
				ans=false;
				break;
			}
			I+=1;
		}
		if(ans==true){
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}               // Your code here
    }
}
