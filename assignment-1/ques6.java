// WAP to print first n prime nymbers

// Sai Prashant Saxena
// 02220902719

import java.util.*;

public class ques6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int val = 1;
        while (n > 0) {
            if (isPrime(val)) {
                System.out.print(val + " ");
                n--;
            }

            val++;

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
