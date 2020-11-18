package banking;

import banking.repository.AccountsRepository;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.logging.Logger;

public class Application implements Runnable {
    private static final Logger log = Logger.getLogger(Application.class.getName());

    private final Scanner scanner = new Scanner(System.in);
    private final AccountsRepository repository;

    public Application(AccountsRepository repository){
        this.repository = repository;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("1.Create an account\n" +
                    "2.Log into account\n"+
                    "0.Exit");
            switch(scanner.nextInt()){
                case 0:
                    return false;
                case 1:
                    createAccount();
                case 2:
                    logIntoAccount();
                default:
                    System.out.println("Incorrect menu number!");
            }

        }

    }



    private void createAccount() {
        log.info("Create an account");
        final var account = repository.createAccount();

        System.out.println("Your account has been created\n" +
                "Your card number:\n" +
                "4000004938320895\n" +
                "Your card PIN:\n" +
                "6826" +
                "Your card number:\n" + account.getCardNumber() +
                        "\nYour card PIN:\n" + account.getPinNumber());
    }

    private String createCardNumber(){
        return "4000004938320895";
    }

    private void logIntoAccount(){
        log.info("Log into account");

        System.out.println("Enter your card number:");
        final var  cardNumber = scanner.nextLine();
        System.out.println("Enter your PIN:");
        final var pinNumber = scanner.nextLine();

        repository.getAccount(cardNumber, pinNumber)
                .ifPresentOrElse(this::manageAccount, this::wrongAccount);
    }

    private void wrongAccount(){
        log.warning("Wrong card number PIN!");
        System.out.println("Wrong card number or PIN!");
    }

    private void manageAccount(final Account account){
        log.info("You have successfully logged in!");

        System.out.println("You have successfully logged in!");
       while(true){
           System.out.println("1.Balance\n" + "2.Log out\n" + "0.Exit");
           final int choice = scanner.nextInt();
           switch(choice){
               case 0:
                   System.exit(0);
               case 1:
                   System.out.println("Balance: " + account.getBalance());
                   break;
               case 2:
                   return;
           }
       }
    }
}
