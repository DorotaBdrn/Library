package com.company;

public class Book {
    private String title;
    private int price;
    private String condition;
    private static String status;

    public Book(String title, String condition, String status) {
        this.title = title;
        this.condition = condition;
        this.status = status;
        this.price = 0;
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

    public static boolean availability(Customer chosenBookTitle) {
        if (status.equals("available")) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "The Book's title: '" + title + '\'' +
                "  price: " + price +
                ", condition ='" + condition + '\'' +
                ", status='" + status + '\'' + "\n";
    }
}
