// Sai Prashant Saxena 
// 02220902719

// Write a program to show Dynamic method dispatch concept
package assignment3;

class A {
    public void print() {
        System.out.println("This is class A");
    }
}

class B extends A {
    public void print() {
        System.out.println("This is class B");
    }
}

class C extends B {
    public void print() {
        System.out.println("This is class C");
    }
}

public class ques3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A refernce = a;
        refernce.print();

        refernce = b;
        b.print();
        refernce = c;
        c.print();

    }
}
