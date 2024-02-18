package main.java.repository;

import main.java.entity.CustomerEntity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static main.java.constants.Constants.*;


public class CustomerRepository {
    Path path = Path.of("");

    public void addToBD(String bd_name, CustomerEntity customerEntity) throws IOException {
        path = Path.of(BD_PATH + bd_name);
        BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile(), true));
        writer.newLine();
        writer.write(instanceAttributesValues(customerEntity));
        writer.close();
    }

    public String instanceAttributesValues(CustomerEntity customerEntity){
        return customerEntity.getName()+ ","+customerEntity.getCpf()+","+customerEntity.getPhoneNumber()+ ","+ customerEntity.getPassword()+ ","+ customerEntity.getAdressEntity().getStreet()+ ","+ customerEntity.getAdressEntity().getNumber() + ","+customerEntity.getAdressEntity().getDistrict()+ ","+customerEntity.getAdressEntity().getPostalCode()+",";

    }

}
