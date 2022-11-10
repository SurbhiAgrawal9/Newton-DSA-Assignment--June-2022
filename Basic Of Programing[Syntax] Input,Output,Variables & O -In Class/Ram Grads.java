import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner input = new Scanner(System.in);
                      float total_marks = 400;
					  int a= input.nextInt();
					  int b = input.nextInt();
                      int c= input.nextInt();
					  int d = input.nextInt();
                    
					float percentage = ((a+b+c+d)/total_marks)*100; //22.5
					System.out.println((int)percentage+"%");	 
    }
}