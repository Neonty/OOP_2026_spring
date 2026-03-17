package problem3;

public class Account {
    private double balance;
    private final int accNumber;

    public Account(int accountNumber){
        if (accountNumber <= 0){
            throw new IllegalArgumentException("Account number must be positive");
        }

        this.accNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double sum){
        if (sum > 0) {
            balance += sum;
        }
    }

    public void withdraw(double sum){
        if (sum > 0 && sum <= balance){
            balance -= sum;
        }
        else{
            System.err.println("Insufficient funds or invalid amount");
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accNumber;
    }

    public void transfer(double amount, Account other){
        if (other == null){
            throw new IllegalArgumentException("Target account cannot be null");
        }

        if (amount <= balance){
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    @Override
    public String toString(){
        return "Acc No: " + accNumber + ", Balance: $" + String.format("%.2f", balance);
    }

    public final void print(){
        System.out.println(this.toString());
    }
}