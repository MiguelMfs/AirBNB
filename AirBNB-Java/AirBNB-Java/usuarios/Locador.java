package usuarios;

public class Locador extends Pessoa {

    private String propriedadesDisponiveis;

    // Construtor
    public Locador(String nome, String cpf, String telefone, String email, String propriedadesDisponiveis) {
        super(nome, cpf, telefone, email);
        this.propriedadesDisponiveis = propriedadesDisponiveis;
    }

    // Construtor com sobrecarga
    public Locador(String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        this.propriedadesDisponiveis = "";
    }

    public String getPropriedadesDisponiveis() {
        return propriedadesDisponiveis;
    }

    public void setPropriedadesDisponiveis(String propriedadesDisponiveis) {
        this.propriedadesDisponiveis = propriedadesDisponiveis;
    }

    @Override
    public String getTipoUsuario() {
        return "Locador";
    }

}
