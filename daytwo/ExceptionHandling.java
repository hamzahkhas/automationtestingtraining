package daytwo;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();
        
        try {
            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        sc.close();
    }
    
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}