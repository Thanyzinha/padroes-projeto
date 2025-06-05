public class Pacote5 extends PacoteDecorator {
    private final String descricaoPacote = "Pacote 5: Compra com Cash Back";
    private final double precoPacote = 19.99;

    public Pacote5(Assinatura assinatura) {
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
