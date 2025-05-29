public class FabricaAdidas extends FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaFlamengo();
    }
}
