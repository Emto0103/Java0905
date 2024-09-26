package chp08.ex8_8;

public class Account {

    private String accNumber;
    private String name;
    private String pwd;

    private int balance;

    public Account(String accNumber, String name, String pwd, int balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.pwd = pwd;
        this.balance = balance;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public int getBalance() {
        return balance;
    }

    // 입금하는 메소드: deposit

    // 출금하는 메소드: withdraw

    @Override
    public String toString() {
        return "Account [accNumber=" + accNumber + ", name=" + name + ", pwd=" + pwd;
    }
}
