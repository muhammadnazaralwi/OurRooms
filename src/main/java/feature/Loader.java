package feature;

public interface Loader<T> {
    // Abstraksi load() method dengan return type generics T
    // dan juga bisa melempar exception
    T[] load() throws Exception;
}
