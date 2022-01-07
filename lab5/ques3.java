// 02220902719
// Sai Prashant Saxena

// Write a program to create multiple threads, implementing Runnable Interface.

package lab5;

class CustomThread1 implements Runnable {
    public void run() {
        int i = 0;
        while (i++ < 100) {
            System.out.println("We are in Thread 1");
        }
    }
}

class CustomThread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i++ < 100) {
            System.out.println("We are in Thread 2");
        }
    }
}

public class ques3 {

    public static void main(String[] args) {
        CustomThread1 th1 = new CustomThread1();
        CustomThread2 th2 = new CustomThread2();
        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        t1.start();
        t2.start();
    }
}
