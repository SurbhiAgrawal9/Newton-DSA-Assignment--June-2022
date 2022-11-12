// Problem Statement
// Rick's family and Jerry are playing Tic Tac Toe. Rules are simple:
// Game is played in pairs.
// If Rick plays against anyone, Rick wins.
// If Jerry plays against anyone, Jerry Loses.
// A game between any other players is a draw.
// Given a pair of players, find who wins the game or if the game is draw.
// Input
// Input Contains two space separated characters denoting the players that will have the match.
// R denotes Rick.
// J denotes Jerry.
// B denotes Beth.
// M denotes Morty.
// S denotes Summer.
// Output
// If the game is draw print 'D', else print the first letter of the name of the player who wins in capital.
// Example
// Sample Input 1
// R S

// Sample Output 1
// R


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      //your code is here 
               Scanner sc = new Scanner(System.in);

                char a =sc.next().charAt(0);
                char c =sc.next().charAt(0);
                if(a=='R' || c=='R')
                System.out.print("R");
                else if(a == 'J')
                System.out.print(c);
                else if(c == 'J')
                System.out.print(a);
                else
                System.out.print("D");
  }
  }