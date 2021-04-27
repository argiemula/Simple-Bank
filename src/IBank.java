public interface IBank {
    void withdraw(double amount);
    void deposit(double amount);
    double balanceInquiry();
    void exit();

}