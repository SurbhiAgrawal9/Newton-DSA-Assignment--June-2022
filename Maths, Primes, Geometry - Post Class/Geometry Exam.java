// Problem Statement
// Sara has an exam of geometry in which the following question is asked:-
// Given three points A, B, and C. Check if there exists a point and an angle such that if we rotate the page around the point by the angle, the new position of A is the same as the old position of B, and the new position of B is the same as the old position of C.
// Input
// The first line of input contains the position of A(Ax, Ay). The second line of input contains the position of B(Bx, By). The third line of input contains the position of C(Cx, Cy).

// Constraints:-
// |X|, |Y| <= 10^9
// Output
// Print "Yes" if there exists a point else print "No".
// Example
// Sample Input:-
// 0 1
// 1 1
// 1 0

// Sample Output:-
// Yes

// Explanation:-
// (0.5, 0.5) by 90



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                        Scanner sc = new Scanner (System.in);
        double ax=sc.nextDouble();
        double ay=sc.nextDouble();
        double bx=sc.nextDouble();
        double by=sc.nextDouble();
        double cx=sc.nextDouble();
        double cy=sc.nextDouble();
        
        if ((by - ay) / (bx - ax) != (cy - by) / (cx - bx) && (by - ay) * (by - ay) + (bx - ax) * (bx - ax) == (cy - by) * (cy - by) + (cx - bx) * (cx - bx))
        {
            System.out.print("Yes\n");
        }
        else
        {
            System.out.print("No\n");
        }

    }
}
