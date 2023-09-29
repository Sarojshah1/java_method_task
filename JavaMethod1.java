import java.util.Scanner;

public class JavaMethod1{
    
// 1. Make a method to check if a number is prime or not.
static String prime(int number) {
    for (int i = 2; i <number; i++){
    if (number%i==0){
        return number+" is not prime number";
    }
    else{
        return number+" is prime number";
    }
}
    return null;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a=scanner.nextInt();
        System.out.println(prime(a));
        scanner.close();
        
    }
}