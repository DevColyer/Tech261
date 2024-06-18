package com.sparta.dc;

public class ATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        System.out.println(account.getAccountName("0876"));
        System.out.println(account.getAccountNumber("0876"));
        System.out.println(account.getSortCode("0876"));
        System.out.println(account.getBankBalance("0876"));

        System.out.println(account.getAccountName("1234"));
        System.out.println(account.getAccountNumber("1234"));
        System.out.println(account.getSortCode("1234"));
        System.out.println(account.getBankBalance("1234"));
    }
}
