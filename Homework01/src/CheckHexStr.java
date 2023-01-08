import java.util.Scanner;

public class CheckHexStr {
    public static boolean CheckHex(String str) {
        for (int index = 0; index < str.length(); index++) {
            char inChar = str.charAt(index);
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F') || (inChar >= 'a' && inChar <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a hex string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (CheckHex(str)) {
            System.out.println('"' + str + '"' + " is a hex string");
        } else
            System.out.println('"' + str + '"' + " is NOT a hex string");
    }
}
