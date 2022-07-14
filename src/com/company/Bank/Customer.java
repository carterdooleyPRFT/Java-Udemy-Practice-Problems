package com.company.Bank;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();


    public Customer(String name, double initialTransaction) {
        this.name = name;
        transactions.add(initialTransaction);
    }


    public String getName() {
        return name;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
