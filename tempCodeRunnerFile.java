import java.util.Scanner;
public class Calculator {

    public static double[] calculate(double a, double b) {
        double[] results = new double[4];
        results[0] = a + b; 
        results[1] = a - b; 
        results[2] = a * b; 
       
        if (b != 0) {
            results[3] = a / b; 
        } else {
            System.out.println("Cannot divide by zero.");
            results[3] = Double.NaN; 
        } 
        return results;

    public static void main (String[] args) {
        double num1 = 10;
        double num2 = 5;

        double[] results = calculate(num1, num2);
        
        System.out.println("Addition: " + results[0]);
        System.out.println("Subtraction: " + results[1]);
        System.out.println("Multiplication: " + results[2]);
        System.out.println("Division: " + (results[3] == Double.NaN ? "undefined" : results[3]));
       
    }
}

