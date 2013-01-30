import java.util.ArrayList;

class IntegerBubbleSort extends BubbleSort<Integer> {

    public boolean compare(Object first, Object second) {
        return ((Number) first).intValue() > ((Number) second).intValue();
    }

    public void swap(int index, ArrayList collectionToSort, Object first, Object second) {
        first = ((Number) first).intValue();
        second = ((Number) second).intValue();
        collectionToSort.set(index, second);
        collectionToSort.set(index + 1, first);
    }

}