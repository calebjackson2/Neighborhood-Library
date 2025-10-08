package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class NeigborhoodLibrary {
    private static  Book[] Inventory = new Book[20];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < Inventory.length; i++) {
            Inventory[i] = new Book(i + 1, "ISBN-" + (1000 + i), "Book Title " + (i + 1));
            Inventory[0] = new Book(1, "9780439139595", "Harry Potter and the Goblet of Fire");
            Inventory[1] = new Book(2, "9780743273565", "The Great Gatsby");
            Inventory[2] = new Book(3, "9780451524935", "1984");
            Inventory[3] = new Book(4, "9780061120084", "To Kill a Mockingbird");
            Inventory[4] = new Book(5, "9780316769488", "The Catcher in the Rye");
            Inventory[5] = new Book(6, "9780544003415", "The Hobbit");
            Inventory[6] = new Book(7, "9780439358071", "Harry Potter and the Order of the Phoenix");
            Inventory[7] = new Book(8, "9780142437209", "Moby-Dick");
            Inventory[8] = new Book(9, "9780141439600", "Pride and Prejudice");
            Inventory[9] = new Book(10, "9780060850524", "Brave New World");
            Inventory[10] = new Book(11, "9780385490818", "The Alchemist");
            Inventory[11] = new Book(12, "9780140187396", "Of Mice and Men");
            Inventory[12] = new Book(13, "9780156012195", "The Little Prince");
            Inventory[13] = new Book(14, "9780618640157", "The Lord of the Rings");
            Inventory[14] = new Book(15, "9780307277671", "The Road");
            Inventory[15] = new Book(16, "9780553386790", "A Game of Thrones");
            Inventory[16] = new Book(17, "9780374533557", "The Kite Runner");
            Inventory[17] = new Book(18, "9781451673319", "Fahrenheit 451");
            Inventory[18] = new Book(19, "9780062315007", "The Outsiders");
            Inventory[19] = new Book(20, "9780143039433", "Life of Pi");
        }
        boolean running = true;
        while (running) {
            System.out.println("\n=== Menu ===");
            System.out.println("1.  Show Available Books");
            System.out.println("2.  Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.println("Choose: ");
            int command = scanner.nextInt();
            scanner.nextLine();
            switch (command) {
                case 1:
                    showAvailable();
                case 2:
                    showCheckedOut();
                case 3:
                    running = false;
                default:
                    System.out.println(" Invalid choice.");
            }
        }
    }
    private static void showAvailable() {
        System.out.println("\n--- Available Books ---");
        for (Book b : Inventory)
            if (!b.isCheckedOut())
                System.out.println(b.toString());
        boolean hasBooks = true;
    }
}