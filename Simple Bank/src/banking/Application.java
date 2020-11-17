package banking;

import java.util.Scanner;

public class Application implements Runnable {

    private final Scanner scanner = new Scanner(System.in);
    
    @Override
    public void run() {
        while (menu()) {

        }

    }

    private boolean menu() {
        System.out.println("1.Create an account\n" +
                "2.Log into account\n"+
                "0.Exit");
        switch(scanner.nextInt()){
            case 0:
                return false;
            case 1:
            case 2:
            default:
                System.out.println("Incorrect number!");
        }
        return true;
    }

}
