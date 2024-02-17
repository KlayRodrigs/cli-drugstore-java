package main.java.entity;

abstract class UserEntity {
     private String name;
     private String cpf;
     private String login;
     private String password;

     public UserEntity(String name, String cpf, String login, String password) {
          this.name = name;
          this.cpf = cpf;
          this.login = login;
          this.password = password;
     }

     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }

     public String getLogin() {
          return login;
     }
     public void setLogin(String login) {
          this.login = login;
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
