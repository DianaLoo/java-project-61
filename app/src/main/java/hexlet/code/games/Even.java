package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static boolean gameEven(int number) {
        return number % 2 == 0;
    }
    private static String[] generateRoundData() {
        Random random = new Random();
        var number = random.nextInt(100);
        var question = String.valueOf(number);
        var answer = gameEven(number) ? "yes" : "no";
        return new String[] {question, answer};
    }
    public static void runGame() {
        final var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[3][2];
        for (int i = 0; i < 3; i += 1) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(description, roundsData);
    }
}
