import java.util.*;
import java.util.stream.*;

// GoodsBogie class
class GoodsBogie {
    String type;   // Cylindrical, Rectangular, etc.
    String cargo;  // Petroleum, Coal, Grain, etc.

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    void display() {
        System.out.println(type + " - Cargo: " + cargo);
    }
}

// Main class
public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> goodsList = new ArrayList<>();

        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Rectangular", "Coal"));
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Rectangular", "Grain"));

        // Step 2: Safety validation using allMatch()
        boolean isSafe = goodsList.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                        b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        System.out.println("Goods Bogie Details:\n");
        goodsList.forEach(GoodsBogie::display);

        System.out.println("\nSafety Compliance Status: " +
                (isSafe ? "SAFE ✅" : "UNSAFE ❌"));
    }
}
