package problem5;


public class ArithematicArrayOutOfBoundsAnotherWay {
    public static void main(String[] args) {
        // Example to handle ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        // Example to handle ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            int index = 5; // This index is out of bounds for the array
            int value = array[index]; // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Handling both exceptions in a combined try-catch block
        try {
            int[] array = {1, 2, 3};
            int a = 10;
            int b = 0;
            int result = a / b; // This will cause ArithmeticException
            int index = 5; // This index is out of bounds for the array
            int value = array[index]; // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Result: " + result);
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

