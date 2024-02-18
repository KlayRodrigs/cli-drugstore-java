package main.java.entity;

public class AdministratorEntity extends UserEntity {
    private long admCode;

    public AdministratorEntity(String name, String cpf, long admCode,String password) {
        super(name, cpf, password);
        this.admCode = admCode;
    }

    public long getAdmCode() {
        return admCode;
    }

    public void setAdmCode(long admCode) {
        this.admCode = admCode;
    }
}
