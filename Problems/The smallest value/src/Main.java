import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int i = 1;
        long fact = 1;
        for (;fact <= num; i++) {
            fact = fact * i;
            if (fact > num) {
                break;
            }
        }
        System.out.println(i);
    }
}


