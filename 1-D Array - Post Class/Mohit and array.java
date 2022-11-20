// Problem Statement
// // Mo has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
// Given N-1 elements your task is to find the missing one.
// Input
// First line of input contains a single integer N, the next line contains N-1 space separated integers.

// Constraints:-
// 1 < = N < = 1000
// 1 < = elements < = N
// Output
// Print the missing element
// Example
// Sample Input:-
// 3
// 3 1

// Sample Output:
// 2


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int number = sc.nextInt();
                      int arr[]= new int[number-1];
                      for(int i=0;i<number-1;i++){
                          arr[i]=sc.nextInt();
                      }
                    int sum=0;
                          int final_sum = 0;
                    int total_sum = (number*(number+1))/2;//N*N+1/2
                      for(int i=0;i<number-1;i++){
                           sum += arr[i];
                           
                      }
                      final_sum=total_sum-sum;
                      System.out.print(final_sum);
    }
}
