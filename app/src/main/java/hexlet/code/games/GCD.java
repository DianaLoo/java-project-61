package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    static final int BOUND = 100;

    private static String[] generateRoundData() {
        Random random = new Random();
        int number1 = random.nextInt(BOUND);
        int number2 = random.nextInt(BOUND);
        String question = number1 + " " + number2;
        String answer = checkAnswer(number1, number2);
        return new String[]{question, answer};
    }

    public static void runGame() {
        final var description = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[3][2];

        for (int i = 0; i < 3; i += 1) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }

    public static String checkAnswer(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return String.valueOf(a);
    }
}
