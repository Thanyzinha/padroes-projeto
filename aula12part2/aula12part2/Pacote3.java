public class Pacote3 extends PacoteDecorator {
    private final String descricaoPacote = "Pacote 3: Caixa surpresa com produtos relacionados a filmes e séries";
    private final double precoPacote = 29.99;

    public Pacote3(Assinatura assinatura) {
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
