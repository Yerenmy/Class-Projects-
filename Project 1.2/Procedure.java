/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (This is the class procedure, in this class stores and build the medical procedures,
 * and returns it when it is complete, it has getter and sett)
 * Due: 09/18/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yerenmy Zelaya
*/



package Patient;

public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    // no-arg constructor
    public Procedure() {}

    // parametrized constructor for name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // parametrized constructor for all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // accessors and mutators for all attributes (getters and setters)

    public String getProcedureName() {
        return procedureName;
    }
   
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    // toString method
    @Override
    public String toString() {
        return "Procedure Information:\n" +
                "Procedure Name: " + procedureName + "\n" +
                "Procedure Date: " + procedureDate + "\n" +
                "Practitioner Name: " + practitionerName + "\n" +
                "Charges: $" + String.format("%.2f", charges);
    }
}