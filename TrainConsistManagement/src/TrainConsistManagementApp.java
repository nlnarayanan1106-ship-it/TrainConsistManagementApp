import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC2 - Add Passenger Bogies to Train");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After Removing AC Chair:");
        System.out.println(passengerBogies);

        System.out.println("Checking Sleeper exists:");
        System.out.println(passengerBogies.contains("Sleeper"));

        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);
    }
}