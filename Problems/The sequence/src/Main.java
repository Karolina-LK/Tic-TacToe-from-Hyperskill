import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int max = 0;
        int i = 0;
        int n = scanner.nextInt();

        while (i <= n && i < 30000) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input % 4 == 0 && input > max) {
                    max = input;
                }
            }
            i++;
        }
        System.out.println(max);
    }
}