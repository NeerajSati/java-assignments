// 02220902719
// Sai Prashant Saxena

// Use Box class. Create a subclass ColoredBox with one parameter String color. Override
// print method of Box class.

package assignment3;

class Box {
    int length, breadth, height;

    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void print() {
        System.out.println("Length, breadth and height of box are " + length + ", " + breadth + ", " + height);
    }
}

class ColoredBox extends Box {
    String color;

    ColoredBox(int length, int breadth, int height, String color) {
        super(length, breadth, height);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Length, breadth and height of box are " + length + ", " + breadth + ", " + height);
        System.out.println("Color of Box is " + color);

    }
}

public class ques2 {
    public static void main(String[] args) {
        Box box1 = new Box(10, 10, 10);
        box1.print();
        ColoredBox box2 = new ColoredBox(10, 10, 10, "red");
        box2.print();

    }
}
