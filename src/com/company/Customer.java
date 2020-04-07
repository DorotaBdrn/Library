package com.company;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import static com.company.Main.chooseBook;

public class Customer {

    private int id;
    private String name;
    private String status;
    private int fees;
    private int feesInTotal;
    private LocalDate feesDate;

    public Customer() {
    }

    public Customer(int id, String name, String status, LocalDate feesDate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.feesDate = feesDate;
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

    public LocalDate getFeesDate() {
        return feesDate;
    }

    public void setFeesDate(LocalDate feesDate) {
        this.feesDate = feesDate;
    }

    public void paidFees(int fees) {
        feesInTotal += fees;
        Library.updateTotalMoneyEarned(feesInTotal);
    }

    public static void answer(int answerNumber) {
        switch (answerNumber) {
            case 1:
                System.out.println("I would like to borrow a book ");
        }
    }

    public static boolean secondBook() {
        System.out.println(" Would you like to borrow one more book  yes/no");
        Scanner scannerSecondBook = new Scanner(System.in);
        String secondBook = scannerSecondBook.nextLine();
        if (secondBook.equals("yes")) {
            System.out.println("Which book 1-6 would you like to borrow?");
            chooseBook();
            return true;
        } else
            System.out.println("Thank you, enjoy reading ");
        return false;
    }

    static Scanner sc = new Scanner(System.in);

    public static int newMemberId() {

        System.out.println("Add new Member. Enter an  id, name and status, first uniq id:");
        int newId = sc.nextInt();
        return newId;
    }

    public static String newMemberName() {
        System.out.println("enter a name");
        Scanner scanner1 = new Scanner(System.in);
        String newName = scanner1.nextLine();
        return newName;
    }

    public static String newMemberStatus() {
        System.out.println("enter a status");
        Scanner scanner2 = new Scanner(System.in);
        String newStatus = scanner2.nextLine();
        return newStatus;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' + "last fees:' " + feesDate + "\'" +
                "}\n";
    }


}
