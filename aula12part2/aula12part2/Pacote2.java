public class Pacote2 extends PacoteDecorator {
    private final String descricaoPacote = "Pacote 2: Frete Grátis em produtos";
    private final double precoPacote = 9.99;

    public Pacote2(Assinatura assinatura) {
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
