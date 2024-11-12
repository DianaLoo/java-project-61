package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void run(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        var round = 3;
        for (int i = 0; i < round; i++) {
            String question = roundsData[i][0];
            String correctAnswer = roundsData[i][1];
            System.out.println("Question: " + question);
            System.out.println("Answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equalsIgnoreCase(correctAnswer)) {
                String part1 = ("'" + userAnswer + "'" + "is wrong answer ;(. Correct answer was");
                System.out.println(part1 + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            System.out.println("Correct!");
            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }

}
