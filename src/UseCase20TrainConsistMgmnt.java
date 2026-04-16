public class TrainConsistApp {

    // Search method with validation
    static boolean searchBogie(String[] bogies, String key) {

        // Step 1: Fail-fast validation
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("Search not allowed: No bogies available in train consist");
        }

        // Step 2: Linear Search
        for (String id : bogies) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Case 1: Empty array (will throw exception)
        String[] bogiesEmpty = {};

        // Case 2: Valid data
        String[] bogies = {"BG101", "BG205", "BG309"};

        String searchKey1 = "BG205";
        String searchKey2 = "BG999";

        // -------------------------------
        // TEST 1: Exception case
        // -------------------------------
        try {
            System.out.println("Searching in empty dataset...");
            searchBogie(bogiesEmpty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n-----------------------\n");

        // -------------------------------
        // TEST 2: Valid search cases
        // -------------------------------
        try {
            System.out.println("Searching in valid dataset...");

            boolean found1 = searchBogie(bogies, searchKey1);
            System.out.println(searchKey1 + " Found? " + found1);

            boolean found2 = searchBogie(bogies, searchKey2);
            System.out.println(searchKey2 + " Found? " + found2);

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
