package main.java.controller;

import main.java.service.CLIServices;
import main.java.view.MenuView;

import static main.java.constants.Constants.*;

public class CLIController {
    MenuView menuView = new MenuView();
    CLIServices cliServices = new CLIServices();

    public void init() throws Exception {
        cliServices.createBDs(BD_CUSTOMER, HEADER_BD_CUSTOMER);
        cliServices.createBDs(BD_ADMINISTRATOR, HEADER_BD_ADMINISTRATOR);
        menuView.initialMenu();
    }
}
