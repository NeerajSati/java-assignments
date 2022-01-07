// 02220902719
// Sai Prashant Saxena

// Write a program to create multiple threads by making use of thread priorities.

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

public class ques4 {
    public static void main(String[] args) {
        CustomThread1 ct1 = new CustomThread1();
        CustomThread2 ct2 = new CustomThread2();
        Thread th1 = new Thread(ct1);
        th1.setPriority(4);
        Thread th2 = new Thread(ct2);
        th1.start();
        th2.start();
    }
}
