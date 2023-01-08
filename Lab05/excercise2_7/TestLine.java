package excercise2_7;

public class TestLine {
    public static void main(String[] args) {
        MyPoint point_0 = new MyPoint(10,0);
        MyPoint point_1 = new MyPoint(-2, 8);
        MyLine line1 = new MyLine(5, 8, 9, -1);
        MyLine line2 = new MyLine(point_0, point_1);
        System.out.println(line1.getBegin().toString());
        System.out.println(line2.getEnd().toString());
        MyPoint point_2 = new MyPoint(-14, 11);
        MyPoint point_3 = new MyPoint(14, 7);
        line2.setBegin(point_3);
        line1.setEnd(point_2);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println("The coordinates of the beginning point of line 1 is: X = " + line1.getBeginXY()[0] + ", Y = " + line1.getBeginXY()[1]);
        MyLine line3 = new MyLine(10, 0, 2,-11);
        line3.setBeginXY(0,1);
        line3.setEndXY(20,-12);
        System.out.println(line3);
        System.out.println("The length of line 2 is: " + line2.getLength());
        System.out.println("The gradient of line 3 is: " + line3.getGradient());
    }
}
