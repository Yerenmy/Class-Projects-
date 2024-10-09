/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (This class test all of the methods in the class HolidayBonus
 * to make sure that it runs correctly)
 * Due: 11/13/2023
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yerenmy Zelaya
*/



package holidayBonus;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {

    @Test
    void testCalculateHolidayBonus() {
        double[][] salesData = {
                {100.0, 200.0, 150.0},
                {300.0, 250.0},
                {50.0, 120.0, 80.0}
        };

        double[] expectedBonuses = {50.0, 100.0, 75.0};

        assertArrayEquals(expectedBonuses, HolidayBonus.calculateHolidayBonus(salesData), 0.001);
    }

    @Test
    void testCalculateTotalHolidayBonus() {
        double[][] salesData = {
                {100.0, 200.0, 150.0},
                {300.0, 250.0},
                {50.0, 120.0, 80.0}
        };

        double expectedTotalBonus = 225.0;

        assertEquals(expectedTotalBonus, HolidayBonus.calculateTotalHolidayBonus(salesData), 0.001);
    }


}