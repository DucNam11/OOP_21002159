import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        double radius;
        double surfaceArea;
        double volume;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        radius = sc.nextDouble();

        sc.close();

        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4 * Math.PI * radius * radius * radius / 3;
        //The formulas volume = 4/3 * Math.PI * radius * radius * radius does not work in programming because 4/3 is equal to 1
        System.out.printf("Surface Area is : %.2f%n", surfaceArea);
        System.out.printf("Volume is : %.2f%n", volume);

    }
}

