package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.getRandomInt;

public class Calculator {
    static final int ROUND = 3;
    private static String[] generateRoundData() {
        int number1 = getRandomInt(0, 100);
        int number2 = getRandomInt(0, 100);
        String operator = String.valueOf(getRandom());
        String question = number1 + " " + operator + " " + number2;
        String answer = String.valueOf(checkAnswer(number1, number2, operator));
        return new String[] {question, answer};
    }
    public static void runGame() {
        final var description = "What is the result of the expression?";
        String[][] roundsData = new String[ROUND][2];
        for (int i = 0; i < ROUND; i += 1) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(description, roundsData);
    }

    private static char getRandom() {
        int rdm = getRandomInt(0, 2);
        char[] operators = new char[]{'+', '-', '*'};
        return operators[rdm];
    }
    private static int checkAnswer(int randomNumber1, int randomNumber2, String randomOperator) {
        return switch (randomOperator) {
            case "+" -> randomNumber1 + randomNumber2;
            case "-" -> randomNumber1 - randomNumber2;
            case "*" -> randomNumber1 * randomNumber2;
            default -> 0;
        };
    }
}



