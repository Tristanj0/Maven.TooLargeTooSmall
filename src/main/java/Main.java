import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    //    Write a guessing game which prompts a user to guess a mystery number within some range.
//    After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
//    Upon termination, the program should display the number of guesses before successfully guessing correctly.
//    A number that is input consecutively, should register as a single guess.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 45;
        boolean guess;
        System.out.println("Guess the number");
        int userInput = input.nextInt();

        do {
            if (userInput < answer) {
                System.out.println("TOO LOW");
                System.out.println("Guess again");
                userInput = input.nextInt();
                guess = true;
            } else if (userInput > answer) {
                System.out.println("TOO HIGH");
                System.out.println("Guess again");
                userInput = input.nextInt();
                guess = true;
            } else {
                System.out.println("Correct answer");
                guess = false;
            }
        }
        while (guess);
    }
}
