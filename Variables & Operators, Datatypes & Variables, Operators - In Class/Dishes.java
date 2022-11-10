/*Problem Statement
Sheldon and Leonard are gone for lunch but none of them have money so they decided to wash dishes. In total, they washed T dishes from which N dishes are washed by Leonard. Now Leonard wants to know the number of dishes Sheldon washed. Help him to find it.
Input
The first line of the input contains N and T

Constraints:-
1 <= N <= T <= 1000
Output
Return the number of dishes Sheldon washed.
Example
Sample Input:-
3 6

Sample Output:-
3

Sample Input:-
2 4

Sample Output:-
2*/




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
    public static void main (String[] args) {
                
                      Scanner sc=new Scanner(System.in);
                      int t=sc.nextInt();
                        int n=sc.nextInt();
    System.out.println(n-t);
    }
}