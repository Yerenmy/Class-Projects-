/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (This is the holidayBonus class and this calculates the bonuses based on the 
 * loaded information in the two dimentional array)
 * Due: 11/13/2023
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yerenmy Zelaya
*/

package holidayBonus;

public class HolidayBonus {
    // Constants for bonus amounts
    private static final double HIGHEST_SALES_BONUS = 100.0;
    private static final double LOWEST_SALES_BONUS = 50.0;
    private static final double OTHER_SALES_BONUS = 75.0;

    public static double[] calculateHolidayBonus(double[][] sales) {
        int numRows = sales.length;
        double[] bonuses = new double[numRows];

        for (int i = 0; i < numRows; i++) {
            double[] row = sales[i];
            int numStores = row.length;

            if (numStores > 0) {
                // Get highest and lowest sales in the row
                double highestSales = TwoDimRaggedArrayUtility.getHighestInRow(sales, i);
                double lowestSales = TwoDimRaggedArrayUtility.getLowestInRow(sales, i);

                for (int j = 0; j < numStores; j++) {
                    if (sales[i][j] == highestSales) {
                        bonuses[j] = HIGHEST_SALES_BONUS;
                    } else if (sales[i][j] == lowestSales) {
                        bonuses[j] = LOWEST_SALES_BONUS;
                    } else {
                        bonuses[j] = OTHER_SALES_BONUS;
                    }
                }

                // Handle the last store separately to prevent ArrayIndexOutOfBoundsException
                int lastIndex = numStores - 1;
                if (sales[i][lastIndex] == highestSales) {
                    bonuses[lastIndex] = HIGHEST_SALES_BONUS;
                } else if (sales[i][lastIndex] == lowestSales) {
                    bonuses[lastIndex] = LOWEST_SALES_BONUS;
                } else {
                    bonuses[lastIndex] = OTHER_SALES_BONUS;
                }
            }
        }

        return bonuses;
    }
  
    public static double calculateTotalHolidayBonus(double[][] sales) {
        double totalBonus = 0;

        double[] bonuses = calculateHolidayBonus(sales);
        for (double bonus : bonuses) {
            totalBonus += bonus;
        }

        return totalBonus;
    }

    public static void main(String[] args) {
        // Example usage
        double[][] salesData = {
                {100.0, 200.0, 150.0},
                {300.0, 250.0},
                {50.0, 120.0, 80.0}
        };

        // Calculate individual store bonuses
        double[] individualBonuses = calculateHolidayBonus(salesData);
        System.out.println("Individual Bonuses:");
        for (double bonus : individualBonuses) {
            System.out.print(bonus + " ");
        }
        System.out.println();

        // Calculate total district bonus
        double totalBonus = calculateTotalHolidayBonus(salesData);
        System.out.println("Total District Bonus: " + totalBonus);
    }
}