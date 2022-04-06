package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String GAME_RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void gameEven() {

        String[][] gameQuestionsAndAnswers = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandomNumber(Utils.MAX_RANDOM);
            gameQuestionsAndAnswers[i][0] = Integer.toString(number);
            gameQuestionsAndAnswers[i][1] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.gameStart(GAME_RULES, gameQuestionsAndAnswers);
    }
}

