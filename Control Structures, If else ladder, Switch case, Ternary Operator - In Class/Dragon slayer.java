// Problem Statement
// Natsu is fighting with a dragon that has A Health and B attack power and Natsu has C health and D attack power. The fight goes in turns first Natsu will attack the Dragon then Dragon will attack Natsu and this goes on. The fight will stop when either the dragon's or Natsu's health drops zero or below. Your task is to check whether Natsu will able to slay the Dragon or not.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function DragonSlayer() that takes integers A, B, C, and D as arguments.

// Constraints:-
// 1 <= A, B, C, D <= 1000
// Output
// Return 0 if Dragon wins else return 1.
// Example
// Sample Input:-
// 8 2 5 3

// Sample Output:-
// 1





static int DragonSlayer(int A, int B, int C,int D){
    //Enter your code here
    int Do=A-D;
    int No=C;
    while(Do>0&&No>0){
        No-=B;
        if(No<=0) return 0;
        Do-=D;
    
    }
    if(Do >=No)return 0;
    else return 1;
    }