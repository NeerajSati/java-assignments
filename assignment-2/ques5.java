// Sai Prashant Saxena
// 02220902719

// Show constructor overloading using Box class.
class Value {
    int a = 0, b = 0, c = 0;

    Value(int a) {
        this.a = a;
    }

    Value(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Value(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void printValues() {
        System.out.println(a + " " + b + " " + c);
    }
}

public class ques5 {
    public static void main(String[] args) {
        Value v1 = new Value(1);
        v1.printValues();
        Value v2 = new Value(1, 2);
        v2.printValues();
        Value v3 = new Value(1, 2, 3);
        v3.printValues();

    }
}