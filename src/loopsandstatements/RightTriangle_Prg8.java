package loopsandstatements;
/* 8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@   */

import java.util.Scanner;

public class RightTriangle_Prg8 {

    public static void getData(){           //Create static method as getData(
            int n, i , j ;

            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

        for(i=0; i<n; i++) {
                System.out.println(" ");
            for(j=0; j<=i; j++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {        //Main method
        System.out.print("Enter any number : \t ");
        RightTriangle_Prg8.getData();               //call method via class name

    }
}
