package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String GAME_RULES = "What number is missing in the progression?";

    public static void gameProgression() {
        String[][] gameQuestionsAndAnswers = new String[Engine.ROUNDS_COUNT][Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int secretNumber = Utils.getRandomNumber(Engine.PROGRESSION_LENGTH);
            int firstNumOfProgression = Utils.getRandomNumber(Utils.MAX_RANDOM);
            int progressionStep = Utils.getRandomNumber(Engine.PROGRESSION_LENGTH);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < Engine.PROGRESSION_LENGTH; j++) {
                if (j == secretNumber) {
                    sb.append(".. ");
                    gameQuestionsAndAnswers[i][1] = String.valueOf(firstNumOfProgression + progressionStep * j);
                } else {
                    sb.append(firstNumOfProgression + progressionStep * j).append(" ");
                }
            }
            gameQuestionsAndAnswers[i][0] = sb.toString();
        }
        Engine.gameStart(GAME_RULES, gameQuestionsAndAnswers);
    }
}

