package loopsandstatements;

import java.util.Scanner;

/* 10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153    */
public class ArmstrongNumber_Prg10 {

    public void getArmstrongNumber(){           //Create static method name getArmstrongNumber

        int a,b,arm=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        b=n;
        while(n!=0)
        {
            a=n%10;
            arm=arm+(a*a*a);
            n=n/10;
        }
        if(arm==b)
            System.out.println(b + " is an armstrong number ");
        else
            System.out.println(b + " is not an armstrong number ");

    }

    public static void main(String[] args) {

        System.out.println("Enter a number :");

        ArmstrongNumber_Prg10 arm = new ArmstrongNumber_Prg10();
        arm.getArmstrongNumber();
        
    }
}
