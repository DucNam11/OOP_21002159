import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 6, 5, 4, 1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
