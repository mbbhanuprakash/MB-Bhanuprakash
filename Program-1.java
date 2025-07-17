import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String op = sc.next();

        double result;

        if (op.equals("+")) {
            result = a + b;
            System.out.println("Result: " + result);
        } else if (op.equals("-")) {
            result = a - b;
            System.out.println("Result: " + result);
        } else if (op.equals("*")) {
            result = a * b;
            System.out.println("Result: " + result);
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                result = a / b;
                System.out.println("Result: " + result);
            }
        } else {
            System.out.println("Invalid operation.");
        }

        sc.close();
    }
}
