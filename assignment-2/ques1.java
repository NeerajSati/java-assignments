// Sai Prashant Saxena
// 02220902719

// WAP to create a Simple Box class that defines three instance variables
// weidth, height
// anddepth. Add a method “void volume()” to compute volume of box. Create two
// instances
// and compute their volume

class box {
    int height, breadth, width;

    box(int h, int b, int w) {
        height = h;
        breadth = b;
        width = w;
    }

    void volume() {
        System.out.println("Volume of this container is " + (height * breadth * width));

    }
}

public class ques1 {
    public static void main(String[] args) {
        box box1 = new box(1, 1, 1);            //Box 1 Demensions
        box box2 = new box(1, 2, 3);            //Box 2 Demensions
        box1.volume(); 
        box2.volume();
    }
}
