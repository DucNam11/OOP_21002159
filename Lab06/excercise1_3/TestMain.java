package excercise1_3;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        System.out.println(p1);
        p1.setZ(1.1f);
        System.out.println(p1);

        Point3D p2 = new Point3D(1.1f, 2.2f, 3.3f);
        System.out.println(p2);
        p2.setXYZ(2.2f, 4.4f, 6.6f);
        System.out.println(Arrays.toString(p2.getXYZ()));


    }
}
