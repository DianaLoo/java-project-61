package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return min + random.nextInt((max - min) + 1);
    }
}
