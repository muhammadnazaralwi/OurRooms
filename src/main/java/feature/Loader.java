package feature;

public interface Loader<T> {
    T[] load() throws Exception;
}
