package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("checking_accounts")
@NoArgsConstructor
@AllArgsConstructor
public class Checking implements Account {

    @Id
    private String id;
    private String accountHolder;
    private double balance;
    private double insufficientFundFee;

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdrawal(double amount) {
        if (this.balance - amount < 0) {
            this.balance -= insufficientFundFee;
        } else {
            this.balance -= amount;
        }
    }

    @Override
    public void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

    public String processingCheck(String check) {
        return "Processed check: " + check;
    }
    @Override
    public String getAccountHolder() {
        return this.accountHolder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
    
    public double getInsufficientFundFee() {
        return this.insufficientFundFee;
    }
}