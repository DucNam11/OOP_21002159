package excercise2_10;

import java.util.*;

public class TestMyRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, y1, y2;
        boolean check = false;
        while(!check) {
            System.out.print("Enter the coordinates of top-left point: ");
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            System.out.print("Enter the coordinates of bottom-right point: ");
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            MyPoint top_left = new MyPoint(x1, y1);
            MyPoint bottom_right = new MyPoint(x2, y2);
            MyRectangle rectangle = new MyRectangle(top_left, bottom_right);
            if (rectangle.isValid()) {
                System.out.println("These are the valid coordinates for the top-left and bottom-right angle of a rectangle!");
                System.out.println("The area is: " + rectangle.getArea());
                System.out.println("The perimeter is: " + rectangle.getPerimeter());
                System.out.println("This rectangle is a " + rectangle.getType());
                check = true;
            } else System.out.println("Invalid!");
        }
    }
}
