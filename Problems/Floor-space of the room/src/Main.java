import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

        while (scanner.hasNext()) {
            double result = 0;
            switch (shape) {
                case "triangle":
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    double p = ((a + b + c) * 0.5);
                    result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    break;
                case "rectangle":
                    int d = scanner.nextInt();
                    int e = scanner.nextInt();
                    result = d * e;
                    break;
                case "circle":
                    int r = scanner.nextInt();
                    result = 3.14 * r * r;
                    break;

            }
            System.out.println(result);
        }

    }
}