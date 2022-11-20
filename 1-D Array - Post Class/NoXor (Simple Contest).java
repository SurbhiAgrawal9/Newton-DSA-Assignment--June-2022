// Problem Statement
// We need a problem on xor again. Given an array A of N integers (1- indexed), you need to find the sum of (N- i) xor A[i] for all i from 1 to N.
// Input
// The first line of the input contains an integer N, the number of elements of the array.
// The second line of the input contains N singly spaced integers of the array A[i].

// Constraints
// 1 <= N <= 100000
// 1 <= A[i] <= 109
// Output
// Output a single integer, the answer to the problem.
// Example
// Sample Input
// 5
// 1 2 3 4 5

// Sample Output
// 17



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}

		long sum=0;
		for(int i=1;i<=n;i++){
			sum+=((n-i)^a[i-1]);
		}

		System.out.print(sum);
	}
}
