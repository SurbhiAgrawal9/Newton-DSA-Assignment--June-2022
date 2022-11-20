// Problem Statement
// Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degree and 180 degree.
// Input
// First line contains N.
// N lines follow each containing N space seperated integers.

// 2 <= N <= 100
// 1 <= Mat[i][j] <= 10000
// Output
// Output 2*N+1 lines.
// First N lines should contain the Matrix rotated by 90 degrees.
// Then print a blank line.
// Then N lines should contain the Matrix rotated by 180 degrees.
// Example
// Sample Input
// 2
// 3 4
// 7 6

// Sample Output
// 7 3
// 6 4




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code 
        Scanner =inputtaker new Scanner(System.in);

        int n= inputtaker.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i <inputtaker n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] .nextInt();
            }
        }
        rotateAndPrint(arr, n);
        System.out.println("");
        rotateAndPrint(arr, n);
    }

    public static void rotateAndPrint(int[][] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - 1 - j][i];
                arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j];
                arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i];
                arr[j][n - 1 - i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
