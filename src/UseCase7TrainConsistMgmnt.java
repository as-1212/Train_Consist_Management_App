import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for Bogie → Capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        // Display bogie capacity details
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }
    }
}
