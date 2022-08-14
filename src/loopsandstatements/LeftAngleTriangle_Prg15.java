package loopsandstatements;
/* 15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *

 */

import java.util.Scanner;

public class LeftAngleTriangle_Prg15 {

    public static void getLeftTriangle() {      //static method

        int i, j, n;        //Local variable

        Scanner sc = new Scanner(System.in);        //import Scanner class and create an object
        n = sc.nextInt();

        //nested for loops
        for (i = 0; i < n; i++) {
            for (j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
        public static void main (String[]args){              //Main method
            System.out.print("Enter any number : \t ");
            LeftAngleTriangle_Prg15.getLeftTriangle();      //call static method via class name
        }
    }


