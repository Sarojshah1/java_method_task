import java.util.Scanner;

public class JavaMethod5 {
    // 5. Write a program for calculating Simple Interest using a method and print the result from the method itself.
    static void Simple(int a,int b,int c){
        System.out.println("The simple interest is "+(a*b*c)/100);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter principal");
        int a=scanner.nextInt();
        System.out.println("enter time(in years)");
        int b=scanner.nextInt();
        System.out.println("enter rate of interest");
        int c=scanner.nextInt();
        Simple(a, b, c);
        scanner.close();
    }
    
}
