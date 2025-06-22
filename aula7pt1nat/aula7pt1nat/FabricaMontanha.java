public class FabricaMontanha implements EquipamentoFactory {
    public Mochila criarMochila() {
        return new MochilaMontanha();
    }

    public Bota criarBota() {
        return new BotaMontanha();
    }
}
