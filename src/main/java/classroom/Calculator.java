package classroom;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        // - + / *
        char operator;
        System.out.println("First digit");
        a = scanner.nextInt();
        System.out.println("Operation");
        operator = scanner.next().charAt(0);
        System.out.println("Second digit");
        b = scanner.nextInt();
        // a, b , operator
        if (operator == '+') {
            System.out.println("result " + (a + b));
        } else if (operator == '-') {
            System.out.println("result " + (a - b));
        } else if (operator == '*') {
            System.out.println("result " + (a * b));
        } else if (operator == '/') {
            System.out.println("result " + (a / b));
        } else {
            System.out.println("wrong input");
        }


    }
}
