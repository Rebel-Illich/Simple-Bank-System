package banking.repository;
import banking.Account;

import java.util.Optional;

public class SQLiteDatabase implements AccountsRepository {
    private final String databaseName;
    public SQLiteDatabase(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public Optional<Account> getAccount(String creditCardNumber, String pinNumber) {
        return Optional.empty();
    }

    @Override
    public Account createAccount() {
        return null;
    }
    
}
