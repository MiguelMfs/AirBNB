package alojamentos;

import endereco.Endereco;
import usuarios.Locador;
import pagamento.Pagamento;
import reservavel.Reservavel;

public abstract class Imovel implements Reservavel {

    private Endereco endereco;
    private int numeroDeComodos;
    private double valor;
    private boolean possuiGaragem;
    private Locador locador;
    private boolean disponivel;
    private Pagamento pagamento; // novo campo

    public Imovel(Endereco endereco, int numeroDeComodos, double valor, boolean possuiGaragem, Locador locador,
            boolean disponivel, Pagamento pagamento) {
        this.endereco = endereco;
        this.numeroDeComodos = numeroDeComodos;
        this.valor = valor;
        this.possuiGaragem = possuiGaragem;
        this.locador = locador;
        this.disponivel = disponivel;
        this.pagamento = pagamento;
    }

    // Segundo construtor (sobrecarga) - Disponível por padrão
    public Imovel(Endereco endereco, int numeroDeComodos, double valor, boolean possuiGaragem, Locador locador,
            Pagamento pagamento) {
        this(endereco, numeroDeComodos, valor, possuiGaragem, locador, true, pagamento);
    }

    // Getters e Setters
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getNumeroDeComodos() {
        return numeroDeComodos;
    }

    public void setNumeroDeComodos(int numeroDeComodos) {
        this.numeroDeComodos = numeroDeComodos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPossuiGaragem() {
        return possuiGaragem;
    }

    public void setPossuiGaragem(boolean possuiGaragem) {
        this.possuiGaragem = possuiGaragem;
    }

    public Locador getLocador() {
        return locador;
    }

    public void setLocador(Locador locador) {
        this.locador = locador;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public abstract String getTipoImovel();

}
