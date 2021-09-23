// Sai Prashant Saxena
// 02220902719

// Rewrite program 1 to modify volume method containing return statement.

class Box2 {
    int height, breadth, width;

    Box2(int height, int breadth, int width) {
        this.height = height;
        this.breadth = breadth;
        this.width = width;
    }

    int volume() {
        return height * breadth * width;

    }
}

public class ques2 {
    public static void main(String[] args) {
        Box2 box1 = new Box2(1, 1, 1);
        Box2 box2 = new Box2(1, 2, 3);
        System.out.println("Volume of box1 is " + box1.volume() + " and box 2 is " + box2.volume());

    }
}