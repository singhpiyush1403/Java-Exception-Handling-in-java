import java.io.*;

public class ExceptionHandlingExample {
    public static void checkNumber(int num) throws IllegalArgumentException {
        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {
        
        try {
            int a = 10, b = 0;
            int result = a / b; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero");
        }
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index is out of bounds");
        }
        try {
            File file = new File("nonexistent.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Exception: File not found");
        }

        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Exception: Null pointer encountered");
        }

        try {
            System.out.println("Inside try block");
        } finally {
            System.out.println("Finally block executed");
        }

        try {
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program execution completed.");
    }
}