import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine().replace(" ", "");
        String input2 = scanner.nextLine().replace(" ", "");

        System.out.println(input1.equals(input2));
    }
}