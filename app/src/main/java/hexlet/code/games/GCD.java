package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomInt;

public class GCD {

    private static String[] generateRoundData() {
        int number1 = getRandomInt(0, Engine.BOUND);
        int number2 = getRandomInt(0, Engine.BOUND);
        String question = number1 + " " + number2;
        String answer = checkAnswer(number1, number2);
        return new String[]{question, answer};
    }

    public static void runGame() {
        final var description = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[Engine.ROUND][2];
        for (int i = 0; i < Engine.ROUND; i += 1) {
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
