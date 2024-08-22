/*
 * Angelo Andrade
 * 8/22/2024
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

public class PayrollProgramWIthOvertime {

    static void theHelloMethod(){
        System.out.println("\n Hello from theHelloMethod() ");
    }


    // This is the method's definition
    public static void  aPersonalGreeting(String someName) {
        // Create a method that gets input,
            System.out.println("\n Hello " + someName + ", how are yo today?");
        }

        // Create a method that gets twos integers and returns their sum
        // Create two int parameters
        static int sumTwoInts(int num1, int num2) {
            int mySum = 0;
            mySum = num1 + num2;


            return mySum;


        }

        public static void main (String[] args) {

            System.out.println("\n Welcome to Methods! \n");
            // Variables (members)
            String theUserName = "";

            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);


            //Get the user's name
            System.out.println("\n Please enter your name");
            theUserName = scanner.nextLine();

            // Call (invoke) our greeting method
            aPersonalGreeting("...some literal string");



            theHelloMethod();


            // Variable
            int aSum = 0;

            // Call our new sum methods
            aSum = sumTwoInts(3,4);

            System.out.println("\n aSum is: " + aSum);

            System.out.println("\n This is the end of my program \n");
        }




//        System.out.println("\n Welcome to this Payroll Program...");

//        int hrsWorked = 0;
//        int overTimeHours = 0;
//        int payRate = 0;
//        int regularPay = 0;
//        int regularHour = 0;
//        double weeklyPay = 0;
//        double overTimePay = 0.0;
//        String userName = "";
//
//        // Create a Scanner object
//        Scanner myScannerObject = new Scanner(System.in);
//
//        //Ask user for their username
//        System.out.println("\n Please enter your username: ");
//        userName = myScannerObject.nextLine();
//
//        System.out.println("\n Hello, " + userName + ", I hope you're doing well today!");
//
//        // Ask for weekly hours worked
//        System.out.println("\n Please enter your weekly hours worked: \n (please use whole numbers)");
//        hrsWorked = myScannerObject.nextInt();
//
//
//        // Create an output statement to the used echoing he user's input.
//        System.out.println("\n Hey " + userName + " you worked: " + hrsWorked + " this week!");
//
//        // Please enter your pay rate
//        System.out.println("\n Please enter you hourly pay rate");
//        payRate = myScannerObject.nextInt();
//
//        //Processing
//        // Overtime pay
//        if (hrsWorked > 40) {
//            overTimeHours = hrsWorked - 40;
//            overTimePay = overTimeHours * 1.5;
//            regularHour = 40;
//            regularPay = regularHour + payRate;
//            weeklyPay = overTimePay + regularPay;
//           System.out.println("\n your weekly pay is: " + weeklyPay);
//        }
//        // Regular pay
//        else {
//            regularHour = 40;
//            regularPay = regularHour * payRate;
//            System.out.println("\n Your weekly pay is: " + regularPay);
//        }
    }
//}