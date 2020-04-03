package com.company;

import java.util.Scanner;

import static com.company.Main.chooseBook;

public class Book {
    private int id;
    private String title;
    private int price;
    private String condition;
    private String status;

    public Book(int id, String title, String condition, String status) {
        this.id = id;
        this.title = title;
        this.condition = condition;
        this.status = status;
        this.price = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public static boolean availability(String status) {
        if (status.equals("available")) {
            return true;
        }
        return false;
    }

    public static String changeStatus(String status) {
        System.out.println("--- Change Status----");
        Scanner sc = new Scanner(System.in);
        String newStatus = sc.nextLine();
        status = newStatus;
        return newStatus;
    }


    @Override
    public String toString() {
        return "The Book's title: '" + title + '\'' + " id: " + id +
                "  price: " + price +
                ", condition ='" + condition + '\'' +
                ", status='" + status + '\'' + "\n";
    }


    public static void chooseAnotherBook(String status) {

        if (!status.equals("available")) {
            System.out.println("Choose another book, please");
            chooseBook();
        }
    }


}
