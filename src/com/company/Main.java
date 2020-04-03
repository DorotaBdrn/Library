package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.company.Book.*;
import static com.company.Customer.secondBook;

public class Main {

    static Book harryPotter = new Book(1, "Harry Potter", "good", "notavailable");
    static Book winnieThePooh = new Book(2, "Winnie the Pooh", "very good", "available");
    static Book cell = new Book(3, "Cell", "good", "available");
    static Book meditations = new Book(4, "Meditations", "bad", "available");
    static Book hobbit = new Book(5, "The Hobbit", "good", "notAvailable");
    static Book prince = new Book(6, "The Little Prince", "bad", "booked");

    public static void main(String[] args) {


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
        if (anna.checkIfMember(andrew.getStatus())) {
            Scanner scanner = new Scanner(System.in);
            chooseBook();
            System.out.println(books);
        } else {

        }

    }


    public static void chooseBook() {

        Scanner scanner = new Scanner(System.in);


        int chosenBookTitle = scanner.nextInt();

        System.out.println(" I choose a book number " + chosenBookTitle);


        switch (chosenBookTitle) {
            case 1:
                if (harryPotter.availability(harryPotter.getStatus())) {
                    System.out.println("book " + harryPotter.getTitle() + " is " + harryPotter.getStatus());
                    harryPotter.setStatus(changeStatus(harryPotter.getStatus()));
                    secondBook();


                } else {
                    System.out.println("Unfortunately book " + harryPotter.getTitle() + " is " + harryPotter.getStatus());
                    harryPotter.chooseAnotherBook(harryPotter.getStatus());
                }
                break;

            case 2:
                if (winnieThePooh.availability(winnieThePooh.getStatus())) {
                    System.out.println("book " + winnieThePooh.getTitle() + " is " + winnieThePooh.getStatus());
                    winnieThePooh.setStatus(changeStatus(winnieThePooh.getStatus()));
                    secondBook();

                } else {
                    System.out.println("Unfortunately book " + winnieThePooh.getTitle() + " is " + winnieThePooh.getStatus());
                    winnieThePooh.chooseAnotherBook(winnieThePooh.getStatus());
                }
                break;

            case 3:
                if (cell.availability(cell.getStatus())) {
                    System.out.println("book " + cell.getTitle() + " is " + cell.getStatus());
                    cell.setStatus(changeStatus(cell.getStatus()));
                    secondBook();

                } else {
                    System.out.println("Unfortunately book " + cell.getTitle() + " is " + cell.getStatus());
                    cell.chooseAnotherBook(cell.getStatus());
                }
                break;

            case 4:
                if (meditations.availability(meditations.getStatus())) {
                    System.out.println("book " + meditations.getTitle() + " is " + meditations.getStatus());
                    meditations.setStatus(changeStatus(meditations.getStatus()));
                    secondBook();

                } else {
                    System.out.println("Unfortunately book " + meditations.getTitle() + " is " + meditations.getStatus());
                    meditations.chooseAnotherBook(meditations.getStatus());


                }
                break;

            case 5:
                if (hobbit.availability(hobbit.getStatus())) {
                    System.out.println("book " + hobbit.getTitle() + " is " + hobbit.getStatus());
                    hobbit.setStatus(changeStatus(hobbit.getStatus()));
                    secondBook();

                } else {
                    System.out.println("Unfortunately book " + hobbit.getTitle() + " is " + hobbit.getStatus());
                    hobbit.chooseAnotherBook(hobbit.getStatus());


                }
                break;
            case 6:
                if (prince.availability(prince.getStatus())) {
                    System.out.println("book " + prince.getTitle() + " is " + prince.getStatus());
                    prince.setStatus(changeStatus(prince.getStatus()));
                    secondBook();

                } else {
                    System.out.println("Unfortunately book " + prince.getTitle() + " is " + prince.getStatus());
                    prince.chooseAnotherBook(prince.getStatus());


                }
            default:
                System.out.println("Sorry, choose only a number 1-6");
                chooseBook();


        }

    }
}
