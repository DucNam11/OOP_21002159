import java.util.Scanner;

public class TestPalindromicWord {
    public static boolean CheckPalindrome(String str) {
        int fIdx = 0;
        int bIdx = str.length() - 1;
        str = str.toLowerCase();

        while (fIdx < bIdx) {
            char forwardChar = str.charAt(fIdx);
            char backwardChar = str.charAt(bIdx);

            if (forwardChar == backwardChar) {
                fIdx++;
                bIdx--;
            } else
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (CheckPalindrome(str))
            System.out.println('"' + str + '"' + " is palindrome");
        else
            System.out.println('"' + str + '"' + " is not palindrome");
    }
}
