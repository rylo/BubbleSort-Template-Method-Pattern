public interface SortStrategy<T> {
    public void swap();
    public boolean compare(T first, T second);
}