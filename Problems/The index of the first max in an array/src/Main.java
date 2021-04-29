import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        int max = 0;
        int index = 0;


        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
         System.out.println(Arrays.toString(arr));

        for (int i =0; i < arr.length; i++) {
            if (arr[i] > max) {
                 index = i;
                 max = arr[i];
            }
        }
        System.out.println(index);
    }
}