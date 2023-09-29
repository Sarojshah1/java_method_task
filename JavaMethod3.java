import java.util.Scanner;

public class JavaMethod3 {
    // 3. Make a method to print the table of a given number n.
    static void table(int n){
        for(int i=1; i<=n; i++){
            System.out.println("********************************");
            for(int j=1; j<=10; j++){
                System.out.println(i+" X "+j+" = "+i*j);
    }
}
    
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a=scanner.nextInt();
        table(a);
        scanner.close();
}

}
