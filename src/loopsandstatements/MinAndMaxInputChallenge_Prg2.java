package loopsandstatements;

import java.util.Scanner;

/* 2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge. */
public class MinAndMaxInputChallenge_Prg2 {
    static void getMinMax(){        //Create static method name as getMinMax

        //Local variables
        int min = 0;
        int max = 0;
        int num = 0;
        boolean value = true;

        Scanner sc = new Scanner(System.in);        //import Scanner class and create a scanner object

        while (true) {
            System.out.println("Enter number:");
            boolean hashNextInt = sc.hasNextInt();


            num += 1;
            if(hashNextInt) {

                int number = sc.nextInt();


                if(value){
                    value = false;
                    min = number;
                    max = number;
                }

                if(number > max) {
                    max = number;
                }
                else if(number < min) {
                    min = number;
                }
               // if(num==10) {
                  //  break;
              //  }
            } else {

                System.out.println("Invalid number");
                break;
            }
            sc.nextLine(); //Read user input
        }

        System.out.println("The Minimum number is " + min + ", and The Maximum number is " + max);

        sc.close();             //scanner close
    }

    public static void main(String[] args) {            //Main method
        MinAndMaxInputChallenge_Prg2.getMinMax();       //call static method via class name
    }
}
