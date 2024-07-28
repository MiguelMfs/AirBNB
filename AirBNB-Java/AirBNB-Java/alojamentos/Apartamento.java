package alojamentos;

import java.time.LocalDate;

import endereco.Endereco;
import usuarios.Locador;
import usuarios.Locatario;
import pagamento.Pagamento;

public class Apartamento extends Imovel {

    private int andar;
    private int numeroDoApartamento;
    private boolean temElevador;

    public Apartamento(Endereco endereco, int numeroDeComodos, double valor, boolean possuiGaragem, Locador locador,
            boolean disponivel, int andar, int numeroDoApartamento, boolean temElevador, Pagamento pagamento) {
        super(endereco, numeroDeComodos, valor, possuiGaragem, locador, disponivel, pagamento);
        this.andar = andar;
        this.numeroDoApartamento = numeroDoApartamento;
        this.temElevador = temElevador;
    }

    // Segundo construtor (sobrecarga)
    public Apartamento(Endereco endereco, int numeroDeComodos, double valor, boolean possuiGaragem, Locador locador,
            int andar, int numeroDoApartamento, boolean temElevador, Pagamento pagamento) {
        super(endereco, numeroDeComodos, valor, possuiGaragem, locador, true, pagamento); // Disponível por padrão
        this.andar = andar;
        this.numeroDoApartamento = numeroDoApartamento;
        this.temElevador = temElevador;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumeroDoApartamento() {
        return numeroDoApartamento;
    }

    public void setNumeroDoApartamento(int numeroDoApartamento) {
        this.numeroDoApartamento = numeroDoApartamento;
    }

    public boolean isTemElevador() {
        return temElevador;
    }

    public void setTemElevador(boolean temElevador) {
        this.temElevador = temElevador;
    }

    @Override
    public String getTipoImovel() {
        return "Apartamento";
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
