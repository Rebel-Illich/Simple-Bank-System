package banking;

public class Account {
    private static final String INN = "400000";

    private static long lastAccountNumber =1L;


    private long customerAccountNumber;
    private String cardNumber;
    private String pin;
    private int checksum = 0;


    public String getCardNumber(){
    return String.format("%s%09d%d", INN, customerAccountNumber, checksum);
    }
}
