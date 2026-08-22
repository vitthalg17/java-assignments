import shapes.Shape;
import shapes.Circle;
import shapes.Rectangle;

public class Q02 {
    public static void main(String[] args) {

        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.printf("Circle    -> Area: %.2f, Perimeter: %.2f%n",
                          c.area(), c.perimeter());

        System.out.printf("Rectangle -> Area: %.2f, Perimeter: %.2f%n",
                          r.area(), r.perimeter());
    }
}