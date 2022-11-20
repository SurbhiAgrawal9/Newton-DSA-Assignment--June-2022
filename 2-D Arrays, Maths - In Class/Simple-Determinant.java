// Problem Statement
// You are given a 2X2 square matrix. You need to find the determinant of the matrix.
// Input
// The input contains two-line, each line contain two integers separated by spaces.

// Each element of the matrix is from 1 to 100.
// Output
// Output a single integer, the determinant of the matrix.
// Example
// Sample Input
// 4 5
// 2 3

// Sample Output
// 2




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
        int size = 2;
        int matrix[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int x, y, f;
        x = matrix[0][0] * matrix[1][1];
        y = matrix[0][1] * matrix[1][0];
        f = x - y;
        System.out.println(f);
    }
}
