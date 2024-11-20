public class SimpleCalculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        System.out.println("Multiplying " + a + " and " + b);
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        

        int result = add(10, 9);
        System.out.println("Addition Test 1 (10 + 9): " + result);
        assert result == 19 : "Addition test failed";

        result = add(-5, 5);
        System.out.println("Addition Test 2 (-5 + 5): " + result);
        assert result == 0 : "Addition test failed";

        result = subtract(15, 5);
        System.out.println("Subtraction Test 1 (15 - 5): " + result);
        assert result == 10 : "Subtraction test failed";

        result = subtract(0, 5);
        System.out.println("Subtraction Test 2 (0 - 5): " + result);
        assert result == -5 : "Subtraction test failed";

        result = multiply(3, 4);
        System.out.println("Multiplication Test 1 (3 * 4): " + result);
        assert result == 12 : "Multiplication test failed";

        result = multiply(-3, 3);
        System.out.println("Multiplication Test 2 (-3 * 3): " + result);
        assert result == -9 : "Multiplication test failed";

        result = divide(20, 4);
        System.out.println("Division Test 1 (20 / 4): " + result);
        assert result == 5 : "Division test failed";

        result = divide(15, 3);
        System.out.println("Division Test 2 (15 / 3): " + result);
        assert result == 5 : "Division test failed";

        System.out.println("All test cases passed successfully!");
    }
}
