package com.company.Bank;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (customers.contains(customerName)){
            System.out.println("Customer already exist in this branch");
            return false;
        } else {
            Customer newCustomer = new Customer(customerName, initialTransaction);
            customers.add(newCustomer);
            return true;
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName) {
        if (customers.contains(customerName)) {
            return customers.get(customers.indexOf(customerName));
        } else {
            return null;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        customer.addTransaction(transaction);
        if (customer.getTransactions().contains(transaction)) {
            return true;
        } else {
            return false;
        }
    }




}
