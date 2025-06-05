public class Pacote4 extends PacoteDecorator {
    private final String descricaoPacote = "Pacote 4: Cartão de crédito Platinum";
    private final double precoPacote = 49.99;

    public Pacote4(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + " + " + descricaoPacote;
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + precoPacote;
    }
}
