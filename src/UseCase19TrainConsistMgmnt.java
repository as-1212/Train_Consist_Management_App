import java.util.Arrays;

public class TrainConsistApp {

    // Binary Search Method
    static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return true; // Found
            } 
            else if (result < 0) {
                low = mid + 1; // Search right half
            } 
            else {
                high = mid - 1; // Search left half
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        // Step 1: Bogie IDs (unsorted input allowed)
        String[] bogieIds = {
            "BG309",
            "BG101",
            "BG550",
            "BG205",
            "BG412"
        };

        String searchKey = "BG205";

        // Step 2: Ensure sorted data (precondition for binary search)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Step 3: Perform Binary Search
        boolean found = binarySearch(bogieIds, searchKey);

        // Step 4: Output result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in Train Consist");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND");
        }
    }
}
