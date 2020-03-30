package com.company;

public class Book {
    private String title;
    private String condition;
    private String status;

    public Book(String title, String condition, String status) {
        this.title = title;
        this.condition = condition;
        this.status = status;
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
}
