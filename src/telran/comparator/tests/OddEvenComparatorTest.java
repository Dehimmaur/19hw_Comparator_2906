package telran.comparator.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.comparator.model.OddEvenComparator;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddEvenComparatorTest {
    Integer[] origin;
    Integer[] expected;
    OddEvenComparator comparator;
    
    @BeforeEach
    void setUp() {
        origin = new Integer[] {1,2,3,4,5,6,7,8,9,3};
        expected = new Integer[] {2,4,6,8,9,7,5,3,3,1};
        comparator = new OddEvenComparator();
    }

    @Test
    void testOddEven() {
        OddEvenComparator.printArray(origin);
        Arrays.sort(origin, comparator);
        assertArrayEquals(expected, origin);
        OddEvenComparator.printArray(origin);
    }

    @Test
    void  testOddEvenRandom() {
        Random random = new Random();
        final Integer SIZE = 50;

        Integer[] arr = new Integer[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }

        OddEvenComparator.printArray(arr);
        Arrays.sort(arr, comparator);
        OddEvenComparator.printArray(arr);
    }
}
