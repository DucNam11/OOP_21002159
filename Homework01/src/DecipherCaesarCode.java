import java.util.Scanner;

public class DecipherCaesarCode {
    public static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        System.out.print("Enter a ciphertext string: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.next().toUpperCase();
        int strLength = text.length();
        System.out.print("The plaintext string is: ");
        for (int index = 0; index < strLength; index++) {
            char inChar = text.charAt(index);
            int inPos = alphabet.indexOf(inChar);
            int outPos = (inPos + 26 - 3) % 26;
            char outChar = alphabet.charAt(outPos);
            System.out.print(outChar);
        }
    }
}
