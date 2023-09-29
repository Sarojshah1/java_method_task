import java.util.Scanner;

public class JavaMethod4 {
    // 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.
    static int multiplying(int a, int b, int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int a=scanner.nextInt();
        System.out.println("enter second number");
        int b=scanner.nextInt();
        System.out.println("enter third number");
        int c=scanner.nextInt();
        int d=multiplying(a, b, c);
        System.out.println("the multiplication of " + a + "," + b + " and " + c + " is "+d);
        
        scanner.close();
    }
    
}
