import java.util.Arrays;

public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Create array of bogie names
        String[] bogieNames = {
            "Sleeper",
            "AC Chair",
            "First Class",
            "General",
            "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 2: Sort using built-in Arrays.sort()
        Arrays.sort(bogieNames);

        // Step 3: Display sorted result
        System.out.println("\nAfter Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));
    }
}
