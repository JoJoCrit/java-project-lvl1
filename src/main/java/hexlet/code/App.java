package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        int select;
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        System.out.println("Your choice: " + select);

        // logic

        if (select == 1) {
            Cli.helloUser();
        } else if (select == 2) {
            Even.gameEven();
        } else if (select == 3) {
            Calc.gameCalc();
        } else if (select == 0) {
            System.out.println(" ");
        } else {
            System.out.println("Exit");
        }
    }
}




