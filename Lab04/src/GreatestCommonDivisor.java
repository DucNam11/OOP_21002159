public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(6, 9));
        System.out.println(gcd(0, 1));
        System.out.println(gcd(1, 0));
        System.out.println(gcd(-1, 0));
        System.out.println(gcd(9, 6));
    }
}
