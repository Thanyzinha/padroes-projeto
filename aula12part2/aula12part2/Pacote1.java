public class Pacote1 extends PacoteDecorator {
    private final String descricaoPacote = "Pacote 1: Assistir vídeos em vários dispositivos";
    private final double precoPacote = 19.99;

    public Pacote1(Assinatura assinatura) {
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
