package main.java.view;

import java.util.Scanner;

import static main.java.constants.Constants.ADMINSTRATOR;
import static main.java.constants.Constants.CUSTOMER;

public class MenuView {
    Scanner scanner = new Scanner(System.in);

    public void initialMenu() {
        System.out.println("-".repeat(10) + "WELCOME TO DRUGSTORE" + "-".repeat(10) + "\nPlease, select an option bellow: ");
        System.out.println("1. Customer login\n2. Administrator login\n3. Customer Sign up\n0. Exit");
        System.out.println("-".repeat(40));
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> customerLogin();
            case 2 -> administratorLogin();
            case 3 -> System.out.println("Customer Sign up");
            case 0 -> System.out.println("Exit");
        }
    }

    public void customerLogin() {
        System.out.println("-".repeat(13) + CUSTOMER +" selected" + "-".repeat(13) + "\nPlease, select an option bellow:");
        System.out.println("1. Customer profile\n2. Customer edit profile\n0. Exit");
        System.out.println("-".repeat(40));
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> System.out.println("Customer profile");
            case 2 -> System.out.println("Customer edit profile");
            case 0 -> System.out.println("Exit");
        }
    }

    public void administratorLogin() {
        System.out.println("-".repeat(11) + ADMINSTRATOR +" selected" + "-".repeat(11) + "\nPlease, select an option bellow:");
        System.out.println("1. Administrator profile\n2. Edit administrator profile\n3. Customers list\n4. Edit customer\n5. Delete customer\n6. Add medicine\n7. List medicines\n8. Edit medicine\n9. Remove medicine\n0. Exit");
        System.out.println("-".repeat(40));
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> System.out.println("Administrator profile");
            case 2 -> System.out.println("Edit administrator profile");
            case 3 -> System.out.println("Customers list");
            case 4 -> System.out.println("Edit customer");
            case 5 -> System.out.println("Delete customer");
            case 6 -> System.out.println("Add medicine");
            case 7 -> System.out.println("List medicines");
            case 8 -> System.out.println("Edit medicine");
            case 9 -> System.out.println("Remove medicine");
            case 0 -> System.out.println("Exit");
        }
    }
}
