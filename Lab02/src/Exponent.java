import java.util.Scanner;

public class Exponent {
    public static int exponent(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = in.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = in.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }
}
