import java.util.Scanner;

public class Cliente {

    Scanner entrada = new Scanner(System.in);

    private String cpf;
    private String nome;
    private String email;
    private String endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf; 

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Cliente() {
        this("Escreva seu cpf");
    }
    Cliente(String cpf){
        this(cpf, "Qual é o seu nome?");
    }
    Cliente(String cpf, String nome) {
        this(cpf, nome, "Qual é o seu email?");
    }
    Cliente(String cpf, String nome, String email) {
        this(cpf, nome, email, "Qual é o seu endereço?" );
    }
    Cliente(String cpf, String nome, String email, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }
    
    public String toString(){
        return("Cpf: " + this.cpf +"," + " Nome: " + this.nome + "," + " E-mail: " + this.email +","+ " Endereço: " + this.endereco);
    }
    
}
