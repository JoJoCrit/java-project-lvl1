package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static final String GAME_RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void gameEven() {

        String[] gameQuestions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Engine.getRandomNumber(Engine.MAX_RANDOM);
            gameQuestions[i] = Integer.toString(number);
            correctAnswers[i] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.gameStart(GAME_RULES, gameQuestions, correctAnswers);
    }
}

