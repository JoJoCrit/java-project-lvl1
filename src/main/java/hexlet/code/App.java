package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        int select;
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        System.out.println("Your choice: " + select);

        // logic

        switch (select) {
            case 1 -> Cli.helloUser();
            case 2 -> Even.gameEven();
            case 0 -> System.out.println(" ");
            default -> System.out.println("Exit");
        }
    }
}




