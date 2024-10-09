/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (This class tests the methods in Plot class)
 * Due: 10/23/2023 
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yerenmy Zelaya
*/


package managementCompany;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class plotTestStudent {
    private Plot plot1, plot2, plot3, plot4, plot5, plot6, plot7, plot8, plot9, plot10;

    @Before
    public void setUp() throws Exception {
        plot1 = new Plot(12, 12, 6, 6); 
        plot2 = new Plot(10, 10, 2, 2);
        plot3 = new Plot(11, 11, 3, 2);
        plot4 = new Plot(16, 11, 4, 2);
        plot5 = new Plot(13, 14, 4, 3);
        plot6 = new Plot(16, 15, 3, 1);
        plot7 = new Plot(11, 16, 3, 3);
        plot8 = new Plot(16, 17, 4, 2);
        plot9 = new Plot(11, 14, 2, 1);
        plot10 = new Plot(19, 12, 2, 2);
    }

    @After
    public void tearDown() throws Exception {
        plot1=plot2=plot3=plot4=plot5=plot6=plot7=plot8=plot9=plot10=null;
    }

    @Test
    public void testOverlaps1() {
        assertTrue(plot1.overlaps(plot4));
        assertTrue(plot3.overlaps(plot1));
    }

    @Test
    public void testOverlaps2() {
        assertTrue(plot1.overlaps(plot3));
        assertTrue(plot3.overlaps(plot1));
        assertTrue(plot1.overlaps(plot4));
        assertTrue(plot4.overlaps(plot1));
    }

    @Test
    public void testOverlaps3() {
        assertTrue(plot1.overlaps(plot7));
        assertTrue(plot7.overlaps(plot1));
        assertTrue(plot1.overlaps(plot8));
        assertTrue(plot8.overlaps(plot1));
    }

    @Test
    public void testOverlaps4() {
        assertTrue(plot1.overlaps(plot9));
        assertTrue(plot9.overlaps(plot1));
        assertTrue(plot1.overlaps(plot6));
        assertTrue(plot6.overlaps(plot1));
    }

    @Test
    public void testOverlaps5() {
        assertFalse(plot3.overlaps(plot9));
        assertFalse(plot9.overlaps(plot3));
        assertFalse(plot5.overlaps(plot8));
        assertFalse(plot8.overlaps(plot5));
    }

    @Test
    public void testOverlaps6() {
        assertFalse(plot3.overlaps(plot4));
        assertFalse(plot4.overlaps(plot3));
        assertFalse(plot1.overlaps(plot10));
        assertFalse(plot10.overlaps(plot1));
        assertFalse(plot2.overlaps(plot1));
    }

    @Test
    public void testEncompasses1() {
        assertTrue(plot1.encompasses(plot5));
        assertFalse(plot5.encompasses(plot1));
        assertFalse(plot2.encompasses(plot1));
        assertFalse(plot3.encompasses(plot1));
        assertFalse(plot1.encompasses(plot3));
        assertFalse(plot7.encompasses(plot8));
        assertFalse(plot8.encompasses(plot7));
    }

    @Test
    public void testToString() {
        assertEquals("[12],[12],[6],[6]", "" + plot1);
    }

    @Test
    public void testGetWidth() {
        assertEquals(2, plot2.getWidth());
    }

    @Test
    public void testSetX() {
        plot3.setX(22);
        assertEquals(22, plot3.getX());
    }
}