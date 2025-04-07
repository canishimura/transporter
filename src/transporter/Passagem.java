package transporter;

public class Passagem {

    private String cidadeOrigem;
    private String cidadeDestino;
    private String data;
    private int poltrona;
    private String passageiro;
    private String cpf;

    public Passagem() {
        this.cidadeOrigem = "";
        this.cidadeDestino = "";
        this.data = "";
        this.poltrona = 0;
        this.passageiro = "";
        this.cpf = "";
    }

    public Passagem(String cidadeOrigem, String cidadeDestino, String data, int poltrona, String passageiro, String cpf) {
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.data = data;
        this.poltrona = poltrona;
        this.passageiro = passageiro;
        this.cpf = cpf;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public String getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(String passageiro) {
        this.passageiro = passageiro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format(
                "Cidade de Origem: %s\nCidade de Destino: %s\nData: %s\nPoltrona: %d\nPassageiro: %s\nCPF: %s\n"
        );
    }
    
    
    
}
