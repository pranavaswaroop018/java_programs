import java.util.Scanner;

public class Factorial {
    // Changed return type to long to handle larger factorial results
    static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            try {
                System.out.println("Factorial = " + factorial(n));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        sc.close(); // Close the Scanner resource
    }
}
    

