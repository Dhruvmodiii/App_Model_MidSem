package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("saving_accounts")
@NoArgsConstructor
@AllArgsConstructor
public class Savings implements Account {

    @Id
    private String id;
    private String accountHolder;
    private double balance;
    private double interestRate;

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    @Override
    public void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void depositMonthlyInterest() {
        this.balance += (this.balance * interestRate / 100);
    }
    @Override
    public String getAccountHolder() {
        return this.accountHolder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
    public double getInterestRate() {
        return this.interestRate;
    }

}