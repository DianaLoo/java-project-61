package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
//import java.util.Scanner;

public class Calculator {
        static final int BOUND = 100;
        static final int OPERATOR = 3;

        private static String[] generateRoundData() {
            Random random = new Random();
            int number1 = random.nextInt(BOUND);
            int number2 = random.nextInt(BOUND);
            String operator = getRandom();
            String question = number1 + " " + operator + " " + number2;
            String answer = checkAnswer(number1, number2, operator);
            return new String[] {question, answer};
        }
        public static void runGame() {
    final var description = "What is the result of the expression?";
    String[][] roundsData = new String[3][2];

            for (int i = 0; i < 3; i += 1) {
        roundsData[i] = generateRoundData();
    }
            Engine.run(description, roundsData);
}

    private static String getRandom() {
        Random gen = new Random();
        int rdm = gen.nextInt(OPERATOR);
        String[] operators = {"+", "-", "*"};
        return operators[rdm];
    }
    private static String checkAnswer(int randomNumber1, int randomNumber2, String randomOperator) {
        switch (randomOperator) {
            case "+":
                return String.valueOf(randomNumber1 + randomNumber2);
            case "-":
                return String.valueOf(randomNumber1 - randomNumber2);
            case "*":
                return String.valueOf(randomNumber1 * randomNumber2);
            default:
                return "";
        }
    }
}



