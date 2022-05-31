package classroom;

public class Operators {
    public static void main(String[] args) {

        //Equal to ==
        int a = 10;
        int b = 10;

        System.out.println(a==b); //false or true

        //Not equal to !=
        System.out.println(a!=b);

        //Less than <
        int x = 30;
        int y =50;
        System.out.println(x < y);

        //Greater than
        System.out.println(x > y);

        //Less than or equal to
        System.out.println(x >= y);

        String name = new String("Nikita");
        String name2 = "Nikita";
        System.out.println(name.equals(name2));
        System.out.println(name == name2);

        //Logical operators
        x = 10;
        boolean result = x <5 && x <10;
        System.out.println(result);

        result = 3 < 5 && 4 > 5;
        System.out.println(result);

        result = 3 < 5 && 4 < 5;
        System.out.println(result);

        result  = 3 < 5 || 4 > 5;
        System.out.println(result);


    }
}
