public class SimpleCalculator {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Enable assertions (use -ea option when running the program)
        // Example: java -ea SimpleCalculator

        // Test cases for addition
        assert add(10, 9) == 19 : "Addition test failed";
        assert add(-5, 5) == 0 : "Addition test failed";

        // Test cases for subtraction
        assert subtract(15, 5) == 10 : "Subtraction test failed";
        assert subtract(0, 5) == -5 : "Subtraction test failed";

        // Test cases for multiplication
        assert multiply(3, 4) == 12 : "Multiplication test failed";
        assert multiply(-3, 3) == -9 : "Multiplication test failed";

        // Test cases for division
        assert divide(20, 4) == 5 : "Division test failed";
        assert divide(15, 3) == 5 : "Division test failed";

        System.out.println("All test cases passed successfully!");
    }
}
