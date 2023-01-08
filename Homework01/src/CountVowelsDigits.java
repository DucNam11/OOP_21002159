import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        int countVowels = 0;
        int countDigits = 0;
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.next().toLowerCase();
        int strLength = text.length();
        for (int i = 0; i < strLength; i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowels++;
            } else if (ch >= '0' && ch <= '9') {
                countDigits++;
            }
        }
        double percentageVowels = (double) (countVowels * 100) / strLength;
        double percentageDigits = (double) (countDigits * 100) / strLength;
        double roundPercentVowels = (double) Math.round(percentageVowels * 100) / 100;
        double roundPercentDigits = (double) Math.round(percentageDigits * 100) / 100;
        System.out.print("Number of vowels: ");
        System.out.printf("%d\t(%.2f%%) ", countVowels, roundPercentVowels);
        System.out.println();
        System.out.print("Number of digits: ");
        System.out.printf("%d\t(%.2f%%) ", countDigits, roundPercentDigits);


    }
}
