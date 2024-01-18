import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        ComplexNumber num1 = scannerComplexNumber();
        System.out.print("Enter the operation: ");
        String operation = scanner.next();
        System.out.println("Enter the second complex number: ");
        ComplexNumber num2 = scannerComplexNumber();

        ComplexNumber result;

        switch (operation) {
            case "+" -> result = ComplexNumber.add(num1, num2);
            case "*" -> result = ComplexNumber.multiply(num1, num2);
            case "/" -> result = ComplexNumber.divide(num1, num2);
            default -> {
                LOGGER.severe("Invalid operation: " + operation);
                return;
            }
        }

        System.out.println("Result: " + result.toString());
    }

    private static ComplexNumber scannerComplexNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part: ");
        double real = scanner.nextDouble();
        System.out.print("Enter the imaginary part: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }
}