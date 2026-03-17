package problem3;

public class CheckingAccount extends Account{
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int accountNumber){
        super(accountNumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum){
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum){
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee(){
        if (transactionCount > FREE_TRANSACTIONS){
            int extraTransactions = transactionCount - FREE_TRANSACTIONS;
            double totalFee = extraTransactions * TRANSACTION_FEE;
            super.withdraw(totalFee);
        }

        transactionCount = 0;
    }

    @Override
    public String toString(){
        return super.toString() + " (Checking, Transactions: " + transactionCount + ")";
    }
}
