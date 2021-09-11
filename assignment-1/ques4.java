// WAP to find maximum of three numbers.

// Sai Prashant Saxena
// 02220902719
import java.util.*;

public class ques4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = Math.max(a, b);
        max = Math.max(c, max);
        System.out.println("Maximum value is " + max);
        scan.close();
    }

}
