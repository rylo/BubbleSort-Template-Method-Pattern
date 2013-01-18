public class FloatSort {

    public static void main(String[] args){
        double[] floatArray = {3.123, 1.32, 4.851, 1.1111, 5.12, 9.7137430, 2.0, 6.2, 5.13, 3.97263, 5.01};
        double first, second;
        boolean swapHappened = true;

        while(swapHappened){
            swapHappened = false;

            for(int x = 0; x < (floatArray.length - 1); x++) {
                first = floatArray[x];
                second = floatArray[x+1];

                if (first > second) {
                    floatArray[x] = second;
                    floatArray[x+1] = first;
                    swapHappened = true;
                }
            }
        }
        printArray(floatArray);
    }

    public static void printArray(double[] arrayToPrint){
        System.out.println("Outcome:");
        for(int x = 0; x < arrayToPrint.length; x++) {
            System.out.println(arrayToPrint[x]);
        }
    }

}
