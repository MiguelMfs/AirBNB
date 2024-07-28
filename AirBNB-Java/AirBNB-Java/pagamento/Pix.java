package pagamento;

public class Pix extends Pagamento {
    private String chavePix;

    // Construtor
    public Pix(double valor, String data, String chavePix) {
        super(valor, data);
        this.chavePix = chavePix;
    }

    // Segundo construtor (sobrecarga) - apenas com valor e chavePix
    public Pix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    // Getters e Setters
    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public String getTipoPagamento() {
        return "Pix";
    }

    @Override
    public String getDetalhesPagamento() {
        return "Pagamento via Pix usando a chave: " + chavePix;
    }

}
