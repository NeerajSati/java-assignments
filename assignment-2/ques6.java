// Sai Prashant Saxena
// 02220902719

// Write a program to show use of this keyword.
class test {
    int a = 0;

    test(int a) {
        this.a = a;
    }
}

public class ques6 {

    public static void main(String[] args) {
        test t = new test(2);
        System.out.println(t.a);
    }
}
