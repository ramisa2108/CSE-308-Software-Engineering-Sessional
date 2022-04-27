import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SortTest {

    private Sort sort;
    private int [] inputArray;
    private int [] sortedArray;
    private String testName;

    public SortTest(int [] inputArray, String testName){
        super();
        this.inputArray = inputArray;
        this.testName = testName;
    }

    @Before
    public void initialize(){
        sort = new Sort();
    }

    @Parameterized.Parameters
    public static Collection input(){

        ArrayList<Object> testCases = new ArrayList<>();

        // blank list
        testCases.add(new Object[] {new int []{}, "blank test"});


        // just one number
        testCases.add(new Object[] {new int []{1}, "one number test"});

        // two numbers
        testCases.add(new Object[] {new int []{5, 2}, "two numbers test"});

        // random size
        int length = (int) (Math.random() * 50);
        int [] l = new int [length];

        for(int i=0;i<length;i++){
            l[i] = i % 10;
        }
        testCases.add(new Object[] {l, "random size test"});

        // random numbers
        int [] l2 = new int[20];
        for(int i=0;i<20;i++){
            l2[i] = (int) (Math.random() * 100);
        }
        testCases.add(new Object[] {l2, "random numbers test"});


        // sorted ascending
        testCases.add(new Object[] {new int [] {10, 20, 500, 1000, 2000, 100000}, "sorted ascending test"});


        // sorted descending
        testCases.add(new Object[] {new int [] {105, 93, 77, 25, 4, 0}, "sorted descending test"});


        // all equal
        testCases.add(new Object[] {new int []{8, 8, 8, 8, 8}, "all equal test"});


        // all negative
        testCases.add(new Object[] {new int []{-3, -10, -1, -100, -5}, "all negative test"});


        // border values
        testCases.add(new Object[] {new int []{2147483647, -2147483648, 2147483647, -2147483647, 2147483646},
                "border values test"});


        return testCases;
    }


    @Test
    public void testSortedAscending(){

        sortedArray = sort.sortList(inputArray);
        for(int i=1;i<sortedArray.length;i++){
            assertTrue(sortedArray[i] >= sortedArray[i-1], "Array not in ascending order in " + this.testName);
        }
    }

    @Test
    public void testAlteration(){

        sortedArray = sort.sortList(inputArray);
        assertEquals(inputArray.length, sortedArray.length, "Array length altered by sorting routine in " + this.testName);

        int count = 0, value;
        for(int i=0;i<sortedArray.length;i++) {

            if (i == 0 || sortedArray[i] == sortedArray[i - 1]) {
                count++;
            }
            else
            {
                for(int x:inputArray){
                    if(x == sortedArray[i-1]){
                        count--;
                    }
                }
                assertEquals(0, count, "Array altered by sorting routine in " + this.testName);
                count = 1;
            }
        }
        for(int x:inputArray){
            if(x == sortedArray[sortedArray.length-1]){
                count--;
            }
        }
        assertEquals(0, count, "Array altered by sorting routine in " + this.testName);

    }

    @After
    public void tearDown(){
        sort = null;
    }

}