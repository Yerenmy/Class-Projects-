/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (This class test most of the methods in the twodimentionalarray
 * class, the GFA are included and I expanded the class to test for the rest
 * of the methods)
 * Due: 11/13/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yerenmy Zelaya
*/



package holidayBonus;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class twoDimRaggedArrayUtilityTestStudent {
    private double[][] dataSet1 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetRowTotal() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 1), .001);
    }

    // Add more test cases for other methods...

    @Test
    public void testGetColumnTotal() {
        assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 2), .001);
    }

    @Test
    public void testGetAverage() {
        assertEquals(5.0, TwoDimRaggedArrayUtility.getAverage(dataSet1), .001);
    }

    @Test
    public void testGetHighestInRow() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 2), .001);
    }

    @Test
    public void testGetLowestInRow() {
        assertEquals(6.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 2), .001);
    }

    @Test
    public void testGetHighestInColumn() {
        assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 2), .001);
    }

    @Test
    public void testGetLowestInColumn() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 0), .001);
    }


    @Test
    public void testGetHighestInArray() {
        assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), .001);
    }

    @Test
    public void testGetLowestInArray() {
        assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), .001);
    }

    @Test
    public void testGetHighestInRowIndex() {
        assertEquals(3, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 2));
    }

    @Test
    public void testGetLowestInRowIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 0));
    }

    @Test
    public void testGetHighestInColumnIndex() {
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 2));
    }

    @Test
    public void testGetLowestInColumnIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 0));
    }

}