// 02220902719
// Sai Prashant Saxena

// Show use of finally block

public class ques3 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("We are in the finally block");
            System.out.println("It will be executed always whether error occured or not");

        }
    }
}
