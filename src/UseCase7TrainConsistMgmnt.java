import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Method to display bogie details
    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

// Main class
public class TrainConsistApp {
    public static void main(String[] args) {

        // Creating list of bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Adding passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Sorting using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies Sorted by Capacity:\n");

        for (Bogie b : bogieList) {
            b.display();
        }
    }
}
