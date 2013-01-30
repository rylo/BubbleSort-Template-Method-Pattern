import java.math.BigDecimal;
import java.util.ArrayList;

class FloatBubbleSort extends BubbleSort<BigDecimal> {

    public boolean compare(Object first, Object second) {
        return ((Number) first).floatValue() > ((Number) second).floatValue();
    }

    public void swap(int index, ArrayList collectionToSort, Object first, Object second) {
        first = ((Number) first).floatValue();
        second = ((Number) second).floatValue();
        collectionToSort.set(index, second);
        collectionToSort.set(index + 1, first);
    }

}
