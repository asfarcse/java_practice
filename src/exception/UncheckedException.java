package exception;

public class UncheckedException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            int value = numbers[5];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds");
            throw e;
        }
        System.out.println("Program continues...");
    }
}

