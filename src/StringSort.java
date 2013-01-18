public class StringSort {

    public static void main(String[] args){
        String[] stringArray = {"mario", "luigi", "princess", "toad", "bowser"};
        String first, second;
        boolean swapHappened = true;

        while(swapHappened){
            swapHappened = false;

            for(int x = 0; x < (stringArray.length - 1); x++) {
                first = stringArray[x];
                second = stringArray[x+1];

                if () {
                    stringArray[x] = second;
                    stringArray[x+1] = first;
                    swapHappened = true;
                }
            }
        }
        printArray(stringArray);
    }

    public static void printArray(String[] arrayToPrint){
        System.out.println("Outcome:");
        for(int x = 0; x < arrayToPrint.length; x++) {
            System.out.println(arrayToPrint[x]);
        }
    }

}
