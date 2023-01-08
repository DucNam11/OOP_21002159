import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt for a non-negative integer for the number of items;
        System.out.print("Enter the number of items: ");
        int numItems = in.nextInt();

        //Allocate the array
        int[] items = new int[numItems];

        // Prompt and read the items into the "int" array, if array length > 0
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space) : ");
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
        }
        in.close();

        //Print array in "index: number of stars" using a nested-loop
        for (int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");

            //Print stars
            for (int starNo = 1; starNo <= items[idx]; starNo++) {
                System.out.print("*");
            }

            //Print the number of stars in ()
            System.out.print("(" + items[idx] + ")");
            System.out.println();
        }
    }
}
