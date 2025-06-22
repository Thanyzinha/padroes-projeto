public class FabricaSelva implements EquipamentoFactory {
    public Mochila criarMochila() {
        return new MochilaSelva();
    }

    public Bota criarBota() {
        return new BotaSelva();
    }
}
