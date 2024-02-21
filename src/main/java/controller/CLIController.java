package main.java.controller;

import main.java.service.CLIServices;
import main.java.view.MenusView;

import static main.java.constants.Constants.*;

public class CLIController {
    private final MenusView menusView = new MenusView();
    private final CLIServices cliServices = new CLIServices();


    public void init() throws Exception {
        cliServices.createBDs(BD_CUSTOMER, HEADER_BD_CUSTOMER);
        cliServices.createBDs(BD_ADMINISTRATOR, HEADER_BD_ADMINISTRATOR);
        menusView.initialMenu();
    }
}
