import java.util.ArrayList;

class StringBubbleSort extends BubbleSort {

    void main(ArrayList collectionToSort){
        String first, second;
        boolean swapHappened = true;

        while(swapHappened){
            swapHappened = false;

            for(int x = 0; x < (collectionToSort.size() - 1); x++) {
                first = collectionToSort.get(x).toString();
                second = collectionToSort.get(x+1).toString();

                if (first.compareToIgnoreCase(second) > 0) {
                    collectionToSort.set(x, second);
                    collectionToSort.set(x+1, first);
                    swapHappened = true;
                }
            }
        }
        printArray(collectionToSort);
    }

}
