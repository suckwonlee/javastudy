package chp08.chp08_8;

public class Account {
    public Account(int balance, String name, String pwd, String accountNumber) {
        this.balance = balance;
        this.name = name;
        this.pwd = pwd;
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private int balance;
    private String name;
    private String pwd;
    private String accountNumber;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money) {
        balance -= money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
