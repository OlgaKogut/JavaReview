package practice;

import java.util.Arrays;

public class IArrays {
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

        //System.out.println(Arrays.toString(catsNames));
        for (int boxNumber = 0; boxNumber < catsNames.length; boxNumber ++) {
            System.out.println(catsNames[boxNumber]);
        }

        for (int boxNumber = catsNames.length - 1; boxNumber >= 0; boxNumber --) {
            System.out.println(catsNames[boxNumber]);
        }

        for (String cat : catsNames) {
            System.out.print(cat + " ");
        }

        for (int i = 0; i < catsAge.length; i ++) {
            catsAgeString[i] = String.valueOf(catsAge[i]);
            System.out.print(catsAgeString[i]);
        }

    }
}
