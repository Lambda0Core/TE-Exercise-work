//Imports Scanner
import java.util.Scanner;
public class Test {
    //Adds whole numbers
    public static int addTwoNumbers(int a, int b){
        return a+b;
    }
    //Inputs full names as a string
    public static String concatFullName(String first, String last){
        return last + ", " + first;
    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your first name.");
        String firstName = userInput.nextLine();
        System.out.println("Please enter your last name.");
        String lastName = userInput.nextLine();
        System.out.println("Enter your age.");
        String ageInput = userInput.nextLine();
        System.out.println("Do you currently have an account? Y/N");
        String userHasAccount = userInput.nextLine();
        boolean isY = userHasAccount.equals("Y")? true : false;
        int age = Integer.parseInt(ageInput);
        double totalBalance = balance(559.25, 1200.75);
        double checkingBalance = balance(559.25, 0.0);
        double savingsBalance = balance(0.0, 1200.75);
        boolean signedUp = hasAccount(true);
        String fullName = concatFullName("Emily", "LeFebvre");
        if (isY = true && age >= 18) {
            System.out.println("Welcome, '" + firstName + "'");
            System.out.println("/////////////////");
            System.out.println("Checking Account: " + checkingBalance);
            System.out.println("Savings Account: " + savingsBalance);
            System.out.println("Total Balance: " + totalBalance);
        }if (isY = false || age <= 17){
            System.out.println("I'm sorry, you do not currently have an account with us.");
        }

    }
    //inputs financial balance as a double
    public static double balance(double c, double d){
        return c+d;
    }
    public static boolean hasAccount(boolean acc) {
        return acc;
    }
}
