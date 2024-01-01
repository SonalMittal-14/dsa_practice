import java.util.Scanner;

public class addTwoNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Call the addNumbers method and store the result
        double result = addNumbers(num1, num2);

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);

        // Close the Scanner to avoid resource leak
        scanner.close();
    }

    // Function to add two numbers
    public static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }
}
