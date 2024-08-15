//This is  comment
/*
 * Angelo Andrade
 * 8/15/2024
 * LargestOfThree.java
 */


import java.util.Scanner;  // Import the Scanner class



public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to the Double In Program!\n\n");

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int largestOfThree = 0;


        // Create a Scanner object
        Scanner myScannerObject = new Scanner(System.in);

        //Ask user for the first int
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();

        //Ask user for the second int
        System.out.println("\n Please enter a second number: ");
        secondNum = myScannerObject.nextInt();


        //Ask user for our third user int
        System.out.println("Please enter a third number");
        thirdNum = myScannerObject.nextInt();

        // Processing
        // Compare the inputs with nested if statements.

        if (firstNum > secondNum) {
            if (firstNum > thirdNum) {
                largestOfThree = firstNum ;
            } else {
                largestOfThree = thirdNum;
            }
        } else {
            if (secondNum > thirdNum) {
                largestOfThree = secondNum;
            } else {
                largestOfThree = thirdNum;
            }
        }
        // Output largest of three
        System.out.println("\n The largest of three is:" + largestOfThree);
    }
}