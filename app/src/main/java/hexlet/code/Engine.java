package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND = 3;
    public static final int BOUND = 100;

    public static void run(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        for (int i = 0; i < ROUND; i++) {
            String question = roundsData[i][0];
            String correctAnswer = roundsData[i][1];
            System.out.println("Question: " + question);
            System.out.println("Answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equalsIgnoreCase(correctAnswer)) {
                String part1 = ("'" + userAnswer + "'" + "is wrong answer ;(. Correct answer was");
                System.out.println(part1 + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
