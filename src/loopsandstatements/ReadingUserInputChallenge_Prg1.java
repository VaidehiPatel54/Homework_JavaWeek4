package loopsandstatements;
/*  1. Read 10 numbers from the console entered by the user and print the sum of those
numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the
count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number
#2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge */
import java.util.Scanner;

public class ReadingUserInputChallenge_Prg1 {                   //Create Class

    static void getSum(){                                       //Declare static method name as getSum

        //local variables
        int counter = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);               //import Scanner class and create a scanner object
        while (counter <= 10) {                                 //While loop

            System.out.println("Enter number  " + counter + ":");       //Print statement for user input Number

            boolean num = scanner.hasNextInt();                         //Read user input
            if (num==false) {
                System.out.println("Invalid Value");
                // Read the enter character
                scanner.nextLine();
                continue;
            }
            sum += scanner.nextInt();
            counter++;
        }
        System.out.println("The sum of numbers: " + sum);
        scanner.close();                                                //Close Scanner
    }
    public static void main(String[] args) {                            //main method

        ReadingUserInputChallenge_Prg1.getSum();                        //Call static method via Program name

    }
}