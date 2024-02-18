package main.java.entity;

abstract class UserEntity {
     private String name;
     private String cpf;
     private String password;


     public UserEntity(String name, String cpf, String password) {
          this.name = name;
          this.cpf = cpf;
          this.password = password;
     }

     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }

     public String getPassword() {
          return password;
     }
     public void setPassword(String password) {
          this.password = password;
     }

     public String getCpf() {
          return cpf;
     }
     public void setCpf(String cpf) {
          this.cpf = cpf;
     }
}
