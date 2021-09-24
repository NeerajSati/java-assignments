// Sai Prashant Saxena
// 02220902719

// WAP to demonstrate call by value and call by reference.

class demonstrate {
    void incrementByOneRef(integer b) {
        b.a = b.a + 1;
    }

    void incrementByOneVal(int a) {
        a++;
    }

}

class integer {
    int a;

    integer(int a) {
        this.a = a;
    }
}

public class ques8 {
    public static void main(String[] args) {
        demonstrate demo = new demonstrate();
        int a = 10;
        demo.incrementByOneVal(a);
        System.out.println("After call by value " + a);
        integer b = new integer(10);
        demo.incrementByOneRef(b);
        System.out.println("After call by ref " + b.a);

    }
}
