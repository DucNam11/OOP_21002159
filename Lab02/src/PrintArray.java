import java.util.Scanner;

public class PrintArray {
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

        // Print array contents, need to handle first item and subsequent items differently
        StringBuilder values = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                // Add the first item without a leading commas to string
                values.append(items[i]);
            } else {
                // Add the subsequent items with a leading commas to string
                values.append(", ").append(items[i]);
            }
        }
        System.out.println("The values are: [" + values + "]");
    }
}
