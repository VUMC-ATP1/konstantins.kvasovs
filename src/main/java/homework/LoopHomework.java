package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 /*      //1.uzdevums
        int counter = 0;
        while (counter <= 100) {
            System.out.println("Enter number");
            int x = scanner.nextInt();
            counter = counter + x;
        }
        System.out.println("Total sum " + counter);


        //2.uzdevums
        int prime;
        boolean isPrime = true;
        System.out.println("Enter any number");
        int num = scanner.nextInt();
        for (int i = 2; i <= num; i++) {
            prime = num % 2;
            if (prime == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }

        //3.uzdevums
        int[] intArray = new int[10];
        String[] stringArray = {"red", "black", "green", "yellow"};
        char[] charArray = {'a', 'b', 'c', 'd',};

        for (int n = 0; n < intArray.length; n = n + 1) {
            intArray[n] = n * 2;
            System.out.print(intArray[n] + ", ");
        }
        System.out.println();

        for (char letter : charArray) {

            System.out.println(letter);

        }

        int a = 0;
        while (a < stringArray.length) {
            System.out.println(stringArray[a]);
            a = a + 1;

        }

        int[] intArray2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int f = 0;
        do {
            System.out.println(intArray2[f]);
            f = f + 1;


        } while (intArray2[f] < 90);

        //4.uzdevums
        int[] evenNumbers = new int [100];
        int p = 2;
        for (int e = 0; e < evenNumbers.length; e++){
            evenNumbers[e] = p;
            System.out.print(evenNumbers[e] + ", ");
            p = p + 2;
        }

        //5.uzdevums
        System.out.println("Please, enter number");
        int y = scanner.nextInt();
        int[] factorial = new int[y];
        for (int t = 0; t < factorial.length; t++) {
            factorial[t] = t + 1;
        }
        System.out.println(Arrays.toString(factorial));
        int sum = 1;
        for (int p = 0; p < factorial.length; p++){
            sum = sum * factorial[p];

        }
        System.out.println("Factorial of " + y + " equals: " + sum);

        }

*/
        //6.uzdevums

        int pincode = 1234;
        System.out.println("Please enter pincode");
        int pin = scanner.nextInt();
        int attempt = 1;

        if (pin == pincode) {
            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
        } else while (pin != pincode) {
            if (attempt == 3) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts");
                break;


            }
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");
            pin = scanner.nextInt();
            attempt++;
            continue;

        }


    }
}
























/*

6. Uzdevums
1.	Izstrāt kodu tā, lai lietotājam būtu tikai trīs mēģinājumi uzminēt pareizo konta PIN kodu. Jāizveido int konstanti, kur tiks saglabāts PIN (public final int  VARIABLE_NAME). Ja parole ir ievadīta pareizi, jāizvada uz ekrāna: “”. Ja parole nav pareiza, jāizvada uz ekrāna:  “”. Kad mēģinājumi beigušies, uz ekrāna jāizvada:  “”.

Koda augšupielāde github
1.	Visu uzrakstīto kodu vajag aizsūtīt uz Github:
a.	git add;
b.	git commit;
c.	git push.
2.	Saiti uz ‘LoopHomeWork.java’ klasi iesniegt zem mājās darba sekcijas edu.lv mājaslapā.
*/