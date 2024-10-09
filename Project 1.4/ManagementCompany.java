/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (In this class, you can crate a company that lets you manage
 * other properties, The properties are added in this class as well, including
 * name, taxID, plot for measuraments and more)
 * Due: 10/23/2023 
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yerenmy Zelaya
*/


package managementCompany;

public class ManagementCompany {
    // Instance variables
    private String companyName;
    private String taxId;
    private double managementFeePercentage;
    private Property[] properties;
    private Plot plot;
    private int numberOfProperties;

    // Constant class variables
    public static final int MAX_PROPERTY = 5;
    public static final int MGMT_WIDTH = 10;
    public static final int MGMT_DEPTH = 10;

    // Constructors
    public ManagementCompany() {
        this("", "", 0.0);
    }

    public ManagementCompany(String companyName, String taxId, double managementFeePercentage) {
        this.companyName = companyName;
        this.taxId = taxId;
        this.managementFeePercentage = managementFeePercentage;
        this.properties = new Property[MAX_PROPERTY];
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.numberOfProperties = 0;
    }

    public ManagementCompany(String companyName, String taxId, double managementFeePercentage,
                             int x, int y, int width, int depth) {
        this.companyName = companyName;
        this.taxId = taxId;
        this.managementFeePercentage = managementFeePercentage;
        this.properties = new Property[MAX_PROPERTY];
        this.plot = new Plot(x, y, width, depth);
        this.numberOfProperties = 0;
    }

    public ManagementCompany(ManagementCompany otherCompany) {
        this(otherCompany.companyName, otherCompany.taxId, otherCompany.managementFeePercentage,
             otherCompany.plot.getX(), otherCompany.plot.getY(), otherCompany.plot.getWidth(), otherCompany.plot.getDepth());
        for (int i = 0; i < otherCompany.numberOfProperties; i++) {
            this.properties[i] = new Property(otherCompany.properties[i]);
        }
        this.numberOfProperties = otherCompany.numberOfProperties;
    }

    // Getter and Setter methods
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public double getManagementFeePercentage() {
        return managementFeePercentage;
    }

    public void setManagementFeePercentage(double managementFeePercentage) {
        this.managementFeePercentage = managementFeePercentage;
    }

    public Property[] getProperties() {
        return properties;
    }

    public void setProperties(Property[] properties) {
        this.properties = properties;
    }

    public Plot getPlot() {
        return plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public int getNumberOfProperties() {
        return numberOfProperties;
    }

    public void setNumberOfProperties(int numberOfProperties) {
        this.numberOfProperties = numberOfProperties;
    }


    // Method to add a property to the properties array
    public int addProperty(String name, String city, double rent, String owner) {
        Property property = new Property(name, city, rent, owner);
        return addProperty(property);
    }

    public int addProperty(String name, String city, double rent, String owner,
                           int x, int y, int width, int depth) {
        Property property = new Property(name, city, rent, owner, x, y, width, depth);
        return addProperty(property);
    }

    public int addProperty(Property property) {
        if (numberOfProperties < MAX_PROPERTY && property != null) {
            // Check if the management company encompasses the property plot
            if (plot.encompasses(property.getPlot())) {
                // Check for overlap with existing properties
                for (int i = 0; i < numberOfProperties; i++) {
                    if (properties[i].getPlot().overlaps(property.getPlot())) {
                        return -4; // Overlap detected
                    }
                }
                // Add property and increment the count
                properties[numberOfProperties] = property;
                numberOfProperties++;
                return numberOfProperties - 1; // Return the index of the added property
            } else {
                return -3; // Management company does not encompass the property plot
            }
        } else {
            return -1; // Array is full or property is null
        }
    }

    // Method to calculate the total rent of all properties
    public double getTotalRent() {
        double totalRent = 0.0;
        for (int i = 0; i < numberOfProperties; i++) {
            totalRent += properties[i].getRentAmount();
        }
        return totalRent;
    }

    // Method to get the property with the highest rent
    public Property getHighestRentProperty() {
        if (numberOfProperties == 0) {
            return null; // No properties available
        }

        Property highestRentProperty = properties[0];
        for (int i = 1; i < numberOfProperties; i++) {
            if (properties[i].getRentAmount() > highestRentProperty.getRentAmount()) {
                highestRentProperty = properties[i];
            }
        }
        return highestRentProperty;
    }

    // Method to remove the last property in the array
    public void removeLastProperty() {
        if (numberOfProperties > 0) {
            properties[numberOfProperties - 1] = null;
            numberOfProperties--;
        }
    }

    // Method to check if the properties array is full
    public boolean isPropertiesFull() {
        return numberOfProperties == MAX_PROPERTY;
    }

    // Method to get the number of existing properties in the array
    public int getPropertiesCount() {
        return numberOfProperties;
    }

    // Method to check if the management fee is valid (between 0-100)
    public boolean isManagementFeeValid() {
        return managementFeePercentage >= 0 && managementFeePercentage <= 100;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("List of the properties for " + companyName + ", taxID: " + taxId + "\n");
        result.append("______________________________________________________\n");

        for (int i = 0; i < numberOfProperties; i++) {
            result.append(properties[i].toString()).append("\n");
        }

        result.append("______________________________________________________\n\n");
        result.append("Total management Fee: ").append(getTotalRent()).append("\n");

        return result.toString();
    }
    
    
    public String displayPropertyAtIndex(int i) {
        if (i >= 0 && i < properties.length && properties[i] != null) {
            return properties[i].toString();
        } else {
            return "Invalid index or property not found.";
        }
    }
    
}
