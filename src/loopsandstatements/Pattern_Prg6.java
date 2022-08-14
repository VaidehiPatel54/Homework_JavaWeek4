package loopsandstatements;
/*6. Write a program in Java to display the pattern like a triangle with a number.
        For eg.
        Input number of rows: 10
        Expected Output:
        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910     */

import java.util.Scanner;

public class Pattern_Prg6 {              //Create Class

    public static void triangleNumber(){    //Declare static method
        for( int i=1;i<=10;i++){            //for loop
            for(int j=1;j<=i;j++)           //for loop
                System.out.print(j);        //Print statement
            System.out.println("  ");
        }
    }

    public static void main(String[] args) {                    //Main method
        Scanner sc = new Scanner(System.in);                    //import Scanner class and create a scanner object
        System.out.println("Input number of rows  :  \t ");     //print statement for input Student name
        int num = sc.nextInt();                                 // Read user input
        System.out.println("Expected Output : ");
        Pattern_Prg6.triangleNumber();
    }
}
