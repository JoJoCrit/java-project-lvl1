package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'";

    public static void gamePrime() {
        String[] gameQuestions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Engine.getRandomNumber(Engine.MAX_RANDOM);
            gameQuestions[i] = Integer.toString(number);
            correctAnswers[i] = isPrime(number) ? "yes" : "no";
        }
        Engine.gameStart(GAME_RULES, gameQuestions, correctAnswers);
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
