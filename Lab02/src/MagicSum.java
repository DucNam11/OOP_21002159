import java.util.Scanner;

public class MagicSum {
    public static boolean hasEight(int number) {
        String result = String.valueOf(number);
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '8') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        final int SENTINEL = -1;
        int magicSum = 0;
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();
        if (hasEight(number)) {
            magicSum += number;
        }
        while (number != SENTINEL) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
            if (hasEight(number)) {
                magicSum += number;
            }
        }
        System.out.println("The magic sum is: " + magicSum);
    }
}
