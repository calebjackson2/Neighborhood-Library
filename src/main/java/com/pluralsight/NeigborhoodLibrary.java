package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class NeigborhoodLibrary {
    private static  Book[] Inventory = new Book[20];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < Inventory.length; i++) {
            Inventory[i] = new Book(i + 1, "ISBN-" + (1000 + i), "Book Title " + (i + 1));
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
                System.out.println("ID:%d | %s | %s%n", b.getId(), b.getIsbn(), b.getTitle());
    }
}