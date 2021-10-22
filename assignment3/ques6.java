// Sai Prashant Saxena 
// 02220902719

// Write a program to show the use of Interfaces (show multipe inheritence as discussed in
// class)

package assignment3;

interface Print {
    public void print();
}

interface Show {
    public void show();
}

class Solution implements Print, Show {
    public void print() {
        System.out.println("We are in print method");
    }

    public void show() {
        System.out.println("We are in show method");
    }
}

public class ques6 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.print();
        sol.show();
    }
}
