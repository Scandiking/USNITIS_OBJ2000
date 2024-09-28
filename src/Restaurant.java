// Import array list for array
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;


// Create the restaurant class
public class Restaurant {

    // List for the tables in the restaurant
    private List<Table> tableList;
    private List<Reservation> reservations;

    // Constructors to initialize the list
    public Restaurant() {
        this.tableList = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    // Method to add a table to the list
    // getTablenumber and getCapacity depends that you have the Table.java-class and its methods
    public void addTable(Table table) {
        tableList.add(table);
        System.out.println("Table " + table.getTableNumber() + " with capacity of " + table.getCapacity() + " added.");
    }

    // Check availability
    public boolean checkAvailability(Table table, LocalDateTime startTime, LocalDateTime endTime) {
        for (Reservation reservation : reservations) {
            if (reservation.getTable().equals(table) &&
                    (reservation.getStartTime().isBefore(endTime) && reservation.getEndTime().isAfter(startTime))) {
                return false;
            }
        }
        return true;
    }

    public List<Table> searchFreeTables(LocalDateTime startTime, LocalDateTime endTime) {
        List<Table> freeTables = new ArrayList<>();
        for (Table table : tableList) {
            if (checkAvailability(table, startTime, endTime)) {
                freeTables.add(table);
            }
        }
        return freeTables;
    }

    // Method to print out free tables
    public void printFreeTables(LocalDateTime startTime, LocalDateTime endTime) {
        List<Table> freeTables = searchFreeTables(startTime, endTime);
        if (freeTables.isEmpty()) {
            System.out.println("No free tables found.");
        } else {
            System.out.println("Free tables between " + startTime + " and " + endTime + ":");
            for (Table table : freeTables) {
                System.out.println("Table " + table.getTableNumber() + " with capacity of " + table.getCapacity() + " is free between " + startTime + " and " + endTime);
            }
        }
    }

    public void makeReservation(Customer customer, Table table, LocalDateTime startTime, LocalDateTime endTime) {
        if (checkAvailability(table, startTime, endTime)) {
            Reservation reservation = new Reservation(customer, table, startTime, endTime);
            reservations.add(reservation);
            System.out.println("Reservation confirmed:\n" + reservation);
        } else {
            System.out.println("The table is busy in that period.");

        }

    }


    public void printReservations() {
    for (Reservation reservation : reservations) {
        System.out.println("Reservation:\n" + reservation);
    }
    }
}