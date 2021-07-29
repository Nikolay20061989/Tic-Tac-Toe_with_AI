package tictactoe;

public class Hard {
    public int[] hard(String bord[][],int x,int o,int a, int b){
        String iI=(x > o)?"O":"X";
        String iHe=(iI.equals("O"))?"X":"O";
        int[]xo=new int[2];


        if(bord[1][2].equals("_")){bord[1][2]=iI;}
        //1g
        else if (bord[0][1].equals(iI) && bord[0][2].equals(iI) && bord[0][3].equals("_")){
            bord[0][3]=iI;
        }else if (bord[0][1].equals("_") && bord[0][2].equals(iI) && bord[0][3].equals(iI)){
            bord[0][1]=iI;
        }else if (bord[0][1].equals(iI) && bord[0][2].equals("_") && bord[0][3].equals(iI)){
            bord[0][2]=iI;
        }
        //2g
        else if (bord[1][1].equals(iI) && bord[1][2].equals(iI) && bord[1][3].equals("_")){
            bord[1][3]=iI;
        }else if (bord[1][1].equals("_") && bord[1][2].equals(iI) && bord[1][3].equals(iI)){
            bord[1][1]=iI;
        }else if (bord[1][1].equals(iI) && bord[1][2].equals("_") && bord[1][3].equals(iI)){
            bord[1][2]=iI;
        }
        //3g
        else if (bord[2][1].equals(iI) && bord[2][2].equals(iI) && bord[2][3].equals("_")){
            bord[2][3]=iI;
        }else if (bord[2][1].equals("_") && bord[2][2].equals(iI) && bord[2][3].equals(iI)){
            bord[2][1]=iI;
        }else if (bord[2][1].equals(iI) && bord[2][2].equals("_") && bord[2][3].equals(iI)){
            bord[2][2]=iI;
        }
        //1v
        else if (bord[0][1].equals(iI) && bord[1][1].equals(iI) && bord[2][1].equals("_")){
            bord[2][1]=iI;
        }else if (bord[0][1].equals(iI) && bord[1][1].equals("_") && bord[2][1].equals(iI)){
            bord[1][1]=iI;
        }else if (bord[0][1].equals("_") && bord[1][1].equals(iI) && bord[2][1].equals(iI)){
            bord[0][1]=iI;
        }
        //2v
        else if (bord[0][2].equals(iI) && bord[1][2].equals(iI) && bord[2][2].equals("_")){
            bord[2][2]=iI;
        }else if (bord[0][2].equals(iI) && bord[1][2].equals("_") && bord[2][2].equals(iI)){
            bord[1][2]=iI;
        }else if (bord[0][2].equals("_") && bord[1][2].equals(iI) && bord[2][2].equals(iI)){
            bord[0][2]=iI;
        }
        //3v
        else if  (bord[0][3].equals(iI) && bord[1][3].equals(iI) && bord[2][3].equals("_")){
            bord[2][3]=iI;
        }else if (bord[0][3].equals(iI) && bord[1][3].equals("_") && bord[2][3].equals(iI)){
            bord[1][3]=iI;
        }else if (bord[0][3].equals("_") && bord[1][3].equals(iI) && bord[2][3].equals(iI)){
            bord[0][3]=iI;
        }
        //1d
        else if  (bord[0][1].equals(iI) && bord[1][2].equals(iI) && bord[2][3].equals("_")){
            bord[2][3]=iI;
        }else if (bord[0][1].equals(iI) && bord[1][2].equals("_") && bord[2][3].equals(iI)){
            bord[1][2]=iI;
        }else if (bord[0][1].equals("_") && bord[1][2].equals(iI) && bord[2][3].equals(iI)){
            bord[0][1]=iI;
        }
        //2d
        else if  (bord[2][1].equals(iI) && bord[1][2].equals(iI) && bord[0][3].equals("_")){
            bord[0][3]=iI;
        }else if (bord[2][1].equals(iI) && bord[1][2].equals("_") && bord[0][3].equals(iI)){
            bord[1][2]=iI;
        }else if (bord[2][1].equals("_") && bord[1][2].equals(iI) && bord[0][3].equals(iI)){
            bord[2][1]=iI;
        }

        //he
        else if (bord[0][1].equals(iHe) && bord[0][2].equals(iHe) && bord[0][3].equals("_")){
            bord[0][3]=iI;
        }else if (bord[0][1].equals("_") && bord[0][2].equals(iHe) && bord[0][3].equals(iHe)){
            bord[0][1]=iI;
        }else if (bord[0][1].equals(iHe) && bord[0][2].equals("_") && bord[0][3].equals(iHe)){
            bord[0][2]=iI;
        }
        //2g
        else if (bord[1][1].equals(iHe) && bord[1][2].equals(iHe) && bord[1][3].equals("_")){
            bord[1][3]=iI;
        }else if (bord[1][1].equals("_") && bord[1][2].equals(iHe) && bord[1][3].equals(iHe)){
            bord[1][1]=iI;
        }else if (bord[1][1].equals(iHe) && bord[1][2].equals("_") && bord[1][3].equals(iHe)){
            bord[1][2]=iI;
        }
        //3g
        else if (bord[2][1].equals(iHe) && bord[2][2].equals(iHe) && bord[2][3].equals("_")){
            bord[2][3]=iI;
        }else if (bord[2][1].equals("_") && bord[2][2].equals(iHe) && bord[2][3].equals(iHe)){
            bord[2][1]=iI;
        }else if (bord[2][1].equals(iHe) && bord[2][2].equals("_") && bord[2][3].equals(iHe)){
            bord[2][2]=iI;
        }
        //1v
        else if (bord[0][1].equals(iHe) && bord[1][1].equals(iHe) && bord[2][1].equals("_")){
            bord[2][1]=iI;
        }else if (bord[0][1].equals(iHe) && bord[1][1].equals("_") && bord[2][1].equals(iHe)){
            bord[1][1]=iI;
        }else if (bord[0][1].equals("_") && bord[1][1].equals(iHe) && bord[2][1].equals(iHe)){
            bord[0][1]=iI;
        }
        //2v
        else if (bord[0][2].equals(iHe) && bord[1][2].equals(iHe) && bord[2][2].equals("_")){
            bord[2][2]=iI;
        }else if (bord[0][2].equals(iHe) && bord[1][2].equals("_") && bord[2][2].equals(iHe)){
            bord[1][2]=iI;
        }else if (bord[0][2].equals("_") && bord[1][2].equals(iHe) && bord[2][2].equals(iHe)){
            bord[0][2]=iI;
        }
        //3v
        else if  (bord[0][3].equals(iHe) && bord[1][3].equals(iHe) && bord[2][3].equals("_")){
            bord[2][3]=iI;
        }else if (bord[0][3].equals(iHe) && bord[1][3].equals("_") && bord[2][3].equals(iHe)){
            bord[1][3]=iI;
        }else if (bord[0][3].equals("_") && bord[1][3].equals(iHe) && bord[2][3].equals(iHe)){
            bord[0][3]=iI;
        }
        //1d
        else if  (bord[0][1].equals(iHe) && bord[1][2].equals(iHe) && bord[2][3].equals("_")){
            bord[2][3]=iI;
        }else if (bord[0][1].equals(iHe) && bord[1][2].equals("_") && bord[2][3].equals(iHe)){
            bord[1][2]=iI;
        }else if (bord[0][1].equals("_") && bord[1][2].equals(iHe) && bord[2][3].equals(iHe)){
            bord[0][1]=iI;
        }
        //2d
        else if  (bord[2][1].equals(iHe) && bord[1][2].equals(iHe) && bord[0][3].equals("_")){
            bord[0][3]=iI;
        }else if (bord[2][1].equals(iHe) && bord[1][2].equals("_") && bord[0][3].equals(iHe)){
            bord[1][2]=iI;
        }else if (bord[2][1].equals("_") && bord[1][2].equals(iHe) && bord[0][3].equals(iHe)){
            bord[2][1]=iI;
        }
        /* проверяем свободные диагональные
        */

        else  if (bord[0][1].equals("_")&&bord[0][2].equals("_")&&bord[0][3].equals("_")&&bord[1][2].equals("_")&&
                  bord[1][1].equals("_")){bord[0][1]=iI;}

        else  if (bord[0][1].equals("_")&&bord[0][2].equals("_")&&bord[0][3].equals("_")&&bord[1][3].equals("_")&&
                  bord[2][3].equals("_")){bord[0][3]=iI;}

        else  if (bord[0][3].equals("_")&&bord[1][3].equals("_")&&bord[2][3].equals("_")&&bord[2][2].equals("_")&&
                  bord[2][1].equals("_")){bord[2][3]=iI;}
        else  if (bord[0][1].equals("_")&&bord[1][1].equals("_")&&bord[2][1].equals("_")&&bord[2][2].equals("_")&&
                bord[2][3].equals("_")){bord[2][1]=iI;}

        else {
            boolean bool = true;
            while (bool) {
                a = (int) (Math.random() * 3) + 1;
                b = (int) (Math.random() * 3) + 1;
                if (bord[a - 1][b].equals("_")) {
                    if (x > o) {
                        bord[a - 1][b] = "O";
                       // o++;
                    } else {
                        bord[a - 1][b] = "X";
                      //  x++;
                    }
                    bool = false;

                }
            }
        }if(iI.equals("X"))x++;
        else o++;
        xo[0]=x;
        xo[1]=o;
        return xo;

    }
}
