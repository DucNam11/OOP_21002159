import java.util.Scanner;

public class NumberConversion {
    public static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String numberStr = in.next();
        System.out.print("Enter the input radix: ");
        int inRadix = in.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = in.nextInt();
        System.out.printf("\"%1$s\" in radix %2$d is \"%3$s\" in radix %4$d.\n", numberStr, inRadix, toRadix(numberStr, inRadix, outRadix), outRadix);
    }

    public static String toRadix10(int number, int radix) {
        String result = "";
        if (radix == 0) {
            return result;
        }
        while (number > 0) {
            result = alphabet.charAt(number % radix) + result;
            number /= radix;
        }
        return result;
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        return toRadix10(Integer.parseInt(in, inRadix), outRadix);
    }
}
