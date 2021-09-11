// WAP to check whether a number is prime.

// Sai Prashant Saxena
// 02220902719
import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number     ");
        int n = scan.nextInt();
        if (isPrime(n)) {
            System.out.println("It is prime number");
        } else {
            System.out.println("It is not prime number");
        }

        scan.close();
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        int root = (int) Math.sqrt(n);
        for (int i = 2; i <= root; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
