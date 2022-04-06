package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MAX_RANDOM = 100;

    public static int getRandomNumber(int maxRandom) {
        Random random = new Random();
        return random.nextInt(maxRandom);
    }
}
