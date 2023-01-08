import java.util.Arrays;
import java.util.Scanner;

public class MethodsOfArray {
    public static void print(int[] array) {

        StringBuilder values = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                values.append(array[i]);
            } else {
                values.append(", ").append(array[i]);
            }
        }
        System.out.println("The int values are: [" + values + "]");
    }

//    public static void print(double[] array){
//
//        // Print array contents, need to handle first item and subsequent items differently
//        StringBuilder values = new StringBuilder();
//        for (int i = 0; i < array.length; i++) {
//            if (i == 0) {
//                // Add the first item without a leading commas to string
//                values.append(array[i]);
//            } else {
//                // Add the subsequent item with a leading commas to string
//                values.append(", ").append(array[i]);
//            }
//        }
//        System.out.println("The double values are: [" + values + "]");
//    }

    //    public static void print(float[] array){
//
//        // Print array contents, need to handle first item and subsequent items differently
//        StringBuilder values = new StringBuilder();
//        for (int i = 0; i < array.length; i++) {
//            if (i == 0) {
//                // Add the first item without a leading commas to string
//                values.append(array[i]);
//            } else {
//                // Add the subsequent item with a leading commas to string
//                values.append(", ").append(array[i]);
//            }
//        }
//        System.out.println("The float values are: [" + values + "]");
//    }
    public static String arrayToString(int[] array) {
        // Print array contents, need to handle first item and subsequent items differently
        String values = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                // Add the first item without a leading commas to string
                values = values + array[i];
            } else {
                // Add the subsequent item with a leading commas to string
                values = values + "," + array[i];
            }
        }
        return values;
    }

    public static boolean contains(int[] array, int key) {
        for (int j : array) {
            if (j == key) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array2.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static int[] copyOf(int[] array) {
        return array;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] result = new int[newLength];
        for (int i = 0; i < result.length; i++) {
            if (i < array.length) {
                result[i] = array[i];
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    public static int[] swap(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array2.length; i++) {
                array1[i] = array2[i];
                array2[i] = array1[i];
            }
            return array1;
        }
        return array1;
    }

    public static void reverse(int[] array) {
        int temp;
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++, bIdx--) {
            temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int numItems = in.nextInt();
        int key = 8;
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 4, 3, 6};

        int[] array = new int[numItems];
        //float[] array = new float[numItems];
        //double[] array = new float[numItems];

        if (array.length > 0) {
            System.out.print("Enter the value of all items (separated by space) : ");
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
                //array[i] = in.nextFloat();
                //array[i] = in.nextDouble();
            }
        }
        in.close();

        //using method print()
        print(array);

        //using method arrayToString()
        System.out.println("The values are: [" + arrayToString(array) + "]");

        //using method contains()
        System.out.println(contains(array, key));

        //using method search()
        System.out.println(search(array, key));

        //using method equals()
        System.out.println(equals(array1, array2));

        //using method copyOf()
        System.out.println(Arrays.toString(copyOf(array)));
        System.out.println(Arrays.toString(copyOf(array, 5)));

        //using method swap()
        System.out.println(Arrays.toString(swap(array1, array2)));

        //using method reverse()
        reverse(array);
    }
}
