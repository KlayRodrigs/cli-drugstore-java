package main.java.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static main.java.constants.Constants.BD_PATH;
import static main.java.constants.Constants.HEADER_BD_CUSTOMER;

public class CLIRepository {
    Path path = Path.of("");

    public void createBDs(String bd_name, String header) throws IOException {
        path = Path.of(BD_PATH + bd_name);
        if (Files.notExists(path)) {
            Files.createFile(path);
            Files.write(path, header.getBytes());
        }
    }
}
