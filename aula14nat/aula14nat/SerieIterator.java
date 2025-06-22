public class SerieIterator implements Iterator {
    private SerieCollection collection;
    private int index = 0;

    public SerieIterator(SerieCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getSeries().size();
    }

    @Override
    public Serie next() {
        return collection.getSeries().get(index++);
    }
}
