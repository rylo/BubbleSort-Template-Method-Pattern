public class StringSortStrategy implements SortStrategy<String> {

    public void swap() {

    }

    @Override
    public boolean compare(String first, String second) {
        return first.compareToIgnoreCase(second) > 0;
    }
}