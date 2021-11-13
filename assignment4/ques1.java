// 02220902719
// Sai Prashant Saxena

// Demonstrate Exception handling using single try catch block

public class ques1 {
    public static void main(String[] args) {
        int a[] = new int[4];
        System.err.println("We are accesing the 4 indexed element which will throw the error");
        try {
            System.out.println(a[4]);
        } catch (Exception e) {
            System.out.println("Now we are in the catch block and error is...");
            System.out.println(e);
        }
    }
}