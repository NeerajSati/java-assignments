// Sai Prashant Saxena
// 02220902719

/**
 * create a base class shape.
 * It contains 2 methods get() and print () to accept and display
 * parameters of shape respectively. 
 * Create a subclass Rectangle. 
 * It contains a method todisplay length and breadth of rectangle
 */
package assignment3;

class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Name of shape is " + name);
    }

    public String get() {
        return name;
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth, String name) {
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void print() {
        System.out.println("Length and Breadth of rectangle is " + length + " and " + breadth);
    }
}

public class ques1 {
    public static void main(String[] args) {
        Shape square = new Shape("Square");
        square.print();

        Rectangle rect = new Rectangle(10, 20, "Rectangle");
        rect.print();
    }
}