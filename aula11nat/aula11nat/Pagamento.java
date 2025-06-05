public class Pagamento {
    private String forma;
    private double valorFinal;

    public Pagamento(String forma, double total) {
        this.forma = forma;
        this.valorFinal = calcularValor(forma, total);
    }

    private double calcularValor(String forma, double total) {
        if (forma.equalsIgnoreCase("PIX")) return total * 0.9;
        if (forma.equalsIgnoreCase("Boleto")) return total * 0.95;
        if (forma.equalsIgnoreCase("Crédito")) return total * (1 + (3.99 / 100) * 5);
        return total; // Débito ou outros
    }

    public double getValorFinal() {
        return valorFinal;
    }

    @Override
    public String toString() {
        return "Pagamento - Forma: " + forma + ", Total final: R$" + String.format("%.2f", valorFinal);
    }
}
