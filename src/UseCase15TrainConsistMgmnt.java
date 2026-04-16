import java.util.*;

// Step 1: Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Step 2: GoodsBogie Class
class GoodsBogie {
    String type;   // Cylindrical / Rectangular
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    void assignCargo(String cargo) {
        try {
            // Step 3: Validation Rule
            if (type.equalsIgnoreCase("Rectangular") &&
                cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                    "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                );
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            // Step 4: Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Step 5: Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    void display() {
        System.out.println(type + " - Cargo: " + (cargo != null ? cargo : "None"));
    }
}

// Step 6: Main Class
public class TrainConsistApp {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Another safe assignment
        b2.assignCargo("Coal");

        // Display final status
        System.out.println("Final Bogie Status:\n");
        b1.display();
        b2.display();
    }
}
