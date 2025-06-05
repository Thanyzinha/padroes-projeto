public class AssinaturaBase implements Assinatura {
    private final String descricao = "Assinatura Base - Assistir vídeos num único dispositivo";
    private final double preco = 9.99;

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
