public class AluguelCarro {
    private String tipo;
    private double preco;

    public AluguelCarro(String tipo) {
        this.tipo = tipo;
        this.preco = calcularPreco();
    }

    private double calcularPreco() {
        if (tipo.equalsIgnoreCase("Econômico")) return 150.0;
        if (tipo.equalsIgnoreCase("Executivo")) return 150.0 * 2;
        if (tipo.equalsIgnoreCase("Luxo")) return 150.0 * 2 * 2;
        return 0.0;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Carro - Tipo: " + tipo + ", Preço: R$" + String.format("%.2f", preco);
    }
}
