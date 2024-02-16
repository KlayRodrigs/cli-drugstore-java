package main.java.entity;

public class AdministratorEntity extends UserEntity {
    private long admCode;

    public AdministratorEntity(String name, String cpf, String login, String password, long admCode) {
        super(name, cpf, login, password);
        this.admCode = admCode;
    }

    public long getAdmCode() {
        return admCode;
    }

    public void setAdmCode(long admCode) {
        this.admCode = admCode;
    }
}
