package classroom;

import java.sql.SQLOutput;

public class MyFirstJavaCode {
    /*
    Access modifiers:
    public, private, protected, default
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("First argument " + args[0]);
        System.out.println("Second argument " + args[1]);


        //Primitive data type (number)

        byte floorCount = 7;
        System.out.println("My house consists of " + floorCount + " floors");
        System.out.printf("My house consists of %d floors\n", floorCount);
        System.out.printf("My house consists of %d floors\n", floorCount);

        // %s for String
        // %d for Number

        short juniorTesterSalaryInEur = 1000;
        short salariesInIt[] = {1000, 2000, 3000};
        short emptySalariesArray[] = new short[4];
        emptySalariesArray[0] = 1000;
        emptySalariesArray[1] = 2000;
        emptySalariesArray[2] = 3000;
        emptySalariesArray[3] = 4000;
        System.out.println(emptySalariesArray[2]);


        System.out.println(juniorTesterSalaryInEur);
        System.out.printf("Average salary for Junior QA Engineer is: %d \n", juniorTesterSalaryInEur);

        int chinaPopulation = 1449687399;
        System.out.printf("China Population %d people\n", chinaPopulation);

        long currentWorldPopulation = 757238328;
        System.out.printf("World population is %d people\n", currentWorldPopulation);

        //floating number

        float myCurrentWeight = 88.8f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.89999d;
        System.out.println(gasPriceInEur);

        /*Logical boolean
          prefix: is, has
          Example:  isSummer, is Winter, hasItems
          Values: true, false (Default - false)
         */

        boolean isSummer = true;
        if (isSummer) {
            System.out.printf("now it is summer %b\n", isSummer);
        } else {
            System.out.println("it is not summer");
        }

        char firstNameLetter = 'K';
        System.out.println(firstNameLetter);

        //Non primitive String

        String myNameAndSurname = "Konstantins Kvasovs";
        System.out.println(myNameAndSurname);

        //Afirmetic operators

        System.out.println(7 + 7);

        int a = 18;
        int b = 5;
        System.out.println(a + b);
        int c = a + b;
        System.out.println(c);

        boolean isAGreaterThenB = a > b;
        System.out.println(isAGreaterThenB);
    }
}