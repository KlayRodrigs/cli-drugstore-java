package main.java.view;

import main.java.service.CustomerService;

import java.io.IOException;
import java.util.Scanner;

import static main.java.constants.Constants.*;

public class MenuView {
    //Just for testing
    CustomerService customerService = new CustomerService();
    Scanner scanner = new Scanner(System.in);

    public void initialMenu() throws IOException {
        System.out.println("-".repeat(10) + "WELCOME TO DRUGSTORE" + "-".repeat(10) + "\nPlease, select an option bellow: ");
        System.out.println("1. Customer login\n2. Administrator login\n3. Customer Sign up\n0. Exit");
        System.out.println("-".repeat(40));
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> login(true);
            case 2 -> login(false);
            case 3 -> signUpCustomer();
            case 0 -> System.out.println("Finalizando sistema...");
        }
    }

    public void login(Boolean customer) {
        String type = customer ? CUSTOMER : ADMINSTRATOR;
        System.out.println("-".repeat(13) + type + " login selected" + "-".repeat(13) + "\nLogin: ");
        var login = scanner.nextLine();
        System.out.println("Password: ");
        var password = scanner.nextLine();
        if (customer) {
            System.out.println("Customer");
        } else {
            System.out.println("Administrator");
        }
    }

    public void customerPainel() {
        System.out.println("-".repeat(13) + CUSTOMER + " selected" + "-".repeat(13) + "\nPlease, select an option bellow:");
        System.out.println("1. Customer profile\n2. Customer edit profile\n0. Exit");
        System.out.println("-".repeat(40));
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> System.out.println("Customer profile");
            case 2 -> System.out.println("Customer edit profile");
            case 3 -> System.out.println("Customer delete profile");
            case 0 -> System.out.println("Back to main menu");
        }
    }

    public void administratorPainel() {
        System.out.println("-".repeat(11) + ADMINSTRATOR + " selected" + "-".repeat(11) + "\nPlease, select an option bellow:");
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
            case 0 -> System.out.println("Back to main menu");
        }
    }

    public void signUpCustomer() throws IOException {
        System.out.println("-".repeat(11) + CUSTOMER + " sign up selected" + "-".repeat(11));
        System.out.print("Name: \n");
        String name = scanner.next();
        System.out.println("CPF: ");
        String cpf = scanner.next();
        System.out.println("Login: ");
        String login = scanner.next();
        System.out.println("Password: ");
        String password = scanner.next();
        System.out.println("Street: ");
        String street = scanner.next();
        System.out.println("District: ");
        String district = scanner.next();
        System.out.println("House's number: ");
        String number = scanner.next();
        System.out.println("Zipcode: ");
        String zipCode = scanner.next();
        System.out.println("Phone number: ");
        String phoneNumber = scanner.next();
        customerService.addCustomer(name, cpf, login, password, street, district, number, zipCode, phoneNumber);
    }
}
