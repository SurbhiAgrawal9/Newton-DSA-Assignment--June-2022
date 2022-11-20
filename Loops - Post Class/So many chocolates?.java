// Problem Statement
// It's Solo's 1st birthday and everyone is gifting her chocolates. There are N guests invited, the ith guest gives Solo A[i] chocolates.

// Find the total number of chocolates that Solo receives.
// Input
// The first line of the input contains an integer N, the number of guests.
// The second line of the input contains N integers A[1], A[2],. , A[N]

// Constraints
// 1 <= N <= 100
// 1 <= A[i] <= 100
// Output
// Output a single integer, the total number of chocolates that Solo receives.
// Example
// Sample Input
// 5
// 1 2 4 3 2

// Sample Output
// 12





import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc =new Scanner(System.in);
                      int n =sc.nextInt();
                      int s = 0;
                      int [] arr= new int[n];
                      for(int i=0; i<n; i++){
                          arr[i] =sc.nextInt();
                      }
                      for(int i=0; i<n; i++){
                          s=s+arr[i];
                      }
                      System.out.println(s);
    }
    }
