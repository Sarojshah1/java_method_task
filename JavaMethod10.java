import java.util.Scanner;

public class JavaMethod10 {
//     10. Write a Java program to display all prime numbers less than a given number and count all the prime numbers less than that number using functions.  

// Your program should contain two functions: 

// a.    print_prime_less_than that takes a number as a parameter and prints the prime number less than that number 

// b.    is_prime that takes a number as a parameter and then returns whether that number is prime.

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    
    System.out.println("Prime numbers less than " + n + " are:");
    print_prime_less_than(n);
    
    int count = count_primes_less_than(n);
    System.out.println("Total prime numbers less than " + n + " are: " + count);
    
    scanner.close();
}

// Function to check if a number is prime
public static boolean is_prime(int num) {
    if (num <= 1) {
        return false;
    }
    if (num <= 3) {
        return true;
    }
    if (num % 2 == 0 || num % 3 == 0) {
        return false;
    }
    
    for (int i = 5; i * i <= num; i += 6) {
        if (num % i == 0 || num % (i + 2) == 0) {
            return false;
        }
    }
    return true;
}

// Function to print prime numbers less than a given number
public static void print_prime_less_than(int n) {
    for (int i = 2; i < n; i++) {
        if (is_prime(i)) {
            System.out.print(i + " ");
        }
    }
    System.out.println(); // Print a newline after all prime numbers are displayed
}

// Function to count prime numbers less than a given number
public static int count_primes_less_than(int n) {
    int count = 0;
    for (int i = 2; i < n; i++) {
        if (is_prime(i)) {
            count++;
        }
    }
    return count;
}


    
}
