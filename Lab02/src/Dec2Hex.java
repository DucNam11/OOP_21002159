import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = in.nextInt();
        String hex = Integer.toHexString(decimal);
        System.out.print("The equivalent hexadecimal number is: " + hex);
    }
}
