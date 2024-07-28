package pagamento.cartao;

public class Debito extends Cartao {

    // Construtor
    public Debito(double valor, String data, String numeroCartao, String bandeira) {
        super(valor, data, numeroCartao, bandeira);
    }

    // Segundo construtor (sobrecarga) - apenas com valor, numeroCartao e bandeira
    public Debito(double valor, String numeroCartao, String bandeira) {
        super(valor, numeroCartao, bandeira);
    }

    @Override
    public String getTipoPagamento() {
        return "Debito";
    }

    @Override
    public String getDetalhesPagamento() {
        return "Pagamento via cartão de débito número: " + getNumeroCartao();
    }

}
