// 02220902719
// Sai Prashant Saxena

// Write a program to display the current thread.
package lab5;

import java.lang.Thread;

public class ques1 extends Thread {
    public static void main(String[] args) {
        ques1 t1 = new ques1();
        ques1 t2 = new ques1();
        t1.start();
        t2.start();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}