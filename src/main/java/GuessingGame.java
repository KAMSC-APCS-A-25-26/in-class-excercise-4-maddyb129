import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100");
        int num = 0;
        Random r = new Random();
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        int num2 = r.nextInt(100);
        // TODO: Use a do...while loop to read guesses until correct
        do {
            System.out.print("Enter your guess: ");
            num = sc.nextInt();
            if (num > num2)
            {
                System.out.println("Too high! Try again.");
            }
            if (num < num2)
            {
                System.out.println("Too low! Try again.");
            }
        } while (num != num2);
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        System.out.print("You got it!");
        // TODO: Use Scanner for input
    }
}
