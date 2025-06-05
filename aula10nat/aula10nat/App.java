import model.CaixaAssinatura;
import model.NivelAssinatura;

public class App {
    public static void main(String[] args) {
        CaixaAssinatura caixaBronze = new CaixaAssinatura(NivelAssinatura.BRONZE);
        caixaBronze.mostrarCaixa();

        System.out.println();

        CaixaAssinatura caixaOuro = new CaixaAssinatura(NivelAssinatura.OURO);
        caixaOuro.mostrarCaixa();
    }
}
