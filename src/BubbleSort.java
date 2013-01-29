import java.util.ArrayList;

abstract class BubbleSort {

    abstract void main(ArrayList collectionToSort);

    public final void printArray(ArrayList arrayToPrint){
        System.out.println("Outcome:");
        for(int x = 0; x < arrayToPrint.size(); x++) {
            System.out.println(arrayToPrint.get(x));
        }
    }
}