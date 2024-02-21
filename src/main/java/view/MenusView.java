package main.java.view;

import main.java.service.CustomerService;

import java.util.Scanner;

import static main.java.constants.Constants.*;

public class MenusView {
    CustomerService customerService = new CustomerService();
    Scanner scanner = new Scanner(System.in);

    public void initialMenu() throws Exception {
        System.out.println("-".repeat(10) + "WELCOME TO DRUGSTORE" + "-".repeat(10) + "\nPlease, select an option bellow: ");
        System.out.println("1. Customer login\n2. Administrator login\n3. Customer Sign up\n0. Exit");
        System.out.println("-".repeat(40));
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> login(true);
            case 2 -> login(false);
            case 3 -> signUpCustomer();
            case 0 -> System.out.println("Ending...");
        }
    }

    public void login(Boolean customer) throws Exception {
        String title = customer ? CUSTOMER : ADMINSTRATOR;
        String type = customer ? BD_CUSTOMER : BD_ADMINISTRATOR;
        System.out.print("-".repeat(13) + title + " login selected" + "-".repeat(13) + "\nCPF(Just numbers): ");
        String cpf = scanner.next();
        if (cpf.length() != 11 && customerService.findElement(BD_PATH + type, cpf) ){
            System.out.println(ERROR_INVALID_CPF);
            initialMenu();
        }
        System.out.print("Password: ");
        var password = scanner.next();
        if (customerService.loginCheckCredentials(BD_PATH + type, cpf, password)) {
            if (type.equals(BD_CUSTOMER)) {
                customerPainel();
            } else {
                administratorPainel();
            }
        } else {
            System.out.println(ERROR_WRONG_CREDENTIALS);
        }
        initialMenu();
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

    public void signUpCustomer() throws Exception {
        System.out.println("-".repeat(11) + CUSTOMER + " sign up selected" + "-".repeat(11));
        System.out.print("Name: ");
        String name = customerService.validInput("generic").toString();
        if (name.equals("redirect")){
            initialMenu();
        }
        scanner.nextLine();
        System.out.print("CPF(Just numbers): ");
        String cpf = scanner.nextLine();
        for (int i = 1; i < 4; i++) {
            if(cpf.length() != 11){
                System.out.println("Invalid format for cpf. Try again("+ i + "/3): ");
            }
            else if (customerService.findElement(BD_PATH + BD_CUSTOMER, cpf)) {
                System.out.println(ERROR_CPF_EXISTS +"Try again("+ i + "/3): ");
                if (i == 3) {
                    System.out.println(REDIRECTING);
                    initialMenu();
                }
                cpf = scanner.nextLine();
            }
            else{
                break;
            }
        }
        System.out.print("Password: ");
        String password = customerService.validInput("generic").toString();
        if (password.equals("redirect")){
            initialMenu();
        }
        System.out.print("Street: ");
        String street = customerService.validInput("generic").toString();
        if (street.equals("redirect")){
            initialMenu();
        }
        System.out.print("District: ");
        String district = customerService.validInput("generic").toString();
        if (district.equals("redirect")){
            initialMenu();
        }
        System.out.print("House's number: ");
        String number = customerService.validInput("generic").toString();
        if (number.equals("redirect")){
            initialMenu();
        }
        System.out.print("Zipcode: ");
        String zipCode = customerService.validInput("generic").toString();
        if (zipCode.equals("redirect")){
            initialMenu();
        }
        System.out.print("Phone number: ");
        String phoneNumber = customerService.validInput("phone").toString();
        if (phoneNumber.equals("redirect")){
            initialMenu();
        }
        customerService.addCustomer(name, cpf, password, street, district, number, zipCode, phoneNumber);
        initialMenu();
    }
}
