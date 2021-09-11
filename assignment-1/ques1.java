// WAP to find factorial of a given number

// Sai Prashant Saxena
// 02220902719

import java.util.*;

public class ques1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        scan.close();
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

}