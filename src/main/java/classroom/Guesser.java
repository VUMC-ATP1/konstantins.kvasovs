package classroom;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
    public static void main(String[] args) {
        // Program generates number from 1 to 10
        // Users enters no 1 to 10
        // If  value is not in range, write error and start again

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        boolean isAnswerValid = false;

        System.out.println("Enter number");
        int answer = scanner.nextInt();

        while(answer!=randomNumber){
            if(answer <= 0 || answer > 10){
                System.out.println("Wrong input");
                answer = scanner.nextInt();
                continue;
            }
            System.out.println("Wrong");
            answer = scanner.nextInt();
        }
        System.out.println("You win!");
    }
}







