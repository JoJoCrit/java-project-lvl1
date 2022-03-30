package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    public static final String GAME_RULES = "Find the greatest common divisor of given numbers";

    public static void gameGCD() {

        String[] gameQuestions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstRandomNumber = Engine.getRandomNumber(Engine.MAX_RANDOM);
            int secondRandomNumber = Engine.getRandomNumber(Engine.MAX_RANDOM);
            gameQuestions[i] = String.format("%s %s", firstRandomNumber, secondRandomNumber);
            correctAnswers[i] = String.valueOf(gameGCDlogic(firstRandomNumber, secondRandomNumber));
        }
        Engine.gameStart(GAME_RULES, gameQuestions, correctAnswers);
    }

    private static int gameGCDlogic(int number1, int number2) {
        while (number1 > 0 && number2 > 0) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }
        return number1 + number2;
    }
}


