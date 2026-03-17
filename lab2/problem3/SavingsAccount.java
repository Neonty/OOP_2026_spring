package problem3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double interestRate){
        super(accountNumber);
        
        if (interestRate < 0){
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }

        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public String toString(){
        return super.toString() + " (Savings, Interest Rate: " + interestRate + "%)";
    }
}
