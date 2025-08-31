// 7. Repeat the above question for 4 rectangles, 4 squares and 5 circles.
// Hint- Use array of objects.

abstract class Shape {
    abstract void RectangleArea(int length, int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
}

class Area extends Shape {
    @Override
    void RectangleArea(int length, int breadth) {
        System.out.println("Area of rectangle: " + length * breadth);
    }

    @Override
    void SquareArea(int side) {
        System.out.println("Area of square: " + side * side);
    }

    @Override
    void CircleArea(int radius) {
        System.out.println("Area of circle: " + 3.14 * radius * radius);
    }
}

public class Pbm_07{
    public static void main(String[] args) {
        Area[] rectangle = new Area[4];
        rectangle[0]=new Area();
        rectangle[0].RectangleArea(10, 20);

        rectangle[1]=new Area();
        rectangle[1].RectangleArea(15, 25);

        rectangle[2]=new Area();
        rectangle[2].RectangleArea(20, 30);

        rectangle[3]=new Area();
        rectangle[3].RectangleArea(25, 35);

        System.out.println();

        Area[] squ = new Area[4];
        squ[0] = new Area();
        squ[0].SquareArea(10);

        squ[1] = new Area();
        squ[1].SquareArea(20);

        squ[2] = new Area();
        squ[2].SquareArea(30);

        squ[3] = new Area();
        squ[3].SquareArea(40);
        System.out.println();

        Area[] cir = new Area[5];
        cir[0] = new Area();
        cir[0].CircleArea(10);

        cir[1] = new Area();
        cir[1].CircleArea(20);

        cir[2] = new Area();
        cir[2].CircleArea(30);

        cir[3] = new Area();
        cir[3].CircleArea(40);

        cir[4] = new Area();
        cir[4].CircleArea(50);

        System.out.println();
    }
}
