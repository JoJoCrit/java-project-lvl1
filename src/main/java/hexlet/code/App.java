package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int select;

        System.out.println("1 - Greet");

        System.out.println("2 - Even");

        System.out.println("0 - Exit");

        System.out.println("Please enter the game number and press Enter.");

        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();

        System.out.println("Your choice: " + select);

        // logic

        switch (select) {
            case 1:
                Cli.newUser();
                break;
            case 2:
                Cli.newUser();
                Even.gameEven();
                break;
            case 0:
                System.out.println(" ");
                break;
            default:
                System.out.println("Exit");
                break;
        }
    }
}




