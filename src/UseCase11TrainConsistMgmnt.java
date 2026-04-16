import java.util.*;
import java.util.regex.*;

public class TrainConsistApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Step 2: Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Step 3: Compile patterns
        Pattern pTrain = Pattern.compile(trainPattern);
        Pattern pCargo = Pattern.compile(cargoPattern);

        // Step 4: Create matcher objects
        Matcher mTrain = pTrain.matcher(trainId);
        Matcher mCargo = pCargo.matcher(cargoCode);

        // Step 5: Validate using matches()
        boolean isTrainValid = mTrain.matches();
        boolean isCargoValid = mCargo.matches();

        // Step 6: Display results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        sc.close();
    }
}
