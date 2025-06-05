public class PassagemAerea {
    private String poltrona;
    private String classe;
    private double preco;

    public PassagemAerea(String poltrona) {
        this.poltrona = poltrona.toUpperCase();
        this.classe = determinarClasse(poltrona);
        this.preco = calcularPreco(this.classe);
    }

    private String determinarClasse(String poltrona) {
        int fileira = Integer.parseInt(poltrona.replaceAll("[^0-9]", ""));
        if (fileira >= 1 && fileira <= 3) return "Primeira Classe";
        if (fileira >= 4 && fileira <= 8) return "Executiva";
        return "Econômica";
    }

    private double calcularPreco(String classe) {
        double base = 500.0;
        if (classe.equals("Econômica")) return base;
        if (classe.equals("Executiva")) return base * 2.5;
        return base * 2.5 * 1.5; // Primeira classe
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Passagem - Poltrona: " + poltrona + ", Classe: " + classe + ", Preço: R$" + String.format("%.2f", preco);
    }
}
