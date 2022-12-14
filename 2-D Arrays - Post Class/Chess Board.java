// Problem Statement
// Tom loves Chess boards. He admires its symmetry and how the black and white colours are placed adjacently along both the axis.

// More formally, a chessboard like coloring implies that no two adjacent cells have the same color and all the cells are painted either white or black.

// On his birthday, Tom has been gifted a board which is in the form of a N*N grid. Every cell is painted either black or white. Since Tom loves the placement of colours in a chessboard, he will try to convert the board that has been gifted to him, identical to a chessboard. He has both black and white colours available to him. Help him find out the minimum number of the cell he will have to recolour to paint his board similar to chessboard.
// Input
// First line contains an integer N, denoting the size of the board
// Each of the next N lines contains N space separated integers and each integer being either '0' or '1'
// '1' represent black cell
// '0' represents white cell

// Constraints
// 1 <= N <= 1000
// Output
// A single integer that is the minimum number of cells that Tom will have to re-color in his board to convert the given board to a chess board like coloring.
// Example
// Input:
// 3
// 1 1 1
// 1 1 1
// 1 1 1

// Output:
// 4

// Explanation:
// Convert to
// 1 0 1
// 0 1 0
// 1 0 1
// Thus we will have to colour 4 cells.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int match = 0;
        for (int r =0 ; r < n ; r++){
            String temp[] = sc.nextLine().split(" ");
            for (int c =0; c < n; c++){
                int num = Integer.parseInt(temp[c]);
                if (num == ((r + c)% 2)) {
                    match++;                
                }
            }
        }
        int notMatch = (n * n) - match;
        System.out.println(Math.min(match, (n*n)-match));
    }
}
