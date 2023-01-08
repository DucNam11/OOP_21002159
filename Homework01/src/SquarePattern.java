import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {
        int size, row, col;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = sc.nextInt();
//        for (row = 1; row <= size; row++){
//            for(col = 1; col <= size; col++){
//                System.out.print(("# "));
//            }
//            System.out.println();
//        }
        row = 1;
        while (row <= size) {
            col = 1;
            row++;
            while (col <= size) {
                System.out.print("# ");
                col++;
            }
            System.out.println();
        }
    }
}
