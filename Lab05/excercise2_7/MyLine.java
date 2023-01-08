package excercise2_7;

public class MyLine {
    private MyPoint begin, end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        int[] result = {begin.getX(), begin.getY()};
        return result;
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public int[] getEndXY() {
        int[] result = {end.getX(), end.getY()};
        return result;
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    public double getGradient() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return Math.atan2(yDiff,xDiff);
    }

    @Override
    public String toString() {
        return "MyLine[" + "begin=" + begin + ", end=" + end + ']';
    }
}
