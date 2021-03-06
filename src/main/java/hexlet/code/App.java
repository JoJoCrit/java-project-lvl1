package hexlet.code;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");


        Scanner sc = new Scanner(System.in);
        String select = String.valueOf(sc.nextInt());

        System.out.println("Your choice: " + select);
        // logic
        switch (select) {
            case "1" -> Cli.helloUser();
            case "2" -> Even.gameEven();
            case "3" -> Calc.gameCalc();
            case "4" -> GCD.gameGCD();
            case "5" -> Progression.gameProgression();
            case "6" -> Prime.gamePrime();
            case "0" -> System.out.println("Exit");
            default -> System.out.println("Sorry, unknown command!");
        }
    }
}




