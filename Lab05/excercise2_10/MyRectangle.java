package excercise2_10;

public class MyRectangle {
    private final MyPoint top_left;
    private final MyPoint bottom_right;

    public MyRectangle(MyPoint top_left, MyPoint bottom_right) {
        this.top_left = top_left;
        this.bottom_right = bottom_right;
    }

    public double getPerimeter() {
        int length = 1;
        int width = 1;
        if (this.isValid()) {
            length = bottom_right.getX() - top_left.getX();
            width = top_left.getY() - bottom_right.getY();
        }
        return 2 * length * width;
    }

    public double getArea() {
        int length = 1;
        int width = 1;
        if (this.isValid()) {
            length = bottom_right.getX() - top_left.getX();
            width = top_left.getY() - bottom_right.getY();
        }
        return length * width;
    }

    public boolean isValid() {
        return top_left.getX() < bottom_right.getX() && top_left.getY() > bottom_right.getY();
    }

    public String getType() {
        int length = 1;
        int width = 1;
        if (this.isValid()) {
            length = bottom_right.getX() - top_left.getX();
            width = top_left.getY() - bottom_right.getY();
        }
        if (length == width) return "Square";
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "MyRectangle[" + "top_left=" + top_left + ", bottom_right=" + bottom_right + ']';
    }
}
