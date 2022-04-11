package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final String GAME_RULES = "Find the greatest common divisor of given numbers";

    public static void gameGCD() {

        String[][] gameQuestionsAndAnswers = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstRandomNumber = Utils.getRandomNumber(Utils.MAX_RANDOM);
            int secondRandomNumber = Utils.getRandomNumber(Utils.MAX_RANDOM);
            gameQuestionsAndAnswers[i][0] = String.format("%s %s", firstRandomNumber, secondRandomNumber);
            gameQuestionsAndAnswers[i][1] = String.valueOf(findingGCD(firstRandomNumber, secondRandomNumber));
        }
        Engine.gameStart(GAME_RULES, gameQuestionsAndAnswers);
    }

    private static int findingGCD(int number1, int number2) {
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


