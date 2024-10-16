package hexlet.code;

import java.util.Scanner;


public class Even {
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int countAnswer = 3;
        int count = 0;
        while (count < countAnswer) {

            int number = (int) (Math.random() * 100);
            String correctAnswer = " ";
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.println("Question: " + number);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");

            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n" +
                        "Let's try again, " + userName + "!");
                break;
            }
            count++;
            if (count == 3) {
                System.out.println("Congratulations," + userName + "!");
            }
        }

    }
}
