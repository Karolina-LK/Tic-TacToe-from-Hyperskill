import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        int[][] array = new int[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int purchase = scanner.nextInt();
        int counter;

        for (int i = 0; i < rows; i++) {
            counter = 0;
            for (int j = 0; j < seats; j++) {
                if(purchase == 0){
                    break;
                }

                if(array[i][j] == 0){
                    if(purchase > 1 && counter > 0 && j > 1 && array[i][j-1] != 0){
                        counter = 0;
                    } else {
                        counter++;
                    }
                }

                if (counter >= purchase) {
                    System.out.println(i+1);
                    System.exit(0);
                }
            }
        }

        System.out.println(0);
    }
}
