// Sai Prashant Saxena
// 02220902719

// Write a class arithmetic for calculation of addition, subtraction, multiplication and division of
// two numbers.

class airthmetic {
    int a, b;

    airthmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add() {
        System.out.println("Addition is " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction is " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication is " + (a * b));
    }

    void div() {
        System.out.println("Division is " + (a / b));
    }
}

public class ques7 {
    public static void main(String[] args) {
        airthmetic test = new airthmetic(10, 5);
        test.add();
        test.sub();
        test.mul();
        test.div();
    }
}
