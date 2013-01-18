public class IntegerSort {

    public static void main(String[] args){
        int[] integerArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int first, second;
        boolean swapHappened = true;

        while(swapHappened){
            swapHappened = false;

            for(int x = 0; x < (integerArray.length - 1); x++) {
                first = integerArray[x];
                second = integerArray[x+1];

                if (first > second) {
                    integerArray[x] = second;
                    integerArray[x+1] = first;
                    swapHappened = true;
                }
            }
        }
        printArray(integerArray);
    }

    public static void printArray(int[] arrayToPrint){
        System.out.println("Outcome:");
        for(int x = 0; x < arrayToPrint.length; x++) {
            System.out.print(arrayToPrint[x]);
        }
    }

}
