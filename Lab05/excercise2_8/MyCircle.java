package excercise2_8;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setX(y);
    }


    public int[] getCenterXY() {
        int[] getBeginXY = {center.getX(), center.getY()};
        return getBeginXY;
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + this.radius + ",center=" + center +"]";
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;

    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}
