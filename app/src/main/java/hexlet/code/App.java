package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit? ");
        String gameNumber = scanner.next();
        System.out.println("Your choice: " + gameNumber);
        if (gameNumber.equals("1")) {
            System.out.println("Welcome to the Brain Games!");
            Cli.greeting();
        }
        if (gameNumber.equals("2")) {
            System.out.println("Welcome to the Brain Games!");
            Even.gameEven();
        }
    }

}
