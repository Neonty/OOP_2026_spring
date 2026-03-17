package problem3;
import java.util.Vector;

public class Bank {
    private final Vector<Account> accounts;

    public Bank(){
        this.accounts = new Vector<>();
    }

    public void openAccount(Account account){
        if (account != null){
            accounts.add(account);
        }
    }

    public void closeAccount(int accountNumber){
        accounts.removeIf(acc -> acc.getAccountNumber() == accountNumber);
    }

    public void update(){
        for (Account acc : accounts){
            if (acc instanceof SavingsAccount){
                ((SavingsAccount) acc).addInterest();
            }
            else if (acc instanceof CheckingAccount){
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void displayAccounts(){
        for (Account acc : accounts) {
            acc.print();
        }
    }
} 
