import java.util.Scanner;

public class ExchangeCipher {
    public static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        System.out.print("Enter a plaintext string: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.next().toUpperCase();
        int strLength = text.length();
        System.out.print("The ciphertext string is: ");
        for (int index = 0; index < strLength; index++) {
            char inChar = text.charAt(index);
            int inPos = alphabet.indexOf(inChar);
            int outPos = 25 - inPos;
            char outChar = alphabet.charAt(outPos);
            System.out.print(outChar);
        }
    }
}
