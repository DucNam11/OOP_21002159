import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = Integer.parseInt(sc.next());
        System.out.print("Enter the string: ");
        String str = sc.next();
        try {
            int decimal = Integer.parseInt(str, radix);
            System.out.println("The equivalent decimal number " + '"' + str + '"' + " is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid string " + '"' + str + '"');
        }
    }
}
