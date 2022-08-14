package loopsandstatements;
/* 14. Write a program in Java to display the pattern like a diamond.
 While loop

 */

import java.util.Scanner;

public class Diamond_Prg14 {

    public static void getDiamond(){            //Create static method

    Scanner sc=new Scanner(System.in);          //import scanner and create an object

    int n=sc.nextInt();
    System.out.print("Enter Symbol : ");        //print statement
    char c = sc.next().charAt(0);
    int i=1;
    int j;
            while(i<=n)                         //while Loop
    {
        j=1;
        while(j++<=n-i)                         //while Loop

        {
            System.out.print(" ");

        }
        j=1;
        while(j++<=i*2-1)                       //while Loop

        {
            System.out.print(c);

        }

        System.out.println();
        i++;
    }
       i=n-1;
                 while(i>0)
       {
        j=1;
        while(j++<=n-i)

        {
            System.out.print(" ");

        }
        j=1;
        while(j++<=i*2-1)

        {
            System.out.print(c);

        }

        System.out.println();
        i--;
    }

}

    public static void main(String[] args) {                //Main method
        System.out.println("Enter Number of rows  : /t ");
        Diamond_Prg14.getDiamond();
    }
}
