package chp08.exam1;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);
        while (a.transfer(b, 3000)) {
            System.out.println("A 계좌에서 B 계좌로 송금이 되었습니다.");
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
}

class Account {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean transfer(Account other, int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            other.balance += amount;
            return true;
        }
        return false;
    }

    public String toStr() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
