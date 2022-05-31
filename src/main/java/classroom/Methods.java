package classroom;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int a, b,method;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digital");
        a = scanner.nextInt();
        System.out.println("Digital");
        b = scanner.nextInt();
        System.out.println("Operation");
        method = scanner.nextInt();
        switch (method){
            case 1:
                plus(a, b);
                break;
            case 2:
                System.out.println(minus(a, b));
                break;
            case 3:
                System.out.println(multiply(a ,b));
                break;
            case 4:
                System.out.println(divide(a ,b));
        }



    }

    public static void plus(int a, int b) {
        System.out.println(a + b);
    }

    public static int minus(int a, int b) {
        return a - b;

    }
    public static int multiply(int a, int b) {
        return a * b;

    }
    public static int divide(int a, int b) {
        return a / b;

    }


}
