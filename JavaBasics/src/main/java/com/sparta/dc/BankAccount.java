package com.sparta.dc;

public class BankAccount {
    private final String accountNumber;
    private String accountName;
    private final String sortCode;
    private String debitCard;
    private String debitPin;
    private float bankBalance;

    public BankAccount(/*String accountNumber, String sortCode*/) {
        // this.accountNumber = accountNumber;
        // this.sortCode = sortCode;
        this.accountNumber = "58319579";
        this.accountName = "John Bankman";
        this.sortCode = "62-97-15";
        this.debitCard = "1234567890123456";
        this.debitPin = "0876";
        this.bankBalance = 1000000.50f;
    }

    public Boolean setPin(String currentPin, String newPin) {
        if (checkPin(currentPin) && newPin.length() == 4) {
            debitPin = newPin;
            return true;
        }
        return false;
    }

    private Boolean checkPin(String currentPin) {
        return debitPin.equals(currentPin);
    }

    // Getters
    public String getAccountName(String currentPin) {
        if (checkPin(currentPin)) {
            return accountName;
        }
        return "error";
    }

    public String getBankBalance(String currentPin) {
        if (checkPin(currentPin)) {
            return Float.toString(bankBalance);
        }
        return "error";
    }

    public String getAccountNumber(String currentPin) {
        if (checkPin(currentPin)) {
            return accountNumber;
        }
        return "error";
    }

    public String getSortCode(String currentPin) {
        if (checkPin(currentPin)) {
            return sortCode;
        }
        return "error";
    }
}
