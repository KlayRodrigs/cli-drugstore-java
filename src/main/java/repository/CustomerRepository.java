package main.java.repository;

import main.java.entity.CustomerEntity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static main.java.constants.Constants.*;


public class CustomerRepository {
    Path path = Path.of("");

    public void createBD(String bd_name) throws IOException {
        path = Path.of(BD_PATH + bd_name);
        if (Files.notExists(path)) {
            Files.createFile(path);
            Files.write(path, CABECALHO_BD_CUSTOMER.getBytes());
        }
    }

    public void addToBD(String bd_name, CustomerEntity customerEntity) throws IOException {
        createBD(bd_name);
        path = Path.of(BD_PATH + bd_name);
        BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile(), true));
        writer.write(instanceAttributesValues(customerEntity).toString()+"\n");
        writer.close();
    }

    public ArrayList<String> instanceAttributesValues(CustomerEntity customerEntity){
        ArrayList<String> user = new ArrayList<>();
        user.add(customerEntity.getName()+ ", "+customerEntity.getCpf()+", "+customerEntity.getPhoneNumber()+", "+customerEntity.getLogin()+ ", "+ customerEntity.getPassword()+ ", "+ customerEntity.getAdressEntity().getStreet()+ ", "+ customerEntity.getAdressEntity().getNumber() + ", "+customerEntity.getAdressEntity().getDistrict()+ ", "+customerEntity.getAdressEntity().getPostalCode());
        return user;
    }


}
