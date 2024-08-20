
/*
 * Angelo Andrade
 * 8/20/2024
 * PayrollProgram.java
 *
 * Input: User's name, weekly hours worked (no hour fractions), user's hourly pay rate
 *
 * Processing: total weekly pay including overtime if more than 40
 *  hours were worked that week.
 *
 * Output: Polite greeting to the user and regular pay and overtime pay
 *
 *
 */

// import scanner class
import java.util.Scanner;

public class PayrollProgram {
    public static void main(String[] args) {
        System.out.println("\n Welcome to this Payroll Program...");

        int hrsWorked = 0;
        int hrlyPayRate;
        int overtimeHours = 0;
        int payRate = 0;
        double weeklyPay = 0;
        double overTimePay = 0.0;
        String userName = "";

        // Create a Scanner object
        Scanner myScannerObject = new Scanner(System.in);

        //Ask user for their username
        System.out.println("\n Please enter your username: ");
        userName = myScannerObject.nextLine();

        System.out.println("\n Hello, " + userName + ", I hope you're doing well today!");

        // Ask for weekly hours worked
        System.out.println("\n Please enter your weekly hours worked: \n (please use whole numbers)");
        hrsWorked = myScannerObject.nextInt();


        // Create an output statement to the used echoing he user's input.
        System.out.println("\n Hey " + userName + " you worked: " + hrsWorked + " this week!");

        // Please enter your pay rate
        System.out.println("\n Please enter you hourly pay rate");
        payRate = myScannerObject.nextInt();

        //Processing
        overtimeHours =  hrsWorked - 40;


        if (hrsWorked > 40) {
            overTimePay = overtimeHours * payRate * 1.5;
        }
        else {
            overTimePay = 0;
        }
        // Calculate weekly regular pay
        if (hrsWorked <= 40) {
            weeklyPay = hrlyPayRate ;
        }

    }
}