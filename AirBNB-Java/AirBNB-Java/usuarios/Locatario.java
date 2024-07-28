package usuarios;

public class Locatario extends Pessoa {
    private int reservasEfetuadas;
    private boolean possuiReservaAtiva;

    // Construtor
    public Locatario(String nome, String cpf, String telefone, String email, int reservasEfetuadas,
            boolean possuiReservaAtiva) {
        super(nome, cpf, telefone, email);
        this.reservasEfetuadas = reservasEfetuadas;
        this.possuiReservaAtiva = possuiReservaAtiva;
    }

    // Construtor com sobrecarga
    public Locatario(String nome, String cpf) {
        super(nome, cpf);
        this.reservasEfetuadas = 0;
        this.possuiReservaAtiva = false;
    }

    // Getters e Setters
    public int getReservasEfetuadas() {
        return reservasEfetuadas;
    }

    public void setReservasEfetuadas(int reservasEfetuadas) {
        this.reservasEfetuadas = reservasEfetuadas;
    }

    public boolean getPossuiReservaAtiva() {
        return possuiReservaAtiva;
    }

    public void setPossuiReservaAtiva(boolean possuiReservaAtiva) {
        this.possuiReservaAtiva = possuiReservaAtiva;
    }

    @Override
    public String getTipoUsuario() {
        return "Locatario";
    }

}
