// 02220902719
// Sai Prashant Saxena

// Write a program to create multiple threads , use Thread class.
package lab5;

public class ques2 extends Thread {
    String title;

    ques2(String title) {
        this.title = title;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(title + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        ques2 th1 = new ques2("Thread1");
        ques2 th2 = new ques2("Thread2");

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        t1.start();
        t2.start();
    }
}
