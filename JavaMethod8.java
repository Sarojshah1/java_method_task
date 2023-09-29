import java.util.Scanner;

public class JavaMethod8 {
    
// 8. Calculate the nth Fibonacci number using the method.
static void fibonacci(int n) {
    int first =1;
    int second =1;
    int temp;
    System.out.println(first);
        System.out.println(second);
    for (int i=1; i<=n; i++) {
        temp=first+second;
        System.out.println(temp);
        second=first;
        first=temp;


    }

}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number for fibonacci");
        int a=scanner.nextInt();
        fibonacci(a);
        scanner.close();
}
    
}
