package main.java.service;

import main.java.repository.CLIRepository;

import java.io.IOException;

public class CLIServices {
    CLIRepository cliRepository = new CLIRepository();

    public void createBDs(String bd_name, String header ) throws IOException {
        cliRepository.createBDs(bd_name, header);
    }
}
