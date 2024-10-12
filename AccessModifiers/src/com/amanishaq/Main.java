package com.amanishaq;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("Bob");
        bobsAccount.deposit(1000);
        bobsAccount.withdraw(500);
        bobsAccount.withdraw(-200);
        bobsAccount.deposit(-20);
        bobsAccount.calculateBalance();
        //bobsAccount.balance = 5000;

        System.out.println("Balance on account is " + bobsAccount.getBalance());
        //bobsAccount.transactions.add(4500);
        bobsAccount.calculateBalance();
    }
}
