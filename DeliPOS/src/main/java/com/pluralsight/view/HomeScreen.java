package com.pluralsight.view;

import java.util.Scanner;

public class HomeScreen implements Screen {
    @Override
    public void display() {
        System.out.println("""
                Welcome to Caleb's DELI-cious subs!
                -----------------------------------
                1) New Order
                0) Exit
                """);
    }

    public int getSelection(Scanner scanner) {
        int choice = -1;

        while (true) {
            System.out.print("Enter your choice (1 or 0): ");
            String input = scanner.nextLine().trim();

            try {
                choice = Integer.parseInt(input);

                switch (choice) {
                    case 1, 0 -> {
                        return choice; // Valid choice, exit the loop by returning choice
                    }
                    default -> System.out.println("Invalid option. Please enter 1 for New Order or 0 to Exit.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1 or 0).");
            }
        }
    }
}