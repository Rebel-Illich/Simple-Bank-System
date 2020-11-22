package banking.domain;

import java.util.Objects;
import java.util.Random;

import static java.lang.String.format;

public final class Account {
    private static final Random random = new Random();
    private static final String IIN = "400000";
    private static long lastAccountNumber = 1;

    private final String cardNumber;
    private String pinNumber;
    private long balance;

    public Account(final long id) {
        var checksum = LuhnAlgorithm.calculateChecksum(IIN + format("%09d", id));
        balance = 0;
        cardNumber = format("%s%09d%d", IIN, id, checksum);
        pinNumber = format("%04d", generatePin());
    }


    public String getPinNumber() {
        return pinNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public long getBalance() {
        return balance;
    }



    private static int generatePin() {
        return random.nextInt(10000);
    }

}