package main.java.constants;

public class Constants {
    public static final String BD_PATH = "C:/Users/Klayv/OneDrive/Documentos/portifolio/cli-drugstore/src/main/resources/bds/";
    public static final String ADMINSTRATOR = "Administrator";
    public static final String CUSTOMER = "Customer";


    public static final String HEADER_BD_ADMINISTRATOR = "NAME,CPF,PASSWORD,ADMCODE";
    public static final String BD_ADMINISTRATOR = "bd_administrator.csv";


    public static final String BD_CUSTOMER = "bd_customer.csv";
    public static final String HEADER_BD_CUSTOMER = "NAME,CPF,PHONE,PASSWORD,STREET,HOUSE'S NUMBER,DISTRICT,ZIPCODE";

    public static final String ERROR_WRONG_CREDENTIALS = "Credential is wrong, redirecting to main menu.";
    public static final String ERROR_INVALID_CPF = "Invalid CPF, redirecting.";
    public static final String ERROR_CPF_EXISTS = "This CPF isn't valid.";
}
