// Import libraries
import java.time.LocalDateTime;

// Declare the class
public class RestaurantMain {
    public static void main(String[] args) {
        // Create new instance of Restaurant object
        Restaurant restaurant = new Restaurant();

        /* Creates table 1-5 and tables with different
        capacities and numbers using the Table class
         */
        Table table1 = new Table(1, 4);
        Table table2 = new Table(2, 6);
        Table table3 = new Table(3, 2);
        Table table4 = new Table(4, 4);
        Table table5 = new Table(5, 4);

        // Adding tables to the restaurant by using the "newTable" method from the Table calss
        System.out.println("Adds tables...");
        restaurant.addTable(table1);
        restaurant.addTable(table2);
        restaurant.addTable(table3);
        restaurant.addTable(table4);
        restaurant.addTable(table5);
        System.out.println("Tables added.");

        // Creates customers
        System.out.println("Creates customers in private string...");
        Customer customer1 = new Customer("John","Doe","12345678");
        Customer customer2 = new Customer("Jane","Doe","987654321");
        Customer customer3 = new Customer("Janis","Joplin","432198765");
        System.out.println("Customers added.");

        // Creates reservations
        System.out.println("Acquires start time and end times on requested reservation(s).");
        // Creates start- and endtime for reservation
        LocalDateTime startTime = LocalDateTime.of(2024, 9, 10, 18, 0);
        LocalDateTime endTime = LocalDateTime.of(2024, 9, 10, 20, 0);
        System.out.println("Start time:" + " " + startTime + " | " + "End time:" + " " + endTime + "\n----------");

        restaurant.makeReservation(customer1, table1, startTime, endTime);
        restaurant.makeReservation(customer2, table2, startTime, endTime);
        restaurant.makeReservation(customer3, table3, startTime, endTime);

        // Print all reservations as requested in the assignment
        restaurant.printReservations();

        // Print all free tables between '//adds reservations' as requested in the assignment
        restaurant.printFreeTables(startTime, endTime);
    }
}
