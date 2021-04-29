import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String question = "What programming language are you learning?";
        //System.out.println(question);
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            String result;
            switch (num) {
                case 1:
                    result = "Yes!";
                    break;
                case 2:
                case 3:
                case 4:
                    result = "No!";
                    break;
                default:
                    result = "Unknown number";
                    break;
            }
            System.out.println(result);
        }
    }
}