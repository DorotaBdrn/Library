package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.Book.*;
import static com.company.Customer.*;

public class Main {

    static Book harryPotter = new Book(1, "Harry Potter", "good", "notavailable");
    static Book winnieThePooh = new Book(2, "Winnie the Pooh", "very good", "available");
    static Book cell = new Book(3, "Cell", "good", "available");
    static Book meditations = new Book(4, "Meditations", "bad", "available");
    static Book hobbit = new Book(5, "The Hobbit", "good", "notAvailable");
    static Book prince = new Book(6, "The Little Prince", "bad", "booked");

    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();

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
        Library publicLibrary = new Library(workers, customers, books);
        workers.add(anna);

        Customer andrew = new Customer(1, "Andrew", "notmember");
        Customer ivo = new Customer(2, "Ivo", "member");

        customers.add(andrew);
        customers.add(ivo);


        anna.ask(1);
        Customer.answer(1);
        anna.ask(2);

//        anna.checkIfMember(andrew.getStatus());
        if (anna.checkIfMember(andrew.getStatus())) {
            Scanner scanner = new Scanner(System.in);
            chooseBook();
            System.out.println(books);

        } else if (!anna.checkIfMember(andrew.getStatus())) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You are not a member of our library so you have to pay for a borrowing every singe book or would you like to buy a membership and pay only annual fees?" +
                    "\n Would you like to buy a mambership? enter yes/no ");
            String membershipAnswer = scanner.nextLine();
            System.out.println(membershipAnswer);
            if (membershipAnswer.equals("no")) {
                System.out.println(" the cost is 5e for 2months per book. How many books would yu like to borrow?");
                Scanner sc = new Scanner(System.in);
                int booksNumber = sc.nextInt();
                int fees = 5 * booksNumber;
                publicLibrary.updateTotalMoneyEarned(fees);
                anna.ask(3);
                chooseBook();
                System.out.println(books);

            } else {
                Customer customer = new Customer(newMemberId(), newMemberName(), newMemberStatus());
                customers.add(customer);
                System.out.println(customers);
                System.out.println("now You are a member of the library. Annual fees cost 50e");
                publicLibrary.updateTotalMoneyEarned(50);
                anna.ask(3);
                chooseBook();
                System.out.println(books);
            }
        }
        System.out.println("the employee " + anna.getName() + " earn " + anna.getSalary());
        publicLibrary.updateTotalMoneySpent(anna.getSalary());
        int moneySpent = publicLibrary.getMoneySpent();
        int moneyEarned = publicLibrary.getMoneyEarned();
        System.out.println(moneySpent);
        System.out.println(moneyEarned);
        int totalMoney = publicLibrary.updateTotalMoney(moneySpent, moneyEarned);
        System.out.println(totalMoney);
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
                break;
            default:
                System.out.println("Sorry, choose only a number 1-6");
                chooseBook();


        }
    }


}
