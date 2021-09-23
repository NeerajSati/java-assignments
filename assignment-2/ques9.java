// Sai Prashant Saxena
// 02220902719

// Write a program to show use of static members and static block.
class add {
    static int addNums(int a, int b) {
        return a + b;
    }
}

public class ques9 {
    static {
        System.out.println("Static block executed first");
    }

    public static void main(String[] args) {
        System.out.println("Executed after static block");
        System.out.println(add.addNums(10, 20));
    }

}
