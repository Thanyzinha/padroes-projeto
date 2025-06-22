import java.util.ArrayList;
import java.util.List;

public class SerieCollection implements Aggregate {
    private List<Serie> series = new ArrayList<>();

    public void addSerie(Serie serie) {
        series.add(serie);
    }

    public List<Serie> getSeries() {
        return series;
    }

    @Override
    public Iterator createIterator() {
        return new SerieIterator(this);
    }
}
