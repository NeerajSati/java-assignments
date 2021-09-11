// WAP to print Fibbonacci series for a given number

// Sai Prashant Saxena
// 02220902719
import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        long a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < n - 2; i++) {
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        scan.close();
    }

}
