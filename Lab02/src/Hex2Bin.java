import java.util.Scanner;

public class Hex2Bin {
    public static String convertToBinary(String character) {
        character = character.replaceAll("0", "0000");
        character = character.replaceAll("1", "0001");
        character = character.replaceAll("2", "0010");
        character = character.replaceAll("3", "0011");
        character = character.replaceAll("4", "0100");
        character = character.replaceAll("5", "0101");
        character = character.replaceAll("6", "0110");
        character = character.replaceAll("7", "0111");
        character = character.replaceAll("8", "1000");
        character = character.replaceAll("9", "1001");
        character = character.replaceAll("A", "1010");
        character = character.replaceAll("B", "1011");
        character = character.replaceAll("C", "1100");
        character = character.replaceAll("D", "1101");
        character = character.replaceAll("E", "1110");
        character = character.replaceAll("F", "1111");
        return character;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hex = in.next();
        System.out.print("The equivalent binary for hexadecimal " + '"' + hex + '"' + " is: ");
        hex = hex.toUpperCase();
        for (int i = 0; i < hex.length(); i++) {
            System.out.print(convertToBinary(String.valueOf(hex.charAt(i))) + " ");
        }
    }
}
