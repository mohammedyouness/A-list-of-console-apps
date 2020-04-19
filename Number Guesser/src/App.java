/*
* NumberGuesser App
* A simple console application written in Java - number guessing game.
* */

package numberGuesser;

import java.util.Scanner;

// Main Class
public class App {
    // Entry Point Method
    public static void main(String[] args) {

        GetAppInfo(); // Run GetAppInfo function to get info
        GreetUser(); // Ask for users name and greet

        while (true) {
            // Init correct number
            int correctNumber = getRandomNumber(1, 10);
            // Init guess var
            int guess = 0;
            // Ask user for number
            System.out.println("Guess a number between 1 and 10");
            // While guess is not correct
            while (guess != correctNumber) {
                // Get users input
                Scanner sc = new Scanner(System.in);
                int input;
                // Make sure its a number
                if(sc.hasNextInt())
                    input = sc.nextInt();
                else {
                    // Print error message
                    System.out.println("Please use an actual number");
                    // Keep going
                    continue;
                }
                // put the user's input in the guess variable
                guess = input;
                // Match guess to correct number
                if (guess != correctNumber) {
                    // Print error message
                    System.out.println("Wrong number, please try again");
                }
            }
            // Print success message
            System.out.println("CORRECT!! You guessed it!");

            // Ask to play again
            System.out.println("Play Again? [Y or N]");

            // Get answer
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine().toUpperCase();

            if (answer.equalsIgnoreCase("Y"))
                continue;
            else if (answer.equalsIgnoreCase("N"))
                return;
            else
                return;
        }

    }

    // Get and display app info
    private static void GetAppInfo() {
        String appName = "Number Guesser";
        String appVersion = "1.0.0";
        String appAuthor = "Mohamed Yunus";
        System.out.println(appName + ": " + "Version " + appVersion + " by " + appAuthor);

    }
    // Ask users name and greet
    private static void GreetUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String inputName = sc.nextLine();
        System.out.println("Hello " + inputName + ", let's play a game...");
    }
    // Generate a random number in a given range
    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    }
