package telran.comparator.model;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 != 0) {
            return -1;
        } else if (o1 % 2 != 0 && o2 % 2 == 0) {
            return 1;
        } else if (o1 % 2 == 0 && o2 % 2 == 0) {
            return Integer.compare(o1, o2);
        } else {
            return Integer.compare(o2, o1);
        }
    }

    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("====================================");
    }

    public OddEvenComparator() {
    }
}
