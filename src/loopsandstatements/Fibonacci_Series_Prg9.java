package loopsandstatements;

import java.util.Scanner;

public class Fibonacci_Series_Prg9 {

    public void fibonacci() {           //Create instance method as fibonacci
        int no1 = 1, no2 = 1, sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers you want in the sequence:");
        int counts = sc.nextInt();
        System.out.print("Fibonacci Series of "+counts+" numbers:");

        //logic of to get fibonnacci
        int i = 1;
        while (i <= counts) {
            System.out.print(no1 + " ");
            sum = no1 + no2;
            no1 = no2;
            no2 = sum;
            i++;
        }
    }
    public static void main(String[] args) {

        Fibonacci_Series_Prg9 obj = new Fibonacci_Series_Prg9();        //Create an object
        obj.fibonacci();                                                //call method via object name


    }
}
