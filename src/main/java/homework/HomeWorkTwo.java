package homework;

import java.util.Scanner;

public class HomeWorkTwo<x> {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digit");
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println(true);
        } else if (x < 0) {
            System.out.println(false);

        } else if (x > 5 && x <= 10) {
            System.out.println(true);
        } else if (x > 5 && x < 10) {
            System.out.println(true);
        } else if (x == 5 || x == 10) {
            System.out.println(false);
        } else if (x * x > 10) {
            System.out.println(true);
        }
        System.out.println("Month");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 111:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

        }
        System.out.println("Enter 1st digit");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd digit");
        int b = scanner.nextInt();
        System.out.println("Enter 3rd digit");
        int c = scanner.nextInt();
        System.out.println(Math.max(Math.max(a, b), c));

        System.out.println("Enter streetlight color");
        String color = scanner.next();
        if (color.equals("Red")) {
            System.out.println("Stop");
        } else if (color.equals("Yellow")) {
            System.out.println("Set");
        } else if (color.equals("Green")) {
            System.out.println("go!");
        } else {
            System.out.printf("Wrong color");
        }
        public static void Card (String firstName, String secondName, long number, double birthDate){
            firstName =
        }


        }
    }



