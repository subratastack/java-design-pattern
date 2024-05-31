package liskovsubstitutionprinciple;

public class Demo {

    public static void calculate(Rectangle r, String type) {
        int width = r.getWidth();
        r.setHeight(10);
        // if (!r.isSquare()) r.setHeight(10);
        // area = width * 10
        System.out.println("Calculating area of " + type);
        System.out.println("Expected area: " + (width * 10));
        System.out.println("Calculated area: " + r.area());
        // System.out.println("Is Rectangle: " + r.isSquare());
        System.out.println("-".repeat(20) + "\n");
    }

    public static void main(String[] args) {

        Rectangle rc = new Rectangle(2, 3);
        calculate(rc, rc.getClass().getName());

        Rectangle sq = new Square();
        sq.setWidth(20);
        calculate(sq, sq.getClass().getName());
    }
}
