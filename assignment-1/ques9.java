// WAP to find whether a given char is vowel using switch case.

// Sai Prashant Saxena
// 02220902719
import java.util.*;

public class ques9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character");
        char c = (scan.nextLine()).charAt(0);

        // If character is is in uppercase then converting it into smaller case
        if (c < 97) {
            c += 32;
        }
        if (isVowel(c)) {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is not vowel");
        }
        scan.close();
    }

    public static boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'A':
                return true;
            case 'e':
            case 'E':
                return true;
            case 'i':
            case 'I':
                return true;
            case 'o':
            case 'O':
                return true;
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }

    }
}
