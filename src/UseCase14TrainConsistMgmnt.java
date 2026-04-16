import java.util.*;

// Step 1: Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Step 2: Passenger Bogie Class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor with validation
    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// Step 3: Main Class
public class TrainConsistApp {
    public static void main(String[] args) {

        List<PassengerBogie> bogieList = new ArrayList<>();

        try {
            // Valid bogies
            bogieList.add(new PassengerBogie("Sleeper", 72));
            bogieList.add(new PassengerBogie("AC Chair", 56));

            // Invalid bogie (will throw exception)
            bogieList.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display only valid bogies
        System.out.println("\nValid Bogies in Train:\n");
        for (PassengerBogie b : bogieList) {
            b.display();
        }
    }
}
