package excercise1_1;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
    }

    public void setWidth(double side) {
        this.setWidth(side);
    }

    public void setLength(double side) {
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ']';
    }
}
