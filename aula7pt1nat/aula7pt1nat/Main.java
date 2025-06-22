public class Main {
    public static void main(String[] args) {
        EquipamentoFactory montanha = new FabricaMontanha();
        Mochila mochilaMontanha = montanha.criarMochila();
        Bota botaMontanha = montanha.criarBota();

        mochilaMontanha.exibirInfo();
        botaMontanha.exibirInfo();

        System.out.println("---------------");

        EquipamentoFactory selva = new FabricaSelva();
        Mochila mochilaSelva = selva.criarMochila();
        Bota botaSelva = selva.criarBota();

        mochilaSelva.exibirInfo();
        botaSelva.exibirInfo();
    }
}
