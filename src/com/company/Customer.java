package com.company;

import java.util.Scanner;

public class Customer {

    private int id;
    private String name;
    private String status;
    private int fees;
    private int feesInTotal;

    public Customer(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.fees = 0;
        this.feesInTotal = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void paidFees(int fees) {
        feesInTotal += fees;
        Library.updateTotalMoneyEarned(feesInTotal);
    }

    public void answer(int answerNumber) {
        switch (answerNumber) {
            case 1:
                System.out.println("I would like to borrow a book ");
        }
    }

    public static void chooseTheBook() {
        Scanner scanner = new Scanner(System.in);
        String chosenBookTitle = scanner.nextLine();
    }

}
