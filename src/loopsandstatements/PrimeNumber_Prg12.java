package loopsandstatements;
/* 12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)   */

import java.util.Scanner;

public class PrimeNumber_Prg12 {

    public static void getPrimeNumber(){        //Create static method

        int temp, num,i;
        boolean prime =true;
        Scanner scan = new Scanner(System.in);          // import Scanner and create object of Scanner

        num = scan.nextInt();

        for(i=2;i<=num/2;i++)                           //for loop
        {
            temp=num%i;
            if(temp==0)
            {
                prime=false;
                break;
            }
        }
        //If prime is true then the number is prime else not
        if(prime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }

    public static void main(String[] args) {            //main method

        System.out.println("Enter any number:  ");
        PrimeNumber_Prg12.getPrimeNumber();             //call method via class name
    }
    }

