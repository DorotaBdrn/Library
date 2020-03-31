package com.company;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Book harryPotter = new Book("Harry Potter", "good", "available");
        Book winnieThePooh = new Book("Winnie the Pooh", "very good", "notAvailable");
        Book cell = new Book("Cell", "good", "available");
        Book meditations = new Book("Meditations", "bad", "available");
        Book hobbit = new Book("The Hobbit", "good", "notAvailable");
        Book prince = new Book("The Little Prince", "bad", "booked");

        List<Book> books = new ArrayList<>();
        books.add(harryPotter);
        books.add(winnieThePooh);
        books.add(cell);
        books.add(meditations);
        books.add(hobbit);
        books.add(prince);

        System.out.println(books);


    }
}
