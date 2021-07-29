package tictactoe;

import java.util.Scanner;

public class PlayBord {
    String[][] bord = new String[3][5];
    int a = 0;
    int b = 0;
    int win = 0;
    int x;
    int o;


    public void DrawBord(String coord) {

        bord[0][0] = "|";
        bord[1][0] = "|";
        bord[2][0] = "|";
        bord[0][4] = "|";
        bord[1][4] = "|";
        bord[2][4] = "|";
        String coordArr[] = coord.split("");

        bord[0][1] = coordArr[0];
        bord[0][2] = coordArr[1];
        bord[0][3] = coordArr[2];
        bord[1][1] = coordArr[3];
        bord[1][2] = coordArr[4];
        bord[1][3] = coordArr[5];
        bord[2][1] = coordArr[6];
        bord[2][2] = coordArr[7];
        bord[2][3] = coordArr[8];

        Game(bord);
    }

    public void Game(String bord[][]) {

        gameNum();
    }

    public void gameNum() {
        GameSetting gs = new GameSetting();
        int num = gs.set();
        prinbord(bord);
        if (num == 2) {
            while (win != 1) {
                readCoord();
                result();
                if (win == 1) break;
                easy();
                result();
                if (win == 1) break;
            }
        } else if (num == 3) {
            while (win != 1) {
                easy();
                result();
                if (win == 1) break;
                readCoord();
                result();
                if (win == 1) break;
            }

        } else if (num == 1) {
            while (win != 1) {
                readCoord();
                result();
                if (win == 1) break;
                readCoord();
                result();
                if (win == 1) break;
            }

        }else if (num == 4) {
            while (win != 1) {
                easy();
                result();
                if (win == 1) break;
                easy();
                result();
                if (win == 1) break;
            }
        }else if (num == 5) {
            while (win != 1) {
               readCoord();
                result();
                if (win == 1) break;
                medium();
                result();
                if (win == 1) break;
            }
        }else if (num == 6) {
            while (win != 1) {
                medium();
                result();
                if (win == 1) break;
                readCoord();
                result();
                if (win == 1) break;
            }
        }else if (num == 7) {
            while (win != 1) {
                medium();
                result();
                if (win == 1) break;
                medium();
                result();
                if (win == 1) break;
            }
        }else if (num == 17) {
            while (win != 1) {
                medium();
                result();
                if (win == 1) break;
                easy();
                result();
                if (win == 1) break;
            }
        }else if (num == 18) {
            while (win != 1) {
                easy();
                result();
                if (win == 1) break;
                medium();
                result();
                if (win == 1) break;
            }
        }else if (num == 8) {
            while (win != 1) {
               readCoord();
                result();
                if (win == 1) break;
               hard();
                result();
                if (win == 1) break;
            }}
        else if (num == 9) {
            while (win != 1) {
                hard();
                result();
                if (win == 1) break;
                readCoord();
                result();
                if (win == 1) break;
            }}
        else if (num == 10) {
            while (win != 1) {
                hard();
                result();
                if (win == 1) break;
                hard();
                result();
                if (win == 1) break;
            }}
        else if (num == 11) {
            while (win != 1) {
                hard();
                result();
                if (win == 1) break;
                medium();
                result();
                if (win == 1) break;
            }}
        else if (num == 12) {
            while (win != 1) {
                medium();
                result();
                if (win == 1) break;
                hard();
                result();
                if (win == 1) break;
            }}
        else if (num == 15) {
            while (win != 1) {
                hard();
                result();
                if (win == 1) break;
                easy();
                result();
                if (win == 1) break;
            }}
        else if (num == 16) {
            while (win != 1) {
                easy();
                result();
                if (win == 1) break;
                hard();
                result();
                if (win == 1) break;
            }}


    }

