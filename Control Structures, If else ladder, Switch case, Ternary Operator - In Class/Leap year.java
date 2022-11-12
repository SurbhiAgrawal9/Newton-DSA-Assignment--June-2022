
// Problem Statement
// Given a year, find if it is a leap year. Leap year is the year that is multiple of 4. But, multiples of 100 which are not multiples of 400 are not leap years.
// Input
// The input contains a single integer N

// Constraint:
// 1 <= n <= 5000
// Output
// Print "YES" if the year is a leap year else print "NO".
// Example
// Sample Input:
// 2000

// Sample Output:
// YES

// Sample Input:
// 2003

// Sample Output:
// NO







import java.util.Scanner;
class Main {
   public static void main (String[] args)
   {

       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       LeapYear(n);
}
static void LeapYear(int n){
     int p=0;
    if(n%400==0){
        p=1;
    }else if(n%100==0){
        p=0;
    }else if(n%4==0){
        p=1;
    }else{
        p=0;
    }

    if(p==1){
        System.out.print("YES");
    }else{
        System.out.print("NO");
    }
}
}