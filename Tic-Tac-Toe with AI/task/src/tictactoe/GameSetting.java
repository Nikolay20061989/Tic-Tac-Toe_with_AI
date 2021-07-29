package tictactoe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GameSetting {
    Scanner scanner = new Scanner(System.in);
    String setGame;
    String[] arrSetGame;
    int numberGame;

    public int set() {

        while (true) {
        System.out.println("Input command:");
        setGame = scanner.nextLine();

            arrSetGame = setGame.split(" ");
            if (arrSetGame.length == 3 && arrSetGame[0].equals("start")) {

                if (arrSetGame[1].equals("user") && arrSetGame[2].equals("user")) {
                    numberGame = 1;
                    break;
                }
                if (arrSetGame[1].equals("user") && arrSetGame[2].equals("easy")) {
                    numberGame = 2;
                    break;
                }
                if (arrSetGame[1].equals("easy") && arrSetGame[2].equals("user")) {
                    numberGame = 3;
                    break;
                }
                if (arrSetGame[1].equals("easy") && arrSetGame[2].equals("easy")) {
                    numberGame = 4;
                    break;
                }

                if (arrSetGame[1].equals("user") && arrSetGame[2].equals("medium")) {
                    numberGame = 5;
                    break;
                }
                if (arrSetGame[1].equals("medium") && arrSetGame[2].equals("user")) {
                    numberGame = 6;
                    break;
                }
                if (arrSetGame[1].equals("medium") && arrSetGame[2].equals("medium")) {
                    numberGame = 7;
                    break;
                }
                if (arrSetGame[1].equals("user") && arrSetGame[2].equals("hard")) {
                    numberGame = 8;
                    break;
                }
                if (arrSetGame[1].equals("hard") && arrSetGame[2].equals("user")) {
                    numberGame = 9;
                    break;
                }
                if (arrSetGame[1].equals("hard") && arrSetGame[2].equals("hard")) {
                    numberGame = 10;
                    break;
                }
                if (arrSetGame[1].equals("hard") && arrSetGame[2].equals("medium")) {
                    numberGame = 11;
                    break;
                }
                if (arrSetGame[1].equals("medium") && arrSetGame[2].equals("hard")) {
                    numberGame = 12;
                    break;
                }
                if (arrSetGame[1].equals("hard") && arrSetGame[2].equals("easy")) {
                    numberGame = 15;
                    break;
                }
                if (arrSetGame[1].equals("easy") && arrSetGame[2].equals("hard")) {
                    numberGame = 16;
                    break;
                }if (arrSetGame[1].equals("medium") && arrSetGame[2].equals("easy")) {
                    numberGame = 17;
                    break;
                }
                if (arrSetGame[1].equals("easy") && arrSetGame[2].equals("medium")) {
                    numberGame = 18;
                    break;
                }


            } else if (arrSetGame.length == 1 && arrSetGame[0].equals("exit")) {
                numberGame = -1;
                break;
            } else System.out.println("Bad parameters!");


        }


        return numberGame;
    }


}
