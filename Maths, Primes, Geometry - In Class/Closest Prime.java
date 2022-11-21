// Problem Statement
// Given an integer N, find the closest prime number to N. If there are multiple print the smaller one.
// Input
// The input contains a single integer N.

// Constraints:
// 1 <= N <= 1000000000
// Output
// Print the closest prime to N.
// Example
// Sample Input 1
// 12

// Sample Output 1
// 11

// Explanation: Closest prime to 12 is 11 and 13 smaller of which is 11.

// Sample Input 2
// 17

// Sample Output 2
// 17

// Explanation: Closest prime to 17 is 17.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int ad=1;
	    for(int i=n;i>=Math.sqrt(n);i--){
         if(prime(i)){
             System.out.println(i);
             break;
         }else if(prime(n-ad)){
			 System.out.println(n-ad);
             break;
		 }else if(prime(n+ad)){
			 System.out.println(n+ad);
             break;
		 }
		 ad++;
     }

	}
	static boolean prime(int n){
        if(n<=1)
           return false;
for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
              return false;
        }

        return true;
    }
}
