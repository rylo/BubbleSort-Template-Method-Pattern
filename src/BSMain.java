import java.util.ArrayList;

public class BSMain {
    public static void main(String[] args){
        ArrayList<Integer> integerList = new ArrayList<Integer>();
            integerList.add(290);
            integerList.add(3);
            integerList.add(90);
            integerList.add(1);
            integerList.add(8);
        IntegerBubbleSort integerSort = new IntegerBubbleSort();
        integerSort.sort(integerList);

        ArrayList<Float> floatList = new ArrayList<Float>();
            floatList.add(1.23123f);
            floatList.add(3.32121f);
            floatList.add(0.99443f);
            floatList.add(1.11111f);
            floatList.add(8.92348f);
        FloatBubbleSort floatSort = new FloatBubbleSort();
        integerSort.sort(floatList);

        ArrayList<String> stringList = new ArrayList<String>();
            stringList.add("princess");
            stringList.add("bowser");
            stringList.add("mario");
            stringList.add("yoshi");
            stringList.add("luigi");
        StringBubbleSort stringSort = new StringBubbleSort();
        stringSort.sort(stringList);
    }
}