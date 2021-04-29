import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        // dlaczego jak tu usiluje ja wydrukowac, to mi szaleje?

        int max = array[0][0];
        int rows = 0;
        int cols = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                    rows = i;
                    cols = j;
                }
            }
        }
        System.out.println(rows + " " + cols);
    }
}