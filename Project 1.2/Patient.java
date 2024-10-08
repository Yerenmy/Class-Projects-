/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: (The 3 classes are, patient, procedure, and patientDriverApp, 
 * the class patient builds and stores the patient’s name, address and 
 * contact information. The class procedure stores and build the name 
 * of the procedure the name of the doctor and the price of the procedure. 
 * The class patientDriverAPP initializes the parameter 
 * of patient and procedure to certain values so that the other classes do 
 * and output the full built patient information.)
 * Due: 09/18/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yerenmy Zelaya
*/

package Patient;

public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    // no-arg constructor
    public Patient() {}

    // parametrized constructor for name
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // parametrized constructor for all attributes
    public Patient(String firstName, String middleName, String lastName,
                   String streetAddress, String city, String state, String zipCode,
                   String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // accessors and mutators for all attributes (getters and setters)

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    // (similarly add getters and setters for other attributes)

    // method to build full name
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // method to build address
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    // method to build emergency contact information
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    // toString method
    @Override
    public String toString() {
        return "Patient Information:\n" +
                "Full Name: " + buildFullName() + "\n" +
                "Address: " + buildAddress() + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Emergency Contact: " + buildEmergencyContact();
    }
}
