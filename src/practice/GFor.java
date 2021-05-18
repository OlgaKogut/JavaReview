package practice;

import java.util.Locale;

public class GFor {
    public static void main(String[] args) {
        String bottlesOfBeer = " bottles of beer.";
        String strNoMore = "No more";

        for ( int beerBottleCount = 99; beerBottleCount >= 0; beerBottleCount--) {
            if (beerBottleCount == 0) {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
                System.out.println();
            } else if (beerBottleCount == 1) {
                System.out.println(beerBottleCount + " bottle of beer on the wall, " + beerBottleCount + " bottle of beer.");
                printTakeOneDown();
                System.out.println("no more bottles of beer on the wall.");
                System.out.println();
            } else if (beerBottleCount == 2) {
                System.out.print(beerBottleCount + " bottles of beer on the wall, " + beerBottleCount);
                printString(bottlesOfBeer);
                printTakeOneDown();
                System.out.println((beerBottleCount - 1)+ " bottle of beer on the wall.");
                System.out.println();
            } else {
                System.out.print(beerBottleCount + " bottles of beer on the wall, " + beerBottleCount);
                printString(bottlesOfBeer);
                printTakeOneDown();
                System.out.println((beerBottleCount - 1)+ " bottles of beer on the wall.");
                System.out.println();
            }

        }
    }

    private static void printTakeOneDown() {
        System.out.print("Take one down and pass it around, ");
    }

    private static void printString(String str) {
        System.out.println(str);
    }

    private static String toLowerCase(String str){
        String newString = str.toLowerCase(Locale.ROOT);
        return newString;
    }

}
