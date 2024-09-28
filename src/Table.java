// Creating the class
public class Table {
    // Describing the properties of the Table class
    private int tableNumber;
    private int capacity;

    // Constructorr
    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
    }

    // Getters

    // Get table number
    public int getTableNumber() {
        return tableNumber;
    }
    // Get capacity
    public int getCapacity() {
        return capacity;
    }

    // Setters
    // Set table number
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    // Set capacity
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}