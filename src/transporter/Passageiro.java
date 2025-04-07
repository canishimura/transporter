package transporter;

public class Passageiro {

    private String nome;
    private String cpf;
    private String email;

    public Passageiro() {
        this.nome = "";
        this.cpf = "";
        this.email = "";
    }

    public Passageiro(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\nCPF: %s\nE-mail: %s\n", nome, cpf, email
        );
    }
    
}
