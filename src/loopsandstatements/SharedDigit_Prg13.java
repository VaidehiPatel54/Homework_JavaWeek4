package loopsandstatements;
/* 13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static
*/

public class SharedDigit_Prg13 {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {       //method named hasSharedDigit with return tyoe with two parameters

        if (firstNumber <= 10 || firstNumber >= 99 || secondNumber <= 10 || secondNumber >= 99) {
            return false;
        }

        int firstNumberLastDigit = firstNumber % 10;
        int firstNumberFirstDigit = firstNumber / 10;

        int secondNumberLastDigit = secondNumber % 10;
        int secondNumberFirstDigit = secondNumber / 10;

        return (firstNumberLastDigit == secondNumberLastDigit || firstNumberLastDigit == secondNumberFirstDigit
                || firstNumberFirstDigit == secondNumberLastDigit ||
                firstNumberFirstDigit == secondNumberFirstDigit);
    }

    public static void main(String[] args) {        //main method
        System.out.println(SharedDigit_Prg13.hasSharedDigit(12, 23));   //call method via class and print output
        System.out.println(SharedDigit_Prg13.hasSharedDigit(9, 99));    //call method via class and print output
        System.out.println(SharedDigit_Prg13.hasSharedDigit(15, 55));   //call method via class and print output
    }
}
