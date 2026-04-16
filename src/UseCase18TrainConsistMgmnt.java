import java.util.Scanner;

public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Array of Bogie IDs (unsorted allowed)
        String[] bogieIds = {
            "BG101",
            "BG205",
            "BG309",
            "BG412",
            "BG550"
        };

        Scanner sc = new Scanner(System.in);

        // Step 2: Take search input
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3: Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                System.out.println("Bogie Found at index: " + i);
                found = true;
                break; // Early termination
            }
        }

        // Step 4: Result output
        if (!found) {
            System.out.println("Bogie NOT Found in Train Consist");
        }

        sc.close();
    }
}
