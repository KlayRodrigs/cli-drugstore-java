package main.java.entity;

public class CustomerEntity extends UserEntity {
    private AdressEntity adressEntity;
    private String phoneNumber;

    public CustomerEntity(String name, String cpf, String password, AdressEntity adressEntity, String phoneNumber) {
        super(name, cpf, password);
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
