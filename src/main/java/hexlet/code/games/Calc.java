package hexlet.code.games;
import hexlet.code.Engine;


public class Calc {

    public static final String GAME_RULES = "What is the result of the expression?";
    private static final String[] MATH_OPERATOR = new String[]{"+", "-", "*"};
    private static String gameCalcLogic(int firstRandomNumber, int secondRandomNumber, String randomOperator) {
        int result;
        if ("+".equals(randomOperator)) {
            result = firstRandomNumber + secondRandomNumber;
        } else if ("-".equals(randomOperator)) {
            result = firstRandomNumber - secondRandomNumber;
        } else if ("*".equals(randomOperator)) {
            result = firstRandomNumber * secondRandomNumber;
        } else {
            return "";
        }
        return String.valueOf(result);
    }

    public static void gameCalc() {
        String[] gameQuestions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int firstRandomNumber = Engine.getRandomNumber(Engine.MAX_RANDOM);
            int secondRandomNumber = Engine.getRandomNumber(Engine.MAX_RANDOM);

            String randomOperator = MATH_OPERATOR[Engine.getRandomNumber(MATH_OPERATOR.length)];


            gameQuestions[i] = String.format("%s %s %s", firstRandomNumber, randomOperator, secondRandomNumber);
            correctAnswers[i] = gameCalcLogic(firstRandomNumber, secondRandomNumber, randomOperator);

        }
        Engine.gameStart(GAME_RULES, gameQuestions, correctAnswers);
    }
}
