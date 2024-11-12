package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    static final int BOUND = 100;


    private static String[] generateRoundData() {
        Random random = new Random();
        var number1 = random.nextInt(BOUND);
        var step = 1 + random.nextInt(10);
        var size = 5 + random.nextInt(5);
        var value = random.nextInt(size);
        var progression = checkAnswer(number1, step, size);
        String[] prog = new String[2];
        prog[1] = progression[value];
        progression[value] = "..";
        String question = String.join(" ",progression);
        prog[0] = question;
        return prog;
    }

    public static void runGame() {
        final var description = "What number is missing in the progression?";
        String[][] roundsData = new String[3][2];

        for (var i = 0; i < 3; i ++) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }

    public static String[] checkAnswer(int number1, int step, int size) {
        var progression = new String[size];
        progression[0] = String.valueOf(number1);
        for( var i = 1; i < size; i++) {
        number1 += step;
        progression[i] = String.valueOf(number1);
        }
        return progression;
    }
}

