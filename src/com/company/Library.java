package com.company;

import java.util.List;

public class Library {

    private String name;
    private static int moneyEarned;
    private static int moneySpent;
    private List<Worker> workers;
    private List<Customer> customers;

    public Library(List<Worker> workers, List<Customer> customers) {
        this.workers = workers;
        this.customers = customers;
        this.moneyEarned = 0;
        this.moneySpent = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(int moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public static int getMoneySpent() {
        return moneySpent;
    }

    public static void setMoneySpent(int moneySpent) {
        Library.moneySpent = moneySpent;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public static void updateTotalMoneySpent(int salary) {
        moneySpent -= salary;

    }

    public static void updateTotalMoneyEarned(int fees) {
        moneyEarned += fees;
    }
}
