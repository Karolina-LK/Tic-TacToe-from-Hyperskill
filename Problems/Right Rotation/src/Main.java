import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arrA = new int[2];
        int[] arrB = new int[2];

        //     int shift;


//wartosc do arr ai b, wyswietl, w create arr zmienic, reszta wykoment


        createArray(arrA, arrB);

//        shift = arrB[arrB.length - 1];
//        //  shift = shift % arrB.length;
//        arrB = Arrays.copyOf(arrB, arrB.length - 1);
//        shift = shift % arrB.length;
//
//        for (int i = 0; i < shift; i++) {
//            int current, previous;
//            previous = arrB[arrB.length - 1];
//            for (current = arrB.length - 1; current > 0; current--) {
//                arrB[current] = arrB[current - 1];
//            }
//            arrB[0] = previous;
//        }
//
//        for (int i : arrB) {
//            System.out.print(i + " ");
//        }

    }

    //
    public static String createArray(int[] arrA, int[] arrB) {

        arrA[0] = 1;
        arrA[1] = 2;
        arrB[0] = 1;
        arrB[1] = 3;
        //  Scanner scanner = new Scanner(System.in);
        //      int counter = 0;


//        while (scanner.hasNextInt()) {
//            arrB = new int[counter + 1];
//            System.arraycopy(arrA, 0, arrB, 0, arrA.length);
//            arrA = arrB;
//            arrB[counter] = scanner.nextInt();
//            counter++;
//        }


//        int[] arrD = new int[3];
//        return arrD;

        return Arrays.toString(arrA);

//        System.out.println(Arrays.toString(arrA));
//        System.out.println(Arrays.toString(arrB));

    }
}
