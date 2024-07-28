package alojamentos;

import java.time.LocalDate;

import endereco.Endereco;
import usuarios.Locador;
import usuarios.Locatario;
import pagamento.Pagamento;

public class Casa extends Imovel {

    private double tamanhoDoTerreno;
    private boolean possuiPiscina;

    // Construtor
    public Casa(Endereco endereco, int numeroDeComodos, double valor, boolean possuiGaragem, Locador locador,
            boolean disponivel, double tamanhoDoTerreno, boolean possuiPiscina, Pagamento pagamento) {
        super(endereco, numeroDeComodos, valor, possuiGaragem, locador, disponivel, pagamento);
        this.tamanhoDoTerreno = tamanhoDoTerreno;
        this.possuiPiscina = possuiPiscina;
    }

    // Segundo construtor (sobrecarga)
    public Casa(Endereco endereco, int numeroDeComodos, double valor, boolean possuiGaragem, Locador locador,
            double tamanhoDoTerreno, boolean possuiPiscina, Pagamento pagamento) {
        super(endereco, numeroDeComodos, valor, possuiGaragem, locador, true, pagamento); // Disponível por padrão
        this.tamanhoDoTerreno = tamanhoDoTerreno;
        this.possuiPiscina = possuiPiscina;
    }

    // Getters e Setters específicos de Casa
    public double getTamanhoDoTerreno() {
        return tamanhoDoTerreno;
    }

    public void setTamanhoDoTerreno(double tamanhoDoTerreno) {
        this.tamanhoDoTerreno = tamanhoDoTerreno;
    }

    public boolean isPossuiPiscina() {
        return possuiPiscina;
    }

    public void setPossuiPiscina(boolean possuiPiscina) {
        this.possuiPiscina = possuiPiscina;
    }

    @Override
    public String getTipoImovel() {
        return "Casa";
    }

    @Override
    public void reservar(LocalDate data, Locatario locatario) {
        // Implementação do método de reserva
        if (this.getDisponivel()) {
            this.setDisponivel(false);
            // Lógica adicional para processar a reserva
            System.out.println("Reserva realizada para a data: " + data + " pelo locatário: " + locatario.getNome());
        } else {
            System.out.println("O imóvel não está disponível para reserva.");
        }
    }
}
