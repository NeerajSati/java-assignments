// WAP to print reverse of digits of a given number (for example 123 becomes 321)

// Sai Prashant Saxena
// 02220902719
import java.util.*;

public class ques8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        StringBuilder n = new StringBuilder("" + num);
        n.reverse();
        int reversedNumber = Integer.parseInt(n.toString());
        System.out.println(reversedNumber);
        scan.close();
    }
}
