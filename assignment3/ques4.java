<<<<<<< HEAD
// 02220902719
// Sai Prashant Saxena

=======
>>>>>>> 9854b1bcc08408c11af4357e97f6ba67cbe894d6
// WAP to implement stack using arrays in java

package assignment3;

class Stack<E> {
    E a[];
    int index;

    Stack() {
        a = (E[]) new Object[100];
        index = 0;
    }

    public void push(E data) {
        if (index == 100) {
            System.out.println("Stack Overflow");
            return;
        }
        a[index++] = data;
    }

    public E pop() {
        if (index == 0) {
            System.out.println("Stack underflow");
            return null;
        }
        index--;
        return a[index];

    }

    public E peek() {
        if (index == 0) {
            System.out.println("Stack is Empty");
            return null;
        }
        return a[index - 1];
    }

}

public class ques4 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
