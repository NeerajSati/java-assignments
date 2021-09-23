// Sai Prashant Saxena
// 02220902719

class Box3 {
    int height, breadth, width;

    Box3(int height, int breadth, int width) {
        this.height = height;
        this.breadth = breadth;
        this.width = width;
    }

    void volume() {
        System.out.println("Volume of this container is " + (height * breadth * width));

    }
}

public class ques4 {
    public static void main(String[] args) {
        Box3 box1 = new Box3(1, 1, 1);
        Box3 box2 = new Box3(1, 2, 3);
        box1.volume();
        box2.volume();
    }
}
