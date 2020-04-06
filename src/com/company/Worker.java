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
                System.out.println(" hello! How can I help you ?");
                break;
            case 2:
                System.out.println("Just moment. I have to check your membership. What is your name?");
                break;
            case 3:
                System.out.println("which book would you like to borrow?\n We have few books in our Library. \n" +
                        "1. harryPotter \n" +
                        "2. winnieThePooh\n" +
                        "3. cell\n" +
                        "4. meditations\n" +
                        "5.hobbit\n" +
                        "6.prince\n" +
                        "Choose the number od the book, please");
                break;
            case 4:
                System.out.println("This book is not available. Would you like to borrow any other book?");
                break;
            default:
                System.out.println("Thank you for visiting us");
                break;


        }
    }


    public boolean checkIfMember(String status) {
        if (status.equals("member")) {
            System.out.println("--- This customer is a member of the Library ---");
            ask(3);
            return true;
        } else {
            System.out.println("This customer is  not a member of the Library. He or She has to pay additionally for borrowing the book or sign in");
            return false;
        }
    }
}
