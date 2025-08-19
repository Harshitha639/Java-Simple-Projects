import java.util.Scanner;

public class DigitalCalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double greater(double a, double b) {
        return (a > b) ? a : b;
    }

    public static double smaller(double a, double b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu Driven Digital Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Find Greater");
            System.out.println("5. Find Smaller");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Greater number: " + greater(num1, num2));
                        break;
                    case 5:
                        System.out.println("Smaller number: " + smaller(num1, num2));
                        break;
                }
            } else if (choice != 6) {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        System.out.println("Calculator exited. Goodbye!");
        sc.close();
    }
}
