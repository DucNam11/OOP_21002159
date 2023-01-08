import java.util.Scanner;

import static java.util.Arrays.sort;

public class GradesStatistics {
    public static int[] grades;

    public static void readGrades() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();

        grades = new int[numStudents];

        if (numStudents > 0) {
            for (int studentNo = 1; studentNo <= numStudents; studentNo++) {
                System.out.print("Enter the grade for student " + studentNo + ": ");
                grades[studentNo - 1] = in.nextInt();
            }
            in.close();
        }
    }

    public static void print(int[] array) {

        StringBuilder values = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                values.append(array[i]);
            } else {
                values.append(", ").append(array[i]);
            }
        }
        System.out.println("[" + values + "]");
    }

    public static double getAverage(int[] array) {
        double total = 0.0;
        for (int j : array) {
            total += j;
        }
        double average = total / array.length;
        return (double) Math.round(average * 100) / 100;
    }

    public static double getMedian(int[] array) {
        sort(array);
        double median;
        int length = array.length;
        if (length % 2 == 0) {
            median = (double) (array[length / 2] + array[length / 2 - 1]) / 2;
        } else {
            median = array[length / 2];
        }
        return (double) Math.round(median * 100) / 100;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static double getStdDev(int[] array) {
        double stdDev;
        double total = 0.0;
        int length = array.length;

        for (double num : array) {
            total += Math.pow(num - getAverage(array), 2);
        }
        stdDev = Math.sqrt(total / length);
        return (double) Math.round(stdDev * 100) / 100;
    }

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.println("The average is: " + getAverage(grades));
        System.out.println("The median is: " + getMedian(grades));
        System.out.println("The minimum is: " + getMin(grades));
        System.out.println("The maximum is: " + getMax(grades));
        System.out.println("The standard deviation is: " + getStdDev(grades));
    }

}
