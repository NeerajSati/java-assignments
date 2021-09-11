// WAP to print grades for given input percentage from command line using nested if-else.

// Sai Prashant Saxena
// 02220902719
import java.util.*;

public class ques3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int percentage = scan.nextInt();
        System.out.println(getGrade(percentage));
        scan.close();
    }

    public static char getGrade(int percentage) {
        if (90 <= percentage && percentage <= 100)
            return 'A';
        else if (80 <= percentage && percentage < 90)
            return 'B';
        else if (70 <= percentage && percentage < 80)
            return 'C';
        else if (60 <= percentage && percentage < 70)
            return 'D';
        else
            return 'E';

    }
}
