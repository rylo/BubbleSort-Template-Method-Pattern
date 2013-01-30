import java.util.ArrayList;

class StringBubbleSort extends BubbleSort {

    public boolean compare(Object first, Object second) {
        return first.toString().compareToIgnoreCase(second.toString()) > 0;
    }

    public void swap(int index, ArrayList collectionToSort, Object first, Object second) {
        first = first.toString();
        second = second.toString();
        collectionToSort.set(index, second);
        collectionToSort.set(index + 1, first);
    }

}