package com.company;

public class Worker implements Person {
    private int id;
    private String name;
    private int salary;
    private static int totalSalary;

    public Worker(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.totalSalary = 0;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getTotalSalary() {
        return totalSalary;
    }

    public static void setTotalSalary(int totalSalary) {
        Worker.totalSalary = totalSalary;
    }

    public void receivedSalary(int salary) {
        totalSalary += salary;
        Library.updateTotalMoneySpent(totalSalary);

    }


    @Override
    public void ask(int questionNumber) {

        switch (questionNumber) {
            case 1:
                System.out.println(" hello! How can I help you ");
                break;
            case 2:
                System.out.println("Are you a member of our Library or not  ");
                break;
            case 3:
                System.out.println("which book would you like to borrow");
                break;
            case 4:
                System.out.println("This book is not available. Would you like to borrow any other book?");
                break;
            default:
                System.out.println("Thank you for visiting us");
                break;


        }
    }

    public void checkAvailability() {
        if (Book.availability()) {
            System.out.println("Book is available");
        }
        System.out.println("Book is not available");
    }
}
