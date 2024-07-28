package pagamento.cartao;

public class Credito extends Cartao {
    private int numeroParcelas;

    // Construtor
    public Credito(double valor, String data, String numeroCartao, String bandeira, int numeroParcelas) {
        super(valor, data, numeroCartao, bandeira);
        this.numeroParcelas = numeroParcelas;
    }

    // Segundo construtor (sobrecarga) - apenas com valor, numeroCartao, bandeira e
    // numeroParcelas
    public Credito(double valor, String numeroCartao, String bandeira, int numeroParcelas) {
        super(valor, numeroCartao, bandeira);
        this.numeroParcelas = numeroParcelas;
    }

    // Getters e Setters
    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public String getTipoPagamento() {
        return "Credito";
    }

    @Override
    public String getDetalhesPagamento() {
        return "Pagamento a prazo com " + numeroParcelas + " parcelas.";
    }

}
