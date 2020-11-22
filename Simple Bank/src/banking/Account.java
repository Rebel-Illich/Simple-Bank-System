package banking;

import java.util.Random;

public class Account {
    private static final Random random = new Random();
    private static final String INN = "400000";

    private static long lastAccountNumber =1;

    private long accountNumber;
    private int checksum;
    private int pin;
    private long balance;

    public Account(final long id) {
        accountNumber = id;
        checksum = LuhnAlgorithm.calculateChecksum(INN + getAccountNumber());
        balance = 0;
        pin = generatePin();
    }

    public String getPinNumber(){
        return String.format("%04d", pin);
    }

    public String getAccountNumber() {
        return String.format("%09d", accountNumber);
    }



    public String getCardNumber(){
    return String.format("%s%09d%d", INN, accountNumber, checksum);
    }

    private static int generatePin(){
        return random.nextInt(10000);
    }

    public long getBalance(){
        return balance;
    }
}