    public void prinbord(String bord[][]) {
        System.out.println("---------");
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[i].length; j++) {
                if (bord[i][j].equals("_")) System.out.print("  ");
                else System.out.print(bord[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    public void check() {

        if (a < 1 || a > 3) {
            System.out.println("Coordinates should be from 1 to 3!");

            readCoord();
        } else if (b < 1 || b > 3) {
            System.out.println("Coordinates should be from 1 to 3!");

            readCoord();
        } else if (!bord[a - 1][b].equals("_")) {
            System.out.println("This cell is occupied! Choose another one!");

            readCoord();
        }


    }

    public void readCoord() {
        System.out.println("Enter the coordinates:");
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            check();
        } catch (Exception e) {
            System.out.println("You should enter numbers!");
            readCoord();
        }
        if (x > o) {
            bord[a - 1][b] = "O";
            o++;
        } else {
            bord[a - 1][b] = "X";
            x++;
        }
        prinbord(bord);
    }

    public void result() {
        int temp = 0;
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[i].length; j++) {
                if (bord[i][j].equals("_")) temp++;
            }
        }
        if (bord[0][1].equals("X") && bord[0][2].equals("X") && bord[0][3].equals("X")) {
            System.out.println("X wins");
            win++;
        } else if (bord[1][1].equals("X") && bord[1][2].equals("X") && bord[1][3].equals("X")) {
            System.out.println("X wins");
            win++;
        } else if (bord[2][1].equals("X") && bord[2][2].equals("X") && bord[2][3].equals("X")) {
            System.out.println("X wins");
            win++;
        } else if (bord[0][1].equals("X") && bord[1][1].equals("X") && bord[2][1].equals("X")) {
            System.out.println("X wins");
            win++;
        } else if (bord[0][2].equals("X") && bord[1][2].equals("X") && bord[2][2].equals("X")) {
            System.out.println("X wins");
            win++;
        } else if (bord[0][3].equals("X") && bord[1][3].equals("X") && bord[2][3].equals("X")) {
            System.out.println("X wins");
            win++;
        } else if (bord[0][1].equals("X") && bord[1][2].equals("X") && bord[2][3].equals("X")) {
            System.out.println("X wins");
            win++;
        } else if (bord[2][1].equals("X") && bord[1][2].equals("X") && bord[0][3].equals("X")) {
            System.out.println("X wins");
            win++;
        } else if (bord[0][1].equals("O") && bord[0][2].equals("O") && bord[0][3].equals("O")) {
            System.out.println("O wins");
            win++;
        } else if (bord[1][1].equals("O") && bord[1][2].equals("O") && bord[1][3].equals("O")) {
            System.out.println("O wins");
            win++;
        } else if (bord[2][1].equals("O") && bord[2][2].equals("O") && bord[2][3].equals("O")) {
            System.out.println("O wins");
            win++;
        } else if (bord[0][1].equals("O") && bord[1][1].equals("O") && bord[2][1].equals("O")) {
            System.out.println("O wins");
            win++;
        } else if (bord[0][2].equals("O") && bord[1][2].equals("O") && bord[2][2].equals("O")) {
            System.out.println("O wins");
            win++;
        } else if (bord[0][3].equals("O") && bord[1][3].equals("O") && bord[2][3].equals("O")) {
            System.out.println("O wins");
            win++;
        } else if (bord[0][1].equals("O") && bord[1][2].equals("O") && bord[2][3].equals("O")) {
            System.out.println("O wins");
            win++;
        } else if (bord[2][1].equals("O") && bord[1][2].equals("O") && bord[0][3].equals("O")) {
            System.out.println("O wins");
            win++;
        } else if (temp == 0){ System.out.println("Draw"); win++;}

        //  else if (temp != 0) System.out.println("Game not finished");

    }

    public void easy() {
        System.out.println("Making move level \"easy\"");
        boolean bool = true;
        while (bool) {
            a = (int) (Math.random() * 3) + 1;
            b = (int) (Math.random() * 3) + 1;
            if (bord[a - 1][b].equals("_")) {
                if (x > o) {
                    bord[a - 1][b] = "O";
                    o++;
                } else {
                    bord[a - 1][b] = "X";
                    x++;
                }

                //  bord[a-1][b]="O";
                bool = false;
                prinbord(bord);

            }
        }

    }
    public void medium(){
        System.out.println("Making move level \"medium\"");
        Medium medium = new Medium();
        int xo[]=new int[2];
        xo=medium.med(bord,x,o,a,b);
        prinbord(bord);
        x=xo[0];
        o=xo[1];

    }
    public void hard(){
        System.out.println("Making move level \"hard\"");
        Hard hard  = new Hard();
        int xo[]=new int[2];
        xo=hard.hard(bord,x,o,a,b);
        prinbord(bord);
        x=xo[0];
        o=xo[1];

    }

}
