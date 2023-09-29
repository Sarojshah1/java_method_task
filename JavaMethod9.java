import java.util.Scanner;

public class JavaMethod9 {
    // 9. Write a Java program to find the greatest common divisor (GCD) of two numbers.
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int gcd = findGCD(num1, num2);
        
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        
        scanner.close();
    }
    
}
