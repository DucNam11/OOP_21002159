import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100);
        int trials = 0;

        System.out.println("Key in your guess:");

        while (true) {
            int trialNumber = in.nextInt();
            trials++;

            if (secretNumber == trialNumber) {
                System.out.printf("You got it in %d trials!\n", trials);
                break;
            } else if (secretNumber > trialNumber) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
        }
    }

}
