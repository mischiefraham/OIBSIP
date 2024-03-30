import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String [] args){
        try (Scanner scanner = new Scanner(System.in)) {
            Random random= new Random();
            int minRange=1;
            int maxRange=100;
            int maxAttempts =5;
            int totalRounds=0;
            int score=0;
            System.out.println("\n***** WELCOME TO THE NUMBER GAME *****");
            int playAgain=1;
            while(playAgain==1){
                int generatedNumber= random.nextInt(maxRange - minRange +1)+minRange;
                int attempts=0;
                boolean guessedCorrectly=false;
                System.out.println("\nRound: "+(totalRounds+1));
                System.out.println("\nSystem has generated a number between " + minRange + "and "+maxRange+".");
                System.out.println("You hava "+maxAttempts+" attempts to guess the number. Good Luck!");
                totalRounds++;
                while(attempts<maxAttempts && !guessedCorrectly){
                    System.out.println("\nAttempt: "+(attempts +1)+"/"+maxAttempts);
                    System.out.print("Enter your guess => ");
                    int userGuess=scanner.nextInt();
                    if(userGuess< generatedNumber){
                        System.out.println("\n It's too low!");
                    }
                    else if(userGuess > generatedNumber){
                        System.out.println("It's too high!");
                    }
                    else
                    {
                        System.out.println("Bullseye!! You guessed the right one.");
                        guessedCorrectly=true;
                        score=score+1;
                    }
                    attempts++;
                }
            }
        }
    }
}
