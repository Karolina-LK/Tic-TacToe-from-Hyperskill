import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        double percentage = scanner.nextDouble() / 100;
        double capital = scanner.nextDouble();

        int i = 0;
        while (money < capital) {
            ++i;
            money = money + money * percentage;
        }
        System.out.println(i);
    }
}