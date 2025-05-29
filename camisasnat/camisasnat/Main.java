import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o time:");
        System.out.println("1 - Brasil (Nike)");
        System.out.println("2 - Flamengo (Adidas)");
        System.out.println("3 - Botafogo (Puma)");
        System.out.println("4 - Fluminense (Umbro)");
        System.out.println("5 - Vasco (Kappa)");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();
        FabricaEsportiva fabrica = null;

        switch (opcao) {
            case 1: fabrica = new FabricaNike(); break;
            case 2: fabrica = new FabricaAdidas(); break;
            case 3: fabrica = new FabricaPuma(); break;
            case 4: fabrica = new FabricaUmbro(); break;
            case 5: fabrica = new FabricaKappa(); break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        CamisaEsportiva camisa = fabrica.criarCamisa();
        System.out.println("\n--- INFORMAÇÕES DA CAMISA ---");
        System.out.println("Time: " + camisa.getTime());
        System.out.println("Fabricante: " + camisa.getFabricante());
        System.out.println("Descrição: " + camisa.getDescricao());
    }
}
