package main.java.service;

import main.java.entity.AdressEntity;
import main.java.entity.CustomerEntity;
import main.java.repository.CustomerRepository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static main.java.constants.Constants.BD_CUSTOMER;

public class CustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    CustomerEntity customerEntity;
    AdressEntity adressEntity;

    public void addCustomer(String name, String cpf, String login, String password, String street, String district, String number, String zipcode, String phoneNumber) throws IOException {
        adressEntity = new AdressEntity(street, district, number, zipcode);
        customerEntity = new CustomerEntity(name, cpf, login, password, adressEntity, phoneNumber);
        customerRepository.addToBD(BD_CUSTOMER, customerEntity);
    }
}
