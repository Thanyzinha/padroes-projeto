public class Main {
    public static void main(String[] args) {
        SerieCollection colecao = new SerieCollection();

        colecao.addSerie(new Serie("Stranger Things", "Ficção"));
        colecao.addSerie(new Serie("The Office", "Comédia"));
        colecao.addSerie(new Serie("Breaking Bad", "Drama"));
        colecao.addSerie(new Serie("Dahmer", "Crime"));

        Iterator iterator = colecao.createIterator();

        System.out.println("Séries disponíveis na plataforma:");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }
}
