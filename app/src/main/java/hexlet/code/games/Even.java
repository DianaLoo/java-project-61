package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomInt;

public class Even {

    private static boolean gameEven(int number) {
        return number % 2 == 0;
    }
    private static String[] generateRoundData() {
        var number = getRandomInt(0, Engine.BOUND);
        var question = String.valueOf(number);
        var answer = gameEven(number) ? "yes" : "no";
        return new String[] {question, answer};
    }
    public static void runGame() {
        final var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.ROUND][2];
        for (int i = 0; i < Engine.ROUND; i += 1) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(description, roundsData);
    }
}
