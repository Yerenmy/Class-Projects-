/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (This is the driver class where it its given certain parameters and values so that the patient
 * information and procedure can be displayed inn a ordered manner when running, it  )
 * Due: 09/18/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yerenmy Zelaya
*/


package Patient;

public class PatientDriverApp {
    public static void main(String[] args) {
        // Create an instance of the Patient class with sample data
        Patient patient = new Patient("Joe", "", "Biden",
                "11420 Monterrey Dr", "Silver Spring", "MD", "20902",
                "240-877-3800", "Maria Zelaya", "240-543-5494");

        // Create three instances of the Procedure class using different constructors
        Procedure procedure1 = new Procedure("X-Ray", "06/01/2023","Dr.Zelaya", 10000);
        Procedure procedure2 = new Procedure("Blood Test", "06/02/2023", "Dr. Anderson", 10000);
        Procedure procedure3 = new Procedure("MRI", "06/03/2023", "Dr. Johnson", 10000);

        // Display patient information
        displayPatient(patient);

        // Display information about all three procedures
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display total charges of the three procedures
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("Total Charges for All Procedures: $" + String.format("%.2f", totalCharges));
        System.out.println();
        System.out.println("Yerenmy Zelaya\n"+"M21139100\n"+ "Due Date: 09/18/2023\n" );
   
    
    }

    // Method to display patient information
    private static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
        System.out.println();
    }

    // Method to display procedure information
    private static void displayProcedure(Procedure procedure) {
        System.out.println(procedure.toString());
        System.out.println();
    }

    // Method to calculate total charges of three procedures
    private static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return (procedure1).getCharges() + procedure2.getCharges() + procedure3.getCharges();
    }
}