/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (This class tests the methods in Property class)
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

public class propertyTestStudent {
    private Property property1, property2, property3, property4;

    @Before
    public void setUp() throws Exception {
        property1 = new Property("Property1", "City1", 1000.0, "Owner1", 1, 1, 2, 2);
        property2 = new Property("Property2", "City2", 1500.0, "Owner2", 3, 3, 3, 3);
        property3 = new Property("Property3", "City3", 1200.0, "Owner3");
        property4 = new Property(property1);
    }

    @After
    public void tearDown() throws Exception {
        property1 = property2 = property3 = property4 = null;
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals("Property1", property1.getPropertyName());
        assertEquals("City1", property1.getCity());
        assertEquals(1000.0, property1.getRentAmount(), 0.01);
        assertEquals("Owner1", property1.getOwner());
        assertEquals(1, property1.getPlot().getX());
        assertEquals(1, property1.getPlot().getY());
        assertEquals(2, property1.getPlot().getWidth());
        assertEquals(2, property1.getPlot().getDepth());

        property1.setPropertyName("NewProperty");
        property1.setCity("NewCity");
        property1.setRentAmount(1200.0);
        property1.setOwner("NewOwner");
        property1.getPlot().setX(2);
        property1.getPlot().setY(2);
        property1.getPlot().setWidth(3);
        property1.getPlot().setDepth(3);

        assertEquals("NewProperty", property1.getPropertyName());
        assertEquals("NewCity", property1.getCity());
        assertEquals(1200.0, property1.getRentAmount(), 0.01);
        assertEquals("NewOwner", property1.getOwner());
        assertEquals(2, property1.getPlot().getX());
        assertEquals(2, property1.getPlot().getY());
        assertEquals(3, property1.getPlot().getWidth());
        assertEquals(3, property1.getPlot().getDepth());
    }

    @Test
    public void testToString() {
        assertEquals("Property1,City1,Owner1,1000.0", property1.toString());
        assertEquals("Property3,City3,Owner3,1200.0", property3.toString());
    }

    @Test
    public void testCopyConstructor() {
        assertEquals("Property1", property4.getPropertyName());
        assertEquals("City1", property4.getCity());
        assertEquals(1000.0, property4.getRentAmount(), 0.01);
        assertEquals("Owner1", property4.getOwner());
        assertEquals(1, property4.getPlot().getX());
        assertEquals(1, property4.getPlot().getY());
        assertEquals(2, property4.getPlot().getWidth());
        assertEquals(2, property4.getPlot().getDepth());
    }
}