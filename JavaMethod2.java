import java.util.Scanner;

public class JavaMethod2 {
    // 2. Make a method to check if a given number n is even or not.
    static String check(int n) {
        if(n%2==0){
            return n+" is even";
        }
        else{
            return n+" is not even";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a=scanner.nextInt();
        System.out.println(check(a));
        scanner.close();
    }
    
}
