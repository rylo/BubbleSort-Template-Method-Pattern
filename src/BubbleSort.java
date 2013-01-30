import java.lang.reflect.Type;
import java.util.ArrayList;

abstract class BubbleSort<TheTypeWeWant> {

    public final void sort(ArrayList collectionToSort){
        Object first, second;
        boolean swapHappened = true;

        while(swapHappened){
            swapHappened = false;

            for(int x = 0; x < (collectionToSort.size() - 1); x++) {
                first = collectionToSort.get(x);
                second = collectionToSort.get(x+1);

                if (compare(first, second)) {
                    swap(x, collectionToSort, first, second);
                    swapHappened = true;
                }
            }
        }
        printArray(collectionToSort);
    }

    abstract void swap(int index, ArrayList array, Object first, Object second);

    abstract boolean compare(Object first, Object second);

    public final void printArray(ArrayList arrayToPrint){
        System.out.println("Outcome:");
        for(int x = 0; x < arrayToPrint.size(); x++) {
            System.out.println(arrayToPrint.get(x));
        }
    }

}
