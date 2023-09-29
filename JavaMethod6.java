import java.util.Scanner;

public class JavaMethod6 {
    // 6. Write a program to calculate the area of a rectangle using a method of your choice.
    static void area(int length,int breadth){
        int area=length*breadth;
        System.out.println("the area of rectangle is " + area);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length");
        int a=scanner.nextInt();
        System.out.println("enter breadth");
        int b=scanner.nextInt();
        area(a, b);
        scanner.close();
    }

    
}
