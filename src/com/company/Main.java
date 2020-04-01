package com.company;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Book harryPotter = new Book(1, "Harry Potter", "good", "notavailable");
        Book winnieThePooh = new Book(2, "Winnie the Pooh", "very good", "notAvailable");
        Book cell = new Book(3, "Cell", "good", "available");
        Book meditations = new Book(4, "Meditations", "bad", "available");
        Book hobbit = new Book(5, "The Hobbit", "good", "notAvailable");
        Book prince = new Book(6, "The Little Prince", "bad", "booked");

        List<Book> books = new ArrayList<>();
        books.add(harryPotter);
        books.add(winnieThePooh);
        books.add(cell);
        books.add(meditations);
        books.add(hobbit);
        books.add(prince);
        System.out.println(books);

        Worker anna = new Worker(1, "Anna", 500);
        Worker peter = new Worker(2, "Peter", 400);

        Customer andrew = new Customer(1, "Andrew", "member");


        anna.ask(1);
        andrew.answer(1);
        anna.ask(2);
        anna.checkIfMember(andrew.getStatus());
        Scanner scanner = new Scanner(System.in);
        int chosenBookTitle = scanner.nextInt();
        System.out.println(" I choose a book number " + chosenBookTitle);


        switch (chosenBookTitle) {
            case 1:
                if (harryPotter.availability(harryPotter.getStatus())) {
                    System.out.println("book " + harryPotter.getTitle() + " is " + harryPotter.getStatus());
                    harryPotter.chooseAnotherBook(harryPotter.getStatus());
                    harryPotter.changeStatus(harryPotter.getStatus());
                }
                System.out.println("Unfortunately book " + harryPotter.getTitle() + " is " + harryPotter.getStatus());
                break;
            case 2:
                if (winnieThePooh.availability(winnieThePooh.getStatus())) {
                    System.out.println("book " + winnieThePooh.getTitle() + " is " + winnieThePooh.getStatus());
                }

                System.out.println("Unfortunately book " + winnieThePooh.getTitle() + " is " + winnieThePooh.getStatus());
                break;
            case 3:
                if (cell.availability(cell.getStatus())) {
                    System.out.println("book " + cell.getTitle() + " is " + cell.getStatus());
                }
                System.out.println("Unfortunately book " + cell.getTitle() + " is " + cell.getStatus());
                break;
            case 4:
                if (meditations.availability(meditations.getStatus())) {
                    System.out.println("book " + meditations.getTitle() + " is " + meditations.getStatus());
                }
                System.out.println("Unfortunately book " + meditations.getTitle() + " is " + meditations.getStatus());
                break;
            case 5:
                if (hobbit.availability(hobbit.getStatus())) {
                    System.out.println("book " + hobbit.getTitle() + " is " + hobbit.getStatus());
                }
                System.out.println("Unfortunately book " + hobbit.getTitle() + " is " + hobbit.getStatus());
                break;
            case 6:
                if (prince.availability(prince.getStatus())) {
                    System.out.println("book " + prince.getTitle() + " is " + prince.getStatus());
                }
                System.out.println("Unfortunately book " + prince.getTitle() + " is " + prince.getStatus());
                break;


        }


    }

}

