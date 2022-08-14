package loopsandstatements;
/* . Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant  */

import java.util.Scanner;

public class VowelConsonant_Prg3 {

    public static void getVowCon() {        //Create static method name as getVowCon
        int i=0;
        Scanner scanner = new Scanner(System.in);   //import Scanner class and create a scanner object
        char ch = scanner.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println(ch + " This Character is Vowel");
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z') && (ch < 1)) {
            System.out.println(ch + " This Character is Consonant");

        } else {
            System.out.println("Invalid data");
        }
    }

    public static void main(String[] args) {        //Main method

        Scanner scanner = new Scanner(System.in);       //import Scanner class and create a scanner object
        System.out.println(" Enter any Character : ");
        VowelConsonant_Prg3.getVowCon();        //call method via class name
    }
}
