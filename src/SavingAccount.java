public class SavingAccount implements IBank{

    private double balance;

    public SavingAccount() {
        balance = 500;
    }

    @Override
    public void withdraw(double amount) {
        this.balance = this.balance -amount;
    }

    @Override
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public double balanceInquiry() {
        return this.balance;
    }


    @Override
    public void exit() {
        System.out.println("Thank you have a nice day!");
        System.exit(0);
    }
}
