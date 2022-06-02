package classroom;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i > 50) {
                System.out.println(i + " ");
            }
        }

        int[] numbers = new int[100];

        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = i;
        }
        for (int j = 0; j <= numbers.length - 1; j++) {
            if (j % 2 == 0) {
                System.out.println(numbers[j]);

            }
        }


        int[] numberArray = new int[100];
        for (int f = 0; f <= numberArray.length - 1; f++) {
            numberArray[f] = f;
        }
        for (int num : numberArray) {
            System.out.println(num);
        }


        int houseCount = 0;
        int[] housesArray = new int[50];
        for (int w = 0; w <= housesArray.length - 1; w++) {
            housesArray[w] = w;
        }
        for (int house : housesArray) {
            if (house % 3 != 0 && house % 5 != 0) {
                System.out.println(house);
                houseCount = houseCount + 1;

            }
            System.out.println(houseCount);
        }
        int count = 0;
        String sentence = "Hello, my name is Konstantins";
        for (int f = 0; f < sentence.length(); f++) {
            if (sentence.charAt(f) == 'i') {
                count = count + 1;

            }

        }
        System.out.println(count);

        String[] countries = new String[]{"LV", "USA", "RO", "UK", "PL,", "NL", "ES", "CZ"};
        for (String country : countries) {
            System.out.println(country);
            if(country.equals("RO")){
                System.out.println("Will stop the loop");
                break;
            }
        }


        for (int g = 0; g <= 10; g++){
            if (g > 4 && g < 9){
                continue;
            }
            System.out.print(g + ", ");
        }

    }
}





