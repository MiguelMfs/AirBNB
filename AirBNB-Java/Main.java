import alojamentos.Casa;
import alojamentos.Apartamento;
import endereco.Endereco;
import usuarios.Locador;
import usuarios.Locatario;
import pagamento.Pix;
import pagamento.cartao.Credito;
import pagamento.cartao.Debito;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Criando um locador com o construtor completo
        Locador locador1 = new Locador("João Silva", "123.456.789-00", "987654321", "joao@exemplo.com", "2");

        // Criando um locador com o construtor sobrecarregado
        Locador locador2 = new Locador("Ana Souza", "987.654.321-00", "456123789", "ana@exemplo.com");

        // Criando um locatário com o construtor completo
        Locatario locatario1 = new Locatario("Maria Oliveira", "987.654.321-00", "123456789", "maria@exemplo.com", 3, true);

        // Criando um locatário com o construtor sobrecarregado
        Locatario locatario2 = new Locatario("Carlos Pereira", "123.123.123-00");

        // Criando um endereço para a casa
        Endereco enderecoCasa = new Endereco("São Paulo", "SP", "Rua das Flores", 123, "São Paulo", "Jardim das Rosas");

        // Criando um pagamento via Pix
        Pix pagamentoPix = new Pix(500000.00, "2024-07-27", "joao@banco.com");

        // Criando uma casa com pagamento via Pix
        Casa casa = new Casa(enderecoCasa, 4, 500000.00, true, locador1, true, 300.0, true, pagamentoPix);

        // Exibindo informações da casa
        System.out.println("Tipo de Imóvel: " + casa.getTipoImovel());
        System.out.println("Endereço: " + casa.getEndereco().getRua() + ", " + casa.getEndereco().getNumero() + " - "
                + casa.getEndereco().getCidade() + "/" + casa.getEndereco().getSigla());
        System.out.println("Número de Cômodos: " + casa.getNumeroDeComodos());
        System.out.println("Valor: R$" + casa.getValor());
        System.out.println("Possui Garagem: " + casa.isPossuiGaragem());
        System.out.println("Tamanho do Terreno: " + casa.getTamanhoDoTerreno() + " m²");
        System.out.println("Possui Piscina: " + casa.isPossuiPiscina());
        System.out.println("Disponível: " + casa.getDisponivel());
        System.out.println("Locador: " + casa.getLocador().getNome());
        System.out.println("Forma de Pagamento: " + casa.getPagamento().getTipoPagamento());
        System.out.println("Detalhes do Pagamento: " + casa.getPagamento().getDetalhesPagamento());
        System.out.println("Locatario: " + locatario1.getNome());
        System.out.println("Reservas Efetuadas: " + locatario1.getReservasEfetuadas());
        System.out.println("Possui Reserva Ativa: " + locatario1.getPossuiReservaAtiva());

        // Fazendo uma reserva para a casa
        System.out.println();
        System.out.println("Reservando a casa...");
        casa.reservar(LocalDate.now(), locatario1);

        System.out.println();

        // Criando um endereço para o apartamento 1
        Endereco enderecoApartamento1 = new Endereco("Rio de Janeiro", "RJ", "Avenida Atlântica", 456, "Rio de Janeiro",
                "Copacabana");

        // Criando um pagamento via Cartão de Crédito
        Credito pagamentoCredito = new Credito(750000.00, "2024-07-27", "1234 5678 9012 3456", "Visa", 12);

        // Criando um apartamento com pagamento via Cartão de Crédito
        Apartamento apartamento1 = new Apartamento(enderecoApartamento1, 3, 750000.00, true, locador2, false, 7, 702,
                true, pagamentoCredito);

        // Exibindo informações do apartamento 1
        System.out.println("Tipo de Imóvel: " + apartamento1.getTipoImovel());
        System.out.println(
                "Endereço: " + apartamento1.getEndereco().getRua() + ", " + apartamento1.getEndereco().getNumero()
                        + " - " + apartamento1.getEndereco().getCidade() + "/" + apartamento1.getEndereco().getSigla());
        System.out.println("Número de Cômodos: " + apartamento1.getNumeroDeComodos());
        System.out.println("Valor: R$" + apartamento1.getValor());
        System.out.println("Possui Garagem: " + apartamento1.isPossuiGaragem());
        System.out.println("Andar: " + apartamento1.getAndar());
        System.out.println("Número do Apartamento: " + apartamento1.getNumeroDoApartamento());
        System.out.println("Tem Elevador: " + apartamento1.isTemElevador());
        System.out.println("Disponível: " + apartamento1.getDisponivel());
        System.out.println("Locador: " + apartamento1.getLocador().getNome());
        System.out.println("Forma de Pagamento: " + apartamento1.getPagamento().getTipoPagamento());
        System.out.println("Detalhes do Pagamento: " + apartamento1.getPagamento().getDetalhesPagamento());
        System.out.println("Locatario: " + locatario1.getNome());
        System.out.println("Reservas Efetuadas: " + locatario1.getReservasEfetuadas());
        System.out.println("Possui Reserva Ativa: " + locatario1.getPossuiReservaAtiva());

        // Tentando fazer uma reserva para o apartamento 1
        System.out.println();
        System.out.println("Tentando reservar o apartamento 1...");
        apartamento1.reservar(LocalDate.now(), locatario1);

        System.out.println();

        // Criando um endereço para o apartamento 2
        Endereco enderecoApartamento2 = new Endereco("Belo Horizonte", "MG", "Rua da Bahia", 789, "Belo Horizonte",
                "Centro");

        // Criando um pagamento via Cartão de Débito
        Debito pagamentoDebito = new Debito(600000.00, "2024-07-27", "4321 5678 9012 3456", "Mastercard");

        // Criando um apartamento com pagamento via Cartão de Débito
        Apartamento apartamento2 = new Apartamento(enderecoApartamento2, 2, 600000.00, true, locador2, true, 10, 1001,
                true, pagamentoDebito);

        // Exibindo informações do apartamento 2
        System.out.println("Tipo de Imóvel: " + apartamento2.getTipoImovel());
        System.out.println(
                "Endereço: " + apartamento2.getEndereco().getRua() + ", " + apartamento2.getEndereco().getNumero()
                        + " - " + apartamento2.getEndereco().getCidade() + "/" + apartamento2.getEndereco().getSigla());
        System.out.println("Número de Cômodos: " + apartamento2.getNumeroDeComodos());
        System.out.println("Valor: R$" + apartamento2.getValor());
        System.out.println("Possui Garagem: " + apartamento2.isPossuiGaragem());
        System.out.println("Andar: " + apartamento2.getAndar());
        System.out.println("Número do Apartamento: " + apartamento2.getNumeroDoApartamento());
        System.out.println("Tem Elevador: " + apartamento2.isTemElevador());
        System.out.println("Disponível: " + apartamento2.getDisponivel());
        System.out.println("Locador: " + apartamento2.getLocador().getNome());
        System.out.println("Forma de Pagamento: " + apartamento2.getPagamento().getTipoPagamento());
        System.out.println("Detalhes do Pagamento: " + apartamento2.getPagamento().getDetalhesPagamento());
        System.out.println("Locatario: " + locatario2.getNome());
        System.out.println("Reservas Efetuadas: " + locatario2.getReservasEfetuadas());
        System.out.println("Possui Reserva Ativa: " + locatario2.getPossuiReservaAtiva());

        // Fazendo uma reserva para o apartamento 2
        System.out.println();
        System.out.println("Reservando o apartamento 2...");
        apartamento2.reservar(LocalDate.now(), locatario2);
    }
}
