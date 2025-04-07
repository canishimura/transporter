package transporter;

public class Cidade {

    private String cidade;
    private String estado;
    private int codigo;

    public Cidade() {
        this.cidade = "";
        this.estado = "";
        this.codigo = 0;
    }
    
    public Cidade(String cidade, String estado, int codigo) {
        this.cidade = cidade;
        this.estado = estado;
        this.codigo = codigo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return String.format(
                "Cidade: %d\nEstado: %s\nCodigo: %d\n", cidade, estado, codigo
        );
    }
    
    
}
