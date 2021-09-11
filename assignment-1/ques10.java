// WAP to print
//     1
//   1 2 1
// 1 2 3 2 1

// Sai Prashant Saxena
// 02220902719

public class ques10 {
    public static void main(String[] args) {
        int k;
        for (int i = 1; i <= 3; i++) {
            k = 1;
            for (int j = 1; j <= 5; j++) {
                if (j >= 4 - i && j <= 2 + i) {
                    System.out.print(k);

                    if (j < 3) {
                        k++;
                    } else {
                        k--;
                    }
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}
