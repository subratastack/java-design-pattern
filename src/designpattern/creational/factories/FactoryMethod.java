package designpattern.creational.factories;

// OLD WAY - Problematic
/*enum CoordinateSystem {
    CART, POLAR
}

class Point {

    private double a;
    private double b;

    public Point(double a, double b, CoordinateSystem cs) {

        switch (cs) {
            case CART:
                this.a = a;
                this.b = b;
                break;
            case POLAR:
                this.a = a * Math.cos(b);
                this.b = a * Math.sin(b);
        }
    }
}*/

class Point {
    private double a;
    private double b;

    // make the constructor private
    private Point(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // make static method for cartesian
    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    // make static method for polar
    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }
}

public class FactoryMethod {

    public static void main(String[] args) {

        Point p1 = Point.newCartesianPoint(2, 3);
        Point p2 = Point.newPolarPoint(10, 20);
    }
}
