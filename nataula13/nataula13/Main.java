public class Main {
    public static void main(String[] args) {
        // Criando gêneros
        Genero acao = new Genero("Ação");
        Genero comedia = new Genero("Comédia");
        Genero terror = new Genero("Terror");
        Genero anime = new Genero("Anime");
        Genero ficcao = new Genero("Ficção Científica");

        Usuario joao = new Usuario("João");
        Usuario maria = new Usuario("Maria");
        Usuario ana = new Usuario("Ana");
        Usuario lucas = new Usuario("Lucas");
        Usuario pedro = new Usuario("Pedro");

        acao.addObserver(joao);
        acao.addObserver(pedro);

        comedia.addObserver(joao);
        comedia.addObserver(ana);

        terror.addObserver(maria);
        anime.addObserver(lucas);
        ficcao.addObserver(pedro);

        acao.adicionarConteudo(new Conteudo("Missão Impossível", "Ação"));
        comedia.adicionarConteudo(new Conteudo("As Branquelas", "Comédia"));
        terror.adicionarConteudo(new Conteudo("Invocação do Mal", "Terror"));
        anime.adicionarConteudo(new Conteudo("Attack on Titan", "Anime"));
        ficcao.adicionarConteudo(new Conteudo("Interestelar", "Ficção Científica"));
    }
}
