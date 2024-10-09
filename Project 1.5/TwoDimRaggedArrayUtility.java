/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (This class creates a two dimentinal array and the methods are
 * for manipulation of the conetent of the array, such as lowest value,
 * highest value, highes value in row, so on and so forth)
 * Due: 11/13/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yerenmy Zelaya
*/


package holidayBonus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TwoDimRaggedArrayUtility {

	public static double[][] readFile(File file) {
	    try (Scanner scanner = new Scanner(file)) {
	        int numRows = 0;
	        while (scanner.hasNextLine()) {
	            numRows++;
	            scanner.nextLine();
	        }

	        double[][] raggedArray = new double[numRows][];
	        
	        // Create a new Scanner for reading the file again
	        try (Scanner newScanner = new Scanner(file)) {
	            for (int i = 0; i < numRows; i++) {
	                // Read each line and split it into an array of doubles
	                String[] tokens = newScanner.nextLine().split("\\s+");
	                raggedArray[i] = new double[tokens.length];
	                for (int j = 0; j < tokens.length; j++) {
	                    raggedArray[i][j] = Double.parseDouble(tokens[j]);
	                }
	            }
	        }

	        return raggedArray;
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	        return null;
	    }
	}

    public static void writeToFile(double[][] raggedArray, File file) {
        try (PrintWriter writer = new PrintWriter(file)) {
            for (double[] row : raggedArray) {
                for (double value : row) {
                    writer.print(value + " ");
                }
                writer.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static double getTotal(double[][] raggedArray) {
        double total = 0;
        for (double[] row : raggedArray) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(double[][] raggedArray) {
        double total = getTotal(raggedArray);
        int numElements = 0;
        for (double[] row : raggedArray) {
            numElements += row.length;
        }
        return total / numElements;
    }

    public static double getRowTotal(double[][] raggedArray, int rowIndex) {
        double total = 0;
        if (rowIndex >= 0 && rowIndex < raggedArray.length) {
            for (double value : raggedArray[rowIndex]) {
                total += value;
            }
        }
        return total;
    }

    public static double getColumnTotal(double[][] raggedArray, int colIndex) {
        double total = 0;
        for (double[] row : raggedArray) {
            if (colIndex >= 0 && colIndex < row.length) {
                total += row[colIndex];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] raggedArray, int rowIndex) {
        double highest = Double.MIN_VALUE;
        if (rowIndex >= 0 && rowIndex < raggedArray.length) {
            for (double value : raggedArray[rowIndex]) {
                highest = Math.max(highest, value);
            }
        }
        return highest;
    }

    public static int getHighestInRowIndex(double[][] raggedArray, int rowIndex) {
        double highest = Double.MIN_VALUE;
        int highestIndex = -1;
        if (rowIndex >= 0 && rowIndex < raggedArray.length) {
            for (int i = 0; i < raggedArray[rowIndex].length; i++) {
                if (raggedArray[rowIndex][i] > highest) {
                    highest = raggedArray[rowIndex][i];
                    highestIndex = i;
                }
            }
        }
        return highestIndex;
    }

    public static double getLowestInRow(double[][] raggedArray, int rowIndex) {
        double lowest = Double.MAX_VALUE;
        if (rowIndex >= 0 && rowIndex < raggedArray.length) {
            for (double value : raggedArray[rowIndex]) {
                lowest = Math.min(lowest, value);
            }
        }
        return lowest;
    }

    public static int getLowestInRowIndex(double[][] raggedArray, int rowIndex) {
        double lowest = Double.MAX_VALUE;
        int lowestIndex = -1;
        if (rowIndex >= 0 && rowIndex < raggedArray.length) {
            for (int i = 0; i < raggedArray[rowIndex].length; i++) {
                if (raggedArray[rowIndex][i] < lowest) {
                    lowest = raggedArray[rowIndex][i];
                    lowestIndex = i;
                }
            }
        }
        return lowestIndex;
    }

    public static double getHighestInColumn(double[][] raggedArray, int colIndex) {
        double highest = Double.MIN_VALUE;
        for (double[] row : raggedArray) {
            if (colIndex >= 0 && colIndex < row.length) {
                highest = Math.max(highest, row[colIndex]);
            }
        }
        return highest;
    }

    public static int getHighestInColumnIndex(double[][] raggedArray, int colIndex) {
        double highest = Double.MIN_VALUE;
        int highestIndex = -1;
        for (int i = 0; i < raggedArray.length; i++) {
            if (colIndex >= 0 && colIndex < raggedArray[i].length) {
                if (raggedArray[i][colIndex] > highest) {
                    highest = raggedArray[i][colIndex];
                    highestIndex = i;
                }
            }
        }
        return highestIndex;
    }

    public static double getLowestInColumn(double[][] raggedArray, int colIndex) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : raggedArray) {
            if (colIndex >= 0 && colIndex < row.length) {
                lowest = Math.min(lowest, row[colIndex]);
            }
        }
        return lowest;
    }

    public static int getLowestInColumnIndex(double[][] raggedArray, int colIndex) {
        double lowest = Double.MAX_VALUE;
        int lowestIndex = -1;
        for (int i = 0; i < raggedArray.length; i++) {
            if (colIndex >= 0 && colIndex < raggedArray[i].length) {
                if (raggedArray[i][colIndex] < lowest) {
                    lowest = raggedArray[i][colIndex];
                    lowestIndex = i;
                }
            }
        }
        return lowestIndex;
    }

    public static double getHighestInArray(double[][] raggedArray) {
        double highest = Double.MIN_VALUE;
        for (double[] row : raggedArray) {
            for (double value : row) {
                highest = Math.max(highest, value);
            }
        }
        return highest;
    }

    public static double getLowestInArray(double[][] raggedArray) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : raggedArray) {
            for (double value : row) {
                lowest = Math.min(lowest, value);
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        // Example usage
        File inputFile = new File("input.txt");
        double[][] array = readFile(inputFile);

   
    }
  }
