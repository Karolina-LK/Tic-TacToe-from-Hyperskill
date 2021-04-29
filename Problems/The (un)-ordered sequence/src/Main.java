import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int previous, current, ascending = 0, descending = 0;
        previous = scanner.nextInt();

        while ((current = scanner.nextInt()) != 0) {
            if (current > previous) {
                ascending++;
            }
            if (current < previous) {
                descending++;
            }
            previous = current;
        }
        System.out.println(ascending == 0 || descending == 0);

    }


}