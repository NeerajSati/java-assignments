// 02220902719
// Sai Prashant Saxena

// Show use of multiple catch block

public class ques2 {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            System.out.println(a[5]);
            a[3] /= 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
