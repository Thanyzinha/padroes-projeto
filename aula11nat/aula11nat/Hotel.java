public class Hotel {
    private String tipoQuarto;
    private int quantidadePessoas;
    private double precoTotal;

    public Hotel(String tipoQuarto, int quantidadePessoas) {
        this.tipoQuarto = tipoQuarto;
        this.quantidadePessoas = quantidadePessoas;
        this.precoTotal = calcularPreco();
    }

    private double calcularPreco() {
        double base = 200.0;
        double precoPorPessoa = 0;

        if (tipoQuarto.equalsIgnoreCase("Simples")) {
            precoPorPessoa = base;
        } else if (tipoQuarto.equalsIgnoreCase("Executivo")) {
            precoPorPessoa = base * 1.5;
        } else if (tipoQuarto.equalsIgnoreCase("Suíte Presidencial")) {
            precoPorPessoa = base * 1.5 * 3.0;
        }

        return precoPorPessoa * quantidadePessoas;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    @Override
    public String toString() {
        return "Hotel - Tipo: " + tipoQuarto + ", Hóspedes: " + quantidadePessoas + ", Total: R$" + String.format("%.2f", precoTotal);
    }
}
