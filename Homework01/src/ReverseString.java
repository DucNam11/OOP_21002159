import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        inStr = sc.next();
        inStrLen = inStr.length();

        System.out.print("Reverse string: ");
        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
