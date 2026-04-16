import java.util.*;
import java.util.stream.*;

// Bogie class (same as UC7)
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

        // Step 1: Create list (reuse UC7)
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 2: Filter using Stream API (capacity > 60)
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):\n");

        for (Bogie b : filteredBogies) {
            b.display();
        }

        // Step 4: Show original list remains unchanged
        System.out.println("\nOriginal Bogie List:\n");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}
