import java.util.ArrayList;

class IntegerBubbleSort extends BubbleSort {

    void main(ArrayList collectionToSort){
        int first, second;
        boolean swapHappened = true;

        while(swapHappened){
            swapHappened = false;

            for(int x = 0; x < (collectionToSort.size() - 1); x++) {
                first = ((Number) collectionToSort.get(x)).intValue();
                second = ((Number) collectionToSort.get(x+1)).intValue();

                if (first > second) {
                    collectionToSort.set(x, second);
                    collectionToSort.set(x+1, first);
                    swapHappened = true;
                }
            }
        }
        printArray(collectionToSort);
    }

}
