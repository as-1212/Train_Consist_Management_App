import java.util.*;
import java.util.stream.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// Main class
public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Create list (reuse previous UC)
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 70));

        // Step 2: Aggregate total capacity using Stream API
        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Step 3: Display result
        System.out.println("Total Seating Capacity of Train: " + totalSeats);

        // Step 4: Show original list remains unchanged
        System.out.println("\nOriginal Bogie List:\n");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}
