package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static boolean gamePrime(int number) {
        if (number <= 1) {
            return false; // числа 0 и 1 не являются простыми
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static String[] generateRoundData() {
        Random random = new Random();
        var number = random.nextInt(100);
        var question = String.valueOf(number);
        var answer = gamePrime(number) ? "yes" : "no";
        return new String[] {question, answer};
    }
    public static void runGame() {
        final var description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundsData = new String[3][2];

        for (int i = 0; i < 3; i += 1) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(description, roundsData);
    }
}
