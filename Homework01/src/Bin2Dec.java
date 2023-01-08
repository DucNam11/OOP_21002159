import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String bin = sc.next();
        try {
            int decimal = Integer.parseInt(bin, 2);
            System.out.println("The equivalent decimal number for binary " + '"' + bin + '"' + " is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid binary string " + '"' + bin + '"');
        }
    }
}
