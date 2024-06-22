import java.util.Scanner;

class Game {
    private int score = 0;
    private int randomNumber;
    private Scanner sc = new Scanner(System.in);

    public Game() {
        randomNumber = random();
    }

    int setScore(int score) {
        this.score = score;
        return 0;
    }

    int getScore() {
        return score;
    }

    int random() {
        double num = Math.random() * 10;
        int num1 = (int) num;
        return num1;
    }

    int takeUserInput() {
        System.out.print("Enter the number: ");
        int i = sc.nextInt();
        return i;
    }

    int isCorrect(int userInput) {
        if (randomNumber == userInput) {
            System.out.println("The number matches with the random number");
            return 1;
        } else {
            if (randomNumber < userInput) {
                System.out.println("Your number is greater than the random number");
            } else {
                System.out.println("Your number is smaller than the random number");
            }
            return 0;
        }
    }

    int noOfGuess() {
        return getScore();
    }
}

public class guessGame {
    public static void main(String[] args) {
        int i = 0;
        Game g = new Game();

        while (g.isCorrect(g.takeUserInput()) != 1) {
            g.setScore(++i);
        }

        System.out.println("Number of guesses: " + g.noOfGuess());
    }
}
