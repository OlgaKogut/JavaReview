package practice;

import java.util.Arrays;

public class J2DArrays {
    public static void main(String[] args) {
        String[] catsNames = new String[8];

        catsNames[0] = "Мурчик";
        catsNames[1] = "Чорний";
        catsNames[2] = "Мурка";
        catsNames[3] = "Барсік";
        catsNames[4] = "Рижик";
        catsNames[5] = "Ешлі";
        catsNames[6] = "Джина";
        catsNames[7] = "Машка";

        String[] catsColor = new String[8];
        catsColor[0] = "Grey";
        catsColor[1] = "Black";
        catsColor[2] = "Grey";
        catsColor[3] = "Brown";
        catsColor[4] = "Red";
        catsColor[5] = "Grey";
        catsColor[6] = "Red";
        catsColor[7] = "Grey";

        int catsAge[] = {2, 3, 4, 1, 5, 6, 9, 10};
        String[] catsAgeString = new String[catsAge.length];


        //int to str
        for (int boxNumber = 0; boxNumber < catsAge.length; boxNumber ++) {
            catsAgeString[boxNumber] = String.valueOf(catsAge[boxNumber]);
            System.out.println(catsAgeString[boxNumber]);
        }
        //System.out.println(catsAgeString[0].getClass());


        //Str to int
        String numberString = "1";
        int num = 1;
        int numberint = Integer.parseInt(numberString);
        if (numberint == num){
            System.out.println(true);
        }



        String[][] cats = new String[3][8];
        for (int row = 0; row < 3; row ++) {
            for (int cell = 0; cell < 8; cell ++) {
                if (row == 0) {
                    cats[row][cell] = catsNames[cell];
                } else if (row == 1) {
                    cats[row][cell] = catsAgeString[cell];
                }else if (row == 2) {
                    cats[row][cell] = catsColor[cell];
                }
            }
            System.out.println(Arrays.toString(cats[row]));
        }

        for (int cell = 0; cell < 8; cell ++) {
            for (int row = 0; row < 3; row ++) {
                //System.out.println();
                System.out.print(cats[row][cell] + " ");
                //System.out.println();
            }
            System.out.println();
            System.out.println("______________________________________");
        }

    }

}
