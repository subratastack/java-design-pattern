package liskovsubstitutionprinciple;

public class Rectangle {

    public int width;
    public int height;

    public Rectangle() {

    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    // Solving for Liskov-Substitution Principle
    public boolean isSquare() {
        return width == height;
    }
}
