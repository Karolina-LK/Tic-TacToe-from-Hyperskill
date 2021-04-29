import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNo = 0;

        for(int i =1; i < 30000; i++){

            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                if (number % 4 ==0 && number > maxNo) {
                    maxNo = number;
                }
            } else {
                break;
            }
        }
        System.out.println(maxNo);
    }
}