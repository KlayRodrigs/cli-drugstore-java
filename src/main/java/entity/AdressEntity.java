package main.java.entity;

public class AdressEntity {
    private String street;
    private String district;
    private String number;
    private String zipCode;

    public AdressEntity(String street, String district, String number, String zipCode) {
        this.street = street;
        this.district = district;
        this.number = number;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostalCode() {
        return zipCode;
    }

    public void setPostalCode(String postalCode) {
        this.zipCode = postalCode;
    }
}
