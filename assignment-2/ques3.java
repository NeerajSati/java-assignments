// Sai Prashant Saxena
// 02220902719

// Create a class to compute area of square, rectangle and triangle(use method overloading
// concept)
import java.util.Scanner;

class Area {
    public static int getArea(int side) {
        return side * side;

    }

    public static int getArea(int length, int breadth) {
        return length * breadth;
    }

    public static int getArea(int a, int b, int c) {
        int s = (a + b + c) / 2;
        return (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}

public class ques3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side of Square ");
        int side = scan.nextInt();
        System.out.println("Area of square is " + Area.getArea(side));
        System.out.println();
        System.out.println("Enter the length and breadth of rectangle");
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        System.out.println("Area of rectangle is " + Area.getArea(length, breadth));
        System.out.println("Enter the sides of triangle");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("Area of triangle is " + Area.getArea(a, b, c));

        scan.close();
    }

}
