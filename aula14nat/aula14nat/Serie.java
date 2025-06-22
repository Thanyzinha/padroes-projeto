public class Serie {
    private String title;
    private String genero;

    public Serie(String title, String genero) {
        this.title = title;
        this.genero = genero;
    }

    public String getTitle() {
        return title;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return title + " (" + genero + ")";
    }
}
