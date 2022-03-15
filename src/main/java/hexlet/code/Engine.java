package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int MAX_RANDOM = 100;
    private static int answerCOUNT = 0;
    public static final String INCORRECT_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'.";

    public static String getUserName() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int getRandomNumber(int maxRandom) {
        Random random = new Random();
        return random.nextInt(maxRandom);
    }

    public static void gameStart(String gameRules, String[] gameQuestions, String[] correctAnswers) {
        String playerName = getUserName();
        System.out.println("Hello, " + playerName + "!");
        Scanner sc = new Scanner(System.in);
        System.out.println(gameRules);

        int i;
        for (i = 0; i < ROUNDS_COUNT; i++) {

            System.out.print("Question: ");
            System.out.println(gameQuestions[i]);
            System.out.print("Your answer: ");
            String playerAnswer = sc.nextLine();
            if (playerAnswer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
                answerCOUNT++;
            } else {
                System.out.printf((INCORRECT_ANSWER) + "%n", playerAnswer, correctAnswers[i]);
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            if (answerCOUNT == ROUNDS_COUNT) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }
    }
}
