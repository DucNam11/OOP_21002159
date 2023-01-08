import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.next().toLowerCase();
        int strLength = text.length();
        for (int index = 0; index < strLength; index++) {
            char inChar = text.charAt(index);
            if (inChar == 'a' || inChar == 'b' || inChar == 'c') {
                System.out.print('2');
            }
            if (inChar == 'd' || inChar == 'e' || inChar == 'f') {
                System.out.print('3');
            }
            if (inChar == 'g' || inChar == 'h' || inChar == 'i') {
                System.out.print('4');
            }
            if (inChar == 'j' || inChar == 'k' || inChar == 'l') {
                System.out.print('5');
            }
            if (inChar == 'm' || inChar == 'n' || inChar == 'o') {
                System.out.print('6');
            }
            if (inChar == 'p' || inChar == 'q' || inChar == 'r' || inChar == 's') {
                System.out.print('7');
            }
            if (inChar == 't' || inChar == 'u' || inChar == 'v') {
                System.out.print('8');
            }
            if (inChar == 'w' || inChar == 'x' || inChar == 'y' || inChar == 'z') {
                System.out.print('9');
            }
        }
        System.out.println();
        for (int index = 0; index < strLength; index++) {
            char inChar = text.charAt(index);
            switch (inChar) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print('2');
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print('3');
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print('4');
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print('5');
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.print('6');
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print('7');
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.print('8');
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.print('9');
                    break;
            }
        }
    }
}
