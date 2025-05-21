public class Main {
    public static void main(String[] args) {
        FabricaViolao fabrica = new FabricaViolao();

        ViolaoPrototype violao1 = fabrica.getViolao("folk");
        violao1.exibirInfo();

        ViolaoPrototype violao2 = fabrica.getViolao("7cordas");
        violao2.exibirInfo();

        ViolaoPrototype violao3 = fabrica.getViolao("triplozero");
        violao3.exibirInfo();

        ViolaoPrototype violao4 = fabrica.getViolao("unknown");
        if (violao4 != null) {
            violao4.exibirInfo();
        }
    }
}
