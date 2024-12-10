import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            try {
                // Prompt user for first number
                System.out.print("Enter the first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                // Prompt user for an operation
                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.nextLine().charAt(0);

                // Prompt user for second number
                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                // Perform calculation
                double result = 0;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                        continue;
                }

                // Display result
                System.out.println("Result: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter numeric values.");
            }

            // Ask if the user wants to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                continueCalculation = false;
            }
        }

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
