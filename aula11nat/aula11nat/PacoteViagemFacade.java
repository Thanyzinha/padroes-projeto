import java.util.List;

public class PacoteViagemFacade {
    public void comprarPacote(List<Cliente> clientes, String poltrona, String tipoQuarto, String tipoCarro, String formaPagamento) {
        System.out.println("==== DADOS DOS CLIENTES ====");
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        PassagemAerea passagem = new PassagemAerea(poltrona);
        Hotel hotel = new Hotel(tipoQuarto, clientes.size());
        AluguelCarro carro = new AluguelCarro(tipoCarro);

        double totalPassagens = passagem.getPreco() * clientes.size();
        double total = totalPassagens + hotel.getPrecoTotal() + carro.getPreco();

        Pagamento pagamento = new Pagamento(formaPagamento, total);

        System.out.println("\n==== DETALHES DA COMPRA ====");
        System.out.println(passagem);
        System.out.println(hotel);
        System.out.println(carro);
        System.out.println("Total Bruto: R$" + String.format("%.2f", total));
        System.out.println(pagamento);
    }
}
