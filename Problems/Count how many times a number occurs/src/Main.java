import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        int i = 0;

        while (i < arr.length) {
            arr[i] = scanner.nextInt();
            i++;
        }
      //  System.out.println(Arrays.toString(arr));

        int n = scanner.nextInt();
        int counter = 0;

        for (int j = 0; j < arrSize; j++) {
            if (n == arr[j]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}