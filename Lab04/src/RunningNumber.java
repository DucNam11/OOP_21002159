public class RunningNumber {
    public static int numOfDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int len(int n) {
        if (n == 1) {
            return 1;
        }
        return len(n - 1) + numOfDigits(n);

    }

    public static void main(String[] args) {
        System.out.println(len(12));
    }
}
