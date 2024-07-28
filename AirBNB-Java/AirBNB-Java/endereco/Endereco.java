package endereco;

public class Endereco extends Estado {
    private String rua;
    private int numero;
    private String cidade;
    private String bairro;

    // Construtor
    public Endereco(String nome, String sigla, String rua, int numero, String cidade, String bairro) {
        super(nome, sigla);
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    // Construtor sem bairro
    public Endereco(String nome, String sigla, String rua, int numero, String cidade) {
        super(nome, sigla);
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.bairro = "";
    }

    // Getters e Setters específicos de Endereco
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}