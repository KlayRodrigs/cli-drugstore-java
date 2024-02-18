package main.java;

import main.java.controller.CLIController;
import main.java.view.MenuView;

import java.io.IOException;

public class DrugStore {
    public static void main(String[] args) throws Exception {
        CLIController cliController = new CLIController();
        cliController.init();
    }
}
