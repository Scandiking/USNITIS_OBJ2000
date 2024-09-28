// Importing date and time for reservations
import java.time.LocalDateTime;


// Creating the class Reservation...
public class Reservation {
    // ...and its properties
    private Customer customer;          // placeholder for customer
    private Table table;                // placeholder for table number
    private LocalDateTime startTime;    // placeholder for the start time of the reservation
    private LocalDateTime endTime;      // placeholder for the end time of the reservation

    // Constructor
    public Reservation(Customer customer, Table table, LocalDateTime startTime, LocalDateTime endTime) {
        this.customer = customer;
        this.table = table;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public Table getTable() {
        return table;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    // Setters
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer.getfName() + " " + customer.getlName() +
                ", table=" + table.getTableNumber() +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
