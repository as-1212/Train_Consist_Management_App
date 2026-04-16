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

        // Step 1: Create list (reuse UC7/UC8)
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 70)); // duplicate type for grouping
        bogieList.add(new Bogie("AC Chair", 60));

        // Step 2: Group using Stream API
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Step 3: Display grouped bogies
        System.out.println("Grouped Bogies by Type:\n");

        for (String type : groupedBogies.keySet()) {
            System.out.println("Type: " + type);

            for (Bogie b : groupedBogies.get(type)) {
                b.display();
            }
            System.out.println();
        }

        // Step 4: Show original list remains unchanged
        System.out.println("Original Bogie List:\n");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}
