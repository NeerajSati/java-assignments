// WAP to print series of prime numbers upto n.

// Sai Prashant Saxena
// 02220902719

import java.util.*;

public class ques7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        printPrimesUptoN(n);
        scan.close();
    }

    public static void printPrimesUptoN(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {

            prime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {

            if (prime[i] == true) {

                for (int j = i * i; j <= n; j += i) {

                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }

}
