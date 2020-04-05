public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 7);
        Point p3 = new Point(5, 4);
        Point p4 = new Point(5, 7);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);

        System.out.println(calculator.calculateTheRectanglesArea(rectangle));

        Point p = new Point(6, 8);
        Point x = new Point(4, 4);
        Circle circle = new Circle(p, 3);

        System.out.println(calculator.checkIfThePointInTheCircle(circle, x));
    }
}
