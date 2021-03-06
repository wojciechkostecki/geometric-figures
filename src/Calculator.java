public class Calculator {

    public double calculateRectangleArea(Rectangle rectangle) {
        double x1 = rectangle.getP1().getX();
        double y1 = rectangle.getP1().getY();
        double x2 = rectangle.getP2().getX();
        double y2 = rectangle.getP2().getY();
        double x3 = rectangle.getP3().getX();
        double y3 = rectangle.getP3().getY();

        double a = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        double sideA = Math.sqrt(a);

        double b = ((x3 - x1) * (x3 - x1)) + ((y3 - y1) * (y3 - y1));
        double sideB = Math.sqrt(b);

        return sideA * sideB;
    }

    public boolean isPointInsideCircle(Circle circle, Point x) {
        double z = ((x.getX() - circle.getCenter().getX()) * (x.getX() - circle.getCenter().getX())) +
                ((x.getY() - circle.getCenter().getY()) * (x.getY() - circle.getCenter().getY()));
        return z == (circle.getR() * circle.getR());
    }
}
