import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        String oct = sc.next();
        try {
            int decimal = Integer.parseInt(oct, 8);
            System.out.println("The equivalent decimal number for octal " + '"' + oct + '"' + " is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid octal string " + '"' + oct + '"');
        }
    }
}
