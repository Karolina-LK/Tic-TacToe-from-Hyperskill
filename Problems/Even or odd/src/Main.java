import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input % 2 == 0 && input != 0) {
                System.out.println("even");
            } else if (input % 2 != 0) {
                System.out.println("odd");
            } else if (input == 0) {
                break;
            }
        }
    }
}