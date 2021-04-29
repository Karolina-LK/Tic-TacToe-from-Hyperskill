package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dash = "---------";
        String pipe = "|";
        String space = " ";
        String x = "X";
        String o = "O";

        int countX = 0;
        int countO = 0;
        int empty = 0;

        String[][] inputData = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inputData[i][j] = space;
                empty++;
            }
        }

        StringBuilder res = new StringBuilder();
        res.append(dash).append("\n");
        for (int i = 0; i < 3; i++) {
            res.append(pipe).append(space);
            for (int j = 0; j < 3; j++) {
                res.append(inputData[i][j]).append(space);
            }
            res.append(pipe).append("\n");
        }
        res.append(dash);
        System.out.println(res);

        String lastChar = o;
        boolean noEndGame = true;
        StringBuilder win = new StringBuilder();
        do {

            if ((countO - countX >= 2) || (countX - countO >= 2)) {
                System.out.println("Impossible");
                System.exit(0);
            }
            if (empty > 0) {
                Scanner scanner1 = new Scanner(System.in);
                boolean loop = true;

                do {
                    System.out.print("Enter the coordinates: ");
                    String additionalMove = scanner1.nextLine();
                    additionalMove = additionalMove.replaceAll("\\s+", "");

                    if (!additionalMove.matches(".*\\d.*")) {
                        System.out.println("You should enter numbers!");
                        continue;
                    }

                    if (additionalMove.length() > 2) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        continue;
                    }

                    int nX = 0;
                    int nY = 0;

                    for (int i = 0; i < additionalMove.length(); i++) {
                        if (i == 0)
                            nX = Integer.parseInt(String.valueOf(additionalMove.charAt(i))) - 1;
                        if (i == 1)
                            nY = Integer.parseInt(String.valueOf(additionalMove.charAt(i))) - 1;
                    }

                    if (nX < 0 || nX > 2 || nY < 0 || nY > 2) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        continue;
                    }

                    if (inputData[nX][nY].equals(space)) {
                        if (empty == 12 || lastChar.equals(x)) {
                            inputData[nX][nY] = o;
                            lastChar = o;
                            countX++;
                            empty--;
                        } else {
                            inputData[nX][nY] = x;
                            lastChar = x;
                            countO++;
                            empty--;
                        }
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }

                    loop = false;
                } while (loop);

                res = new StringBuilder();
                res.append(dash).append("\n");
                for (int i = 0; i < 3; i++) {
                    res.append(pipe).append(space);
                    for (int j = 0; j < 3; j++) {
                        res.append(inputData[i][j]).append(space);
                    }
                    res.append(pipe).append("\n");
                }
                res.append(dash);
                System.out.println(res);
            }


            boolean winnerGame = false;

            for (String charWinner : Arrays.asList(x, o)) {
                if (inputData[0][0].equals(charWinner) && inputData[1][1].equals(charWinner) && inputData[2][2].equals(charWinner)) {
                    win.append(charWinner);
                    winnerGame = true;
                } else if (inputData[0][2].equals(charWinner) && inputData[1][1].equals(charWinner) && inputData[2][0].equals(charWinner)) {
                    win.append(charWinner);
                    winnerGame = true;
                } else {
                    for (int i = 0; i < inputData.length; i++) {
                        if (inputData[i][0].equals(charWinner) && inputData[i][1].equals(charWinner) && inputData[i][2].equals(charWinner)) {
                            win.append(charWinner);
                            winnerGame = true;
                        }
                        if (inputData[0][i].equals(charWinner) && inputData[1][i].equals(charWinner) && inputData[2][i].equals(charWinner)) {
                            win.append(charWinner);
                            winnerGame = true;
                        }
                    }
                }
            }

            if ((win.length() > 1 && empty > 1) || (countO - countX >= 2) || (countX - countO >= 2)) {
                System.out.println("Impossible");
                System.exit(0);
            }

            if (win.length() == 0 && empty == 0) {
                System.out.println("Draw");
                System.exit(0);
            }

            if (winnerGame) {
                noEndGame = false;
            }
        } while (noEndGame);

        System.out.println(win + " wins");
    }
}