package main.java.entity;

public class CustomerEntity extends UserEntity {
    private AdressEntity adressEntity;
    private String phoneNumber;

    public CustomerEntity(String name, String cpf, String login, String password, AdressEntity adressEntity, String phoneNumber ) {
        super(name, cpf, login, password);
        this.adressEntity = adressEntity;
        this.phoneNumber = phoneNumber;
    }

    public AdressEntity getAdressEntity() {
        return adressEntity;
    }

    public void setAdressEntity(AdressEntity adressEntity) {
        this.adressEntity = adressEntity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
