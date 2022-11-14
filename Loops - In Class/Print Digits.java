// Print Digits
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a natural number N, your task is to print all the digits of the number in words. The words have to separated by space and in lowercase english letters.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function Print_Digit() that takes integer N as a parameter.

// Constraints:-
// 1 <= N <= 10000000
// Output
// Print the digits of the number as shown in the example.

// Note:- Print all digits in lowercase English letters
// Example
// Sample Input:-
// 1024

// Sample Output:-
// one zero two four



static void Print_Digits(int N){
//Enter your code here
String values[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
String num=ICharacter.getNumericValue(index);
       for(int i=0;i<num.length();i++)
           {
           char index=num.charAt(i);
            System.out.print(values[Character.getNumericValue(index)]+" ");
} }
