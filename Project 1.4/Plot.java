/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (In this class, you can plot the position of the property,
 * the width and the depth of it aswell, it also checks for
 * overlapping and out of bounds)
 * Due: 10/23/2023 
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yerenmy Zelaya
*/

package managementCompany;

public class Plot {
    // Instance variables
    private int x;      // x-coordinate of the upper left corner
    private int y;      // y-coordinate of the upper left corner
    private int width;  // horizontal extent of the plot
    private int depth;  // vertical extent of the plot

    // Constructors
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

  
	public Plot(Plot other) {
    this.x = other.x;
    this.y = other.y;
    this.width = other.width;
    this.depth = other.depth;
   }


	// Getter and Setter methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    // Method to check if the current plot overlaps with another plot
    public boolean overlaps(Plot other) {
        return x < other.x + other.width &&
               x + width > other.x &&
               y < other.y + other.depth &&
               y + depth > other.y;
    }

    // Method to check if the current plot encompasses another plot
    public boolean encompasses(Plot other) {
        return x <= other.x &&
               x + width >= other.x + other.width &&
               y <= other.y &&
               y + depth >= other.y + other.depth;
    }

    // toString method
    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}