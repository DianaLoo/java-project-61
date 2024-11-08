package hexlet.code.games;

//import java.util.Scanner;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    private static boolean gameEven(int number) {
        return number % 2 == 0; // тут проверяем что четное или нечетное и возвращаем boolean
    }
    private static String[] generateRoundData() {
        Random random = new Random();
        var number = random.nextInt(100);
        var question = String.valueOf(number);// конвертируем в строку;
        var answer = gameEven(number) ? "yes" : "no";// вычисляем правильный ответ для числа - "yes"|"no";
        return new String[] {question, answer}; // тут метод возвращает одномерный массив [5, "no"]
    }
    public static void runGame() {
        final var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[3][2]; // создаем пустой массив размера число 3 на 2 [ [], [], [] ]

        for (int i = 0; i < 3; i += 1) {
            roundsData[i] = generateRoundData(); // записываем в массив 3 на 2 результат генерации раунда
            // i = 0; [ [5, "no"], [], [] ]
            // i = 1; [ [5, "no"], [8, "yes"], [] ]
            // i = 2; [ [5, "no"], [8, "yes"], [50, "yes"] ]
        }
        Engine.run(description, roundsData);
    }

}
