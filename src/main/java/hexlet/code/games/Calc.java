package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    private static final String[] MATH_OPERATOR = new String[]{"+", "-", "*"};
    public static final String GAME_RULES = "What is the result of the expression?";

    public static void gameCalc() {

        String[][] gameQuestionsAndAnswers = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int firstRandomNumber = Utils.getRandomNumber(Utils.MAX_RANDOM);
            int secondRandomNumber = Utils.getRandomNumber(Utils.MAX_RANDOM);
            String randomOperator = MATH_OPERATOR[Utils.getRandomNumber(MATH_OPERATOR.length)];

            gameQuestionsAndAnswers[i][0] = String.format("%s %s %s", firstRandomNumber,
                    randomOperator, secondRandomNumber);
            gameQuestionsAndAnswers[i][1] = gameCalcLogic(firstRandomNumber, secondRandomNumber, randomOperator);

        }
        Engine.gameStart(GAME_RULES, gameQuestionsAndAnswers);
    }
    private static String gameCalcLogic(int firstRandomNumber, int secondRandomNumber, String randomOperator) {

        return switch (randomOperator) {
            case "+" -> Integer.toString(firstRandomNumber + secondRandomNumber);
            case "-" -> Integer.toString(firstRandomNumber - secondRandomNumber);
            case "*" -> Integer.toString(firstRandomNumber * secondRandomNumber);
            default -> "Sorry, unknown operator!";
        };
    }
}
