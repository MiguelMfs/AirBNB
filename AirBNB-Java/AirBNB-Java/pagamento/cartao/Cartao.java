package pagamento.cartao;

import pagamento.Pagamento;

public abstract class Cartao extends Pagamento {
    private String numeroCartao;
    private String bandeira;

    // Construtor
    public Cartao(double valor, String data, String numeroCartao, String bandeira) {
        super(valor, data);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    // Segundo construtor (sobrecarga) - apenas com valor, numeroCartao e bandeira
    public Cartao(double valor, String numeroCartao, String bandeira) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    // Getters e Setters
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeira () {
        return bandeira;
    }
    public void setBandeira (String bandeira) {
        this.bandeira = bandeira;
    }
}
