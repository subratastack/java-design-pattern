package liskovsubstitutionprinciple;

public class Square extends Rectangle {

    public Square() {
        super();
    }
    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void setWidth(int value) {
        super.setWidth(value);
        super.setHeight(value);
    }

    @Override
    public void setHeight(int value) {
        super.setWidth(value);
        super.setHeight(value);
    }
}
