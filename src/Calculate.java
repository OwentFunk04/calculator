import java.util.Scanner;

public class Calculate {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = add(num1, num2);
        System.out.println("Sum: " + sum);

        int difference = subtract(num1, num2);
        System.out.println("Difference: " + difference);

        int product = multiply(num1, num2);
        System.out.println("Product: " + product);

        try {
            int quotient = divide(num1, num2);
            System.out.println("Quotient: " + quotient);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int squared = square(num1);
        System.out.println("Squared: " + squared);

        scanner.close();
    }
}
