package banking;

import java.util.Random;

public class Account {
    private static final Random random = new Random();
    private static final String INN = "400000";

    private static long lastAccountNumber =1L;


    private long customerAccountNumber;
    private String cardNumber;
    private int checksum;
    private String pin;
    public Account(){
        customerAccountNumber = lastAccountNumber++;

        checksum = 0;
    }



    public String getCardNumber(){
    return String.format("%s%09d%d", INN, customerAccountNumber, checksum);
    }

    private static int generatePin(){
        return 0;
    }
}
