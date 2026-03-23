import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmnt {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist (Empty List of Bogies)
        List<String> trainConsist = new ArrayList<>();

        // Display Initial Bogie Count
        System.out.println("Train initialized successfully...");
        System.out.println("Initial bogie count: " + trainConsist.size());
        System.out.println("Current Train Consist : []");
        // Program continues...
    }
}