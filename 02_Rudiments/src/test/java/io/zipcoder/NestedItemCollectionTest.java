package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NestedItemCollectionTest {

    Integer[][] integerArray = {{5,3},{1,2,5,3,4,5}, {4,3,2,1,3,3,3,3,3,3,3,3},{3,3,3,3,3,3},{3,3},{2},{1}};
    NestedItemCollection collection;

    @Before
    public void setup(){
        collection = new NestedItemCollection(integerArray);
    }

    @Test
    public void intializeNestedItemsArraySizeTest(){
        int expected = 7;
        int actual = collection.length();
        assertEquals("The value of the initialized array should be 2",expected, actual);
    }

    @Test
    public void iniializedNestedItemsArrayElementTest(){
        NestedItem itemExpected = new NestedItem(integerArray[6]);
        NestedItem itemActual = collection.getAtIndex(0);
        Integer expected = itemExpected.getPrimeNumberCount();
        Integer actual = itemActual.getPrimeNumberCount();
        assertEquals(expected, actual);
    }


    @Test
    public void assortByPrimeCountNestedTest(){
        NestedItem expectedOrder = new NestedItem(new Integer[] {1});
        NestedItem actualOrder = collection.getAtIndex(0);
       for(int i =0; i < collection.length(); i++)
        System.out.println(collection.getAtIndex(i).toString());
        assertEquals("Testing order of sorted sub arrays", expectedOrder.toString(),actualOrder.toString());

    }
}
