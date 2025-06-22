public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Conteudo conteudo, String genero) {
        System.out.println("🔔 " + nome + " foi notificado: Novo conteúdo de " + genero + " - " + conteudo.getTitulo());
    }

    public String getNome() {
        return nome;
    }
}
