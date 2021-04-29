import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();

            }

        }
// wyswietlanie
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(array[i][j]);
//
//            }
//            System.out.println();
//
//        }



        for (int i = 0; i < columns; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(array[rows - j][i] + " ");
            }
            System.out.println();
        }
    }
}