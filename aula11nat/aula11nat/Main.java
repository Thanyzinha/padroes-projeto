import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Kauã Victor TESTE", "111.222.333-44");
        Cliente c2 = new Cliente("Nathany Alves", "555.666.777-88");

        PacoteViagemFacade fachada = new PacoteViagemFacade();
        fachada.comprarPacote(Arrays.asList(c1, c2), "3F", "Executivo", "Luxo", "Crédito");
    }
}
