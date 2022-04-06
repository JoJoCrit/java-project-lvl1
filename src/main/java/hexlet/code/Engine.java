package hexlet.code;
import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;
    private static int answerCOUNT = 0;
    public static final int PROGRESSION_LENGTH = 10;
    public static final String INCORRECT_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'.";

    public static void gameStart(String gameRules, String[][] gameQuestionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameRules);

        int i;
        for (i = 0; i < ROUNDS_COUNT; i++) {

            System.out.print("Question: ");
            System.out.println(gameQuestionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String playerAnswer = sc.nextLine();
            if (playerAnswer.equals(gameQuestionsAndAnswers[i][1])) {
                System.out.println("Correct!");
                answerCOUNT++;
            } else {
                System.out.printf((INCORRECT_ANSWER) + "%n", playerAnswer, gameQuestionsAndAnswers[i][1]);
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            if (answerCOUNT == ROUNDS_COUNT) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }
    }
}
