package chp12.ex12_9;

public class BankAccount {
    public BankAccount(String username, String number, long balance) {
        this.username = username;
        this.number = number;
        this.balance = balance;
    }

    private final String username;
    private final String number;
    private long balance;

    @Override
    public String toString(){
      return String.format("%s / %s / %d", username, number, balance);
    }
}
