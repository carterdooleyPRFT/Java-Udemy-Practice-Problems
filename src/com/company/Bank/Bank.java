package com.company.Bank;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String branchName) {
        Branch newBranch = new Branch(branchName);
        if(branches.size() == 0 ){
            System.out.println("zero branches exists");
            branches.add(newBranch);
            return true;
        }
        System.out.println("I am looking for: " + branchName);
        if (findBranch(newBranch.getName()) == null) {
            branches.add(newBranch);
            return true;
        } else {
            System.out.println("Branch already exists");
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch dedicatedBranch = findBranch(branchName);

        if (dedicatedBranch.getCustomers().contains(customerName)) {
            dedicatedBranch.newCustomer(customerName, initialTransaction);
            return true;
        } else {
            System.out.print("Customer already exists in this branch");
            return false;
        }
    }

    private Branch findBranch(String branchName) {
        Branch thisBRanch = null;
        System.out.println("size of my branches: " + branches.size());
        for (int i = 0; i < branches.size(); i++) {
            System.out.println("index " + i);
//            System.out(branches.get(i).getName());
            if (branches.get(i).getName() == (branchName) && branches.indexOf(branchName) != -1) {
                thisBRanch = branches.get(branches.indexOf(branchName));
                return thisBRanch;
            }
        }
        //System.out.println("Branch not found");
        System.out.println(thisBRanch);
        return thisBRanch;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch.addCustomerTransaction(customerName, transaction)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        int x = 0;
        if (findBranch(branchName) != null) {
            Branch branch = findBranch(branchName);
            if (printTransactions == true) {
                while (x < branch.getCustomers().size()) {
                    Customer customer = branch.getCustomers().get(x);
                    System.out.print(customer);
                    System.out.print(customer.getTransactions());
                    x++;
                }
            } else {
                System.out.print(branch.getCustomers());
            }
            return true;
        } else {
            return false;
        }
    }


}
