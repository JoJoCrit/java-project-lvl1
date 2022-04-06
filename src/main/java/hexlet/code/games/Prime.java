package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'";

    public static void gamePrime() {

        String[][] gameQuestionsAndAnswers = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandomNumber(Utils.MAX_RANDOM);
            gameQuestionsAndAnswers[i][0] = Integer.toString(number);
            gameQuestionsAndAnswers[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.gameStart(GAME_RULES, gameQuestionsAndAnswers);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
