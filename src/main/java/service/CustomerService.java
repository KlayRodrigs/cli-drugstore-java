package main.java.service;

import main.java.entity.AdressEntity;
import main.java.entity.CustomerEntity;
import main.java.repository.CustomerRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static main.java.constants.Constants.*;

public class CustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    CustomerEntity customerEntity;
    AdressEntity adressEntity;

    public void addCustomer(String name, String cpf, String password, String street, String district, String number, String zipcode, String phoneNumber) throws Exception {
        if(findElement(BD_PATH+BD_CUSTOMER, cpf)){
            throw new Exception(ERROR_CPF_EXISTS);
        }
        adressEntity = new AdressEntity(street, district, number, zipcode);
        customerEntity = new CustomerEntity(name, cpf, password, adressEntity, phoneNumber);
        customerRepository.addToBD(BD_CUSTOMER, customerEntity);
    }

    public boolean loginCheckCredentials(String bd_name, String login, String password) throws Exception {
        return findElement(bd_name, login) && findElement(bd_name, password);
    }

    public boolean findElement(String bd_name, String item) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(bd_name));
        String line;
        StringBuilder word = new StringBuilder();
        boolean confirmation = false;
        while ((line = reader.readLine()) != null) {
            String[] elements = line.split("");
            for (String element : elements) {
                if (element.equals(",")) {
                    if (word.toString().equals(item)) {
                        confirmation = true;
                        word.append(element);
                        break;
                    }
                    word = new StringBuilder();
                } else {
                    word.append(element);
                }
            }
        }
        return confirmation;
    }
}
