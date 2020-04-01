public class Calculator {

    public static void rectangleArea(Rectangle rectangle) {
        double x1 = rectangle.getP1().x;
        double y1 = rectangle.getP1().y;
        double x2 = rectangle.getP2().x;
        double y2 = rectangle.getP2().y;
        double x3 = rectangle.getP3().x;
        double y3 = rectangle.getP3().y;

        double a = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        double sideA = Math.sqrt(a);

        double b = ((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2));
        double sideB = Math.sqrt(b);

        System.out.println(sideA * sideB);
    }

    public static void pointInCircle(Circle circle, Point x) {
        double z = ((x.x - circle.s.getX()) * (x.x - circle.s.getX())) + ((x.y - circle.s.getY()) * (x.y - circle.s.getY()));
        if (z == (circle.r * circle.r)) {
            System.out.println("Punkt leży wewnątrz okręgu");
        }else {
            System.out.println("Punkt NIE leży wewnątrz okręgu");
        }
    }
}
