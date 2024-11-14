package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Utils.getRandomInt;

public class Progression {
    static final int BOUND = 100;
    static final int ROUND = 3;
    static final int MAXSIZE = 10;
    static final int MINSIZE = 5;
    private static String[] generateRoundData() {
        Random random = new Random();
        var number1 = getRandomInt(0, BOUND);
        var step = getRandomInt(0, MAXSIZE);
        var size = getRandomInt(MINSIZE, MAXSIZE);
        var value = random.nextInt(size);
        var progression = checkAnswer(number1, step, size);
        String[] prog = new String[2];
        prog[1] = progression[value];
        progression[value] = "..";
        String question = String.join(" ", progression);
        prog[0] = question;
        return prog;
    }

    public static void runGame() {
        final var description = "What number is missing in the progression?";
        String[][] roundsData = new String[ROUND][2];

        for (var i = 0; i < ROUND; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }

    public static String[] checkAnswer(int number1, int step, int size) {
        var progression = new String[size];
        progression[0] = String.valueOf(number1);
        for (var i = 1; i < size; i++) {
            number1 += step;
            progression[i] = String.valueOf(number1);
        }
        return progression;
    }
}

