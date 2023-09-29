import java.util.Scanner;

public class JavaMethod7 {
    // 7. Calculates the factorial of a given number using the Java method.
    static int factorial(int number) {
        int result =1;
       for (int i = 1; i <= number; i++) {
        result = result*i;
        
       }
       return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number for factorial");
        int a=scanner.nextInt();
        System.out.println("The factorial of "+a+" is "+factorial(a));
        scanner.close();
    }
    
}
