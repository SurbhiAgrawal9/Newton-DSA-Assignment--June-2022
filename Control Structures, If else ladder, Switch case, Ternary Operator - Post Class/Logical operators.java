// Problem Statement
// Given two integers a and b, your task is to check following conditions:-
// 1. If a <= 10 and b >= 10 (Logical AND).
// 2. Atleast one from a or b will be even (Logical OR).
// 3. if a is not equal to b (Logical NOT).
// Input
// The first line of the input contains 2 integers a and b.

// Constraints:
// 1 <= a, b <= 100
// Output
// Print true if the condition holds in each function else false
// Example
// Sample Input:-
// 3 12

// Sample Output:-
// true true true



import java.io.*; 
import java.util.*; 
class Main {
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        if (a<=10 && b>=10){
            System.out.print("true ");
        }
        else{
            System.out.print("false ");
        }
        if (a%2==0 || b%2==0){
            System.out.print("true ");
        }
        else{
            System.out.print("false ");
        }
        if (a==b){
            System.out.print("false ");
        }
        else{
            System.out.print ("true ");
        }
    }
}

