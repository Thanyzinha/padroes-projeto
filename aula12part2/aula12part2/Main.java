public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        System.out.println("Descrição inicial:");
        System.out.println(usuario.getDescricaoAssinatura());
        System.out.println("Preço inicial: R$ " + usuario.getPrecoTotal());

        System.out.println();

        usuario.adicionarPacote(Pacote1.class);
        usuario.adicionarPacote(Pacote3.class);
        usuario.adicionarPacote(Pacote1.class); // Tentativa de adicionar pacote repetido
        usuario.adicionarPacote(Pacote5.class);

        System.out.println();
        System.out.println("Descrição final:");
        System.out.println(usuario.getDescricaoAssinatura());

        System.out.printf("Preço final: R$ %.2f\n", usuario.getPrecoTotal());
    }
}
