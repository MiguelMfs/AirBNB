package pagamento;

public abstract class Pagamento {

    private double valor;
    private String data;

    // Construtor
    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    // Segundo construtor (sobrecarga) - apenas com valor
    public Pagamento(double valor) {
        this.valor = valor;
        this.data = "Data não informada"; // Valor padrão ou pode ser null
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    // Métodos abstratos que devem ser implementados pelas subclasses
    public abstract String getTipoPagamento();

    public abstract String getDetalhesPagamento();

}
