package classroom;

import java.util.Scanner;

public class Excersise {
    public static void main(String[] args) {
        int a,b,c;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digit");
        a = scanner.nextInt();
        System.out.println("Operation");
        operation = scanner.next().charAt(0);
        System.out.println("Digit");
        b = scanner.nextInt();
        switch (operation) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);


        }



    }
}
