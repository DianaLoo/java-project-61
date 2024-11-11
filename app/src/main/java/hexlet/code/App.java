package hexlet.code;


import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calculator\n" +
                "4 - GCD\n" +
                "0 - Exit? ");

        String gameNumber = scanner.next();
        System.out.println("Your choice:" + gameNumber);

        switch (gameNumber) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.runGame();
                break;
            case "3":
                Calculator.runGame();
                break;
            case "4":
                GCD.runGame();
                break;
        }
        scanner.close();
    }
}
