/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (This class tests the methods in ManagementCompany class)
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

public class ManagementCompanyTestStudent {
    Property property1, property2, property3, property4, property5, property6;
    ManagementCompany managementCompany;

    @Before
    public void setUp() throws Exception {
        // Set up test data before each test
        property1 = new Property("VaCasa", "VacaNation", 1000, "Yerenmy Zelaya", 2, 1, 2, 2);
        property2 = new Property("ElParaiso", "WoodLand", 4114, "Mr. Barmber", 4, 1, 2, 2);
        property3 = new Property("LakeHouse", "MetaVerse", 4905, "Ganicus", 6, 1, 2, 2);

        managementCompany = new ManagementCompany("DoctoreINC", "11111", 6);

        // Add properties to the management company
        managementCompany.addProperty(property1);
        managementCompany.addProperty(property2);
        managementCompany.addProperty(property3);
    }

    @After
    public void tearDown() throws Exception {
        // Clean up resources after each test
        property1 = property2 = property3 = property4 = property5 = property6 = null;
        managementCompany = null;
    }

    @Test
    public void testGetMaxProperty() {
        // Test the getMaxProperty method
    	assertEquals(managementCompany.getHighestRentProperty(), property3);
    }

    @Test
    public void testAddProperty() {
        // Test the addProperty method
        property4 = new Property("SunRice", "Orizon", 2600, "Joel", 2, 5, 2, 2);
        property5 = new Property("BrickMade", "BrickLand", 5000, "Dr. Octopus", 4, 5, 2, 2);
        property6 = new Property("OutOfBounds", "NoSpaceLand", 1000, "Vanisher", 6, 5, 2, 2);

        assertEquals(managementCompany.addProperty(property4), 3, 0);
        assertEquals(managementCompany.addProperty(property5), 4, 0);
        assertEquals(managementCompany.addProperty(property6), -1, 0);  // Exceeds the size of the array and cannot be added.
    }

    @Test
    public void testCalculateTotalRent() {
        // Test the totalRent method
        assertEquals(managementCompany.getTotalRent(), 10019.0, 0);
    }

    @Test
    public void testFindMaxRentProperty() {
        // Test the maxRentProp method
    	assertEquals(managementCompany.getHighestRentProperty(), property3);
    }

   
    @Test
    public void testDisplayPropertyAtIndex() {
        // Test the displayPropertyAtIndex method

        // Find and print the third property
        String propertyInfo = managementCompany.displayPropertyAtIndex(2);

        // Split the toString into an array
        String[] propertyInfoArray = propertyInfo.split(" ");

        // Test that the last element of the toString is the rent of the third property
        assertEquals(propertyInfoArray[propertyInfoArray.length - 1], "LakeHouse,MetaVerse,Ganicus,4905.0");

        // Additional test: make sure the first element is the property name
        assertEquals(propertyInfoArray[0], "LakeHouse,MetaVerse,Ganicus,4905.0");
    }
}