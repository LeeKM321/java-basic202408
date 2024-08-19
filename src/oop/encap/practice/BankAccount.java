package oop.encap.practice;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private long balance;

    public BankAccount(String accountNumber, String accountHolder, long balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        if (money < 0) {
            System.out.println("입금액이 올바르지 않습니다.");
            return;
        }
        this.balance += money;
    }

    public void withdraw(int money) {
        if (money < 0 || money > this.balance) {
            System.out.println("잔액이 부족하거나 잘못된 출금액입니다.");
            return;
        }
        this.balance -= money;
    }



}











