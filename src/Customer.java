// Create the customer class and its properties

public class Customer {
    private String fName;
    private String lName;
    private String phoneNumber;

    // Constructor
    public Customer(String fName, String lName, String phoneNumber) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}