package in.kgcoding.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            double result = (double) num1 /num2;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
