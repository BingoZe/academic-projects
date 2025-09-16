package projetomatheus.fioriaquiles.entidades;


import java.util.UUID;


public class Usuario {
    private String id;
    private String username;
    private String email;
    private String password;  // String para senhas
    private int tipoConta;    // Pode ser substituído por um enum

    // Construtor
    public Usuario() {
        this.id = UUID.randomUUID().toString();  // Gera um ID único
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPassword(String password){
        this.password = password;  // Em um projeto real, criptografe a senha aqui
    }

    public String getPassword(){
        return password;
    }

    public void setTipoConta(int tipoConta) {
        if (tipoConta >= 1 && tipoConta <= 3) {
            this.tipoConta = tipoConta;
        } else {
            System.out.println("Tipo de conta inválido. Deve ser 1, 2 ou 3.");
        }
    }

    public int getTipoConta() {
        return tipoConta;
    }
}