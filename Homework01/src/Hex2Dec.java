import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hex = sc.next();
        try {
            int decimal = Integer.parseInt(hex, 16);
            System.out.println("The equivalent decimal number for hexadecimal " + '"' + hex + '"' + " is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid hexadecimal string " + '"' + hex + '"');
        }
    }
}
