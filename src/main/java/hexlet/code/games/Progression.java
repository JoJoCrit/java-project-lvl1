package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final String GAME_RULES = "What number is missing in the progression?";

    public static void gameProgression() {
        String[] gameQuestions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int secretNumber = Engine.getRandomNumber(Engine.PROGRESSION_LENGTH);
            int firstNumOfProgression = Engine.getRandomNumber(Engine.MAX_RANDOM);
            int progressionStep = Engine.getRandomNumber(Engine.PROGRESSION_LENGTH);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < Engine.PROGRESSION_LENGTH; j++) {
                if (j == secretNumber) {
                    sb.append(".. ");
                    correctAnswers[i] = String.valueOf(firstNumOfProgression + progressionStep * j);
                } else {
                    sb.append(firstNumOfProgression + progressionStep * j).append(" ");
                }
            }
            gameQuestions[i] = sb.toString();
        }
        Engine.gameStart(GAME_RULES, gameQuestions, correctAnswers);
    }
}

