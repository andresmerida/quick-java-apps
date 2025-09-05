package core;
import java.util.List;


public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<User> users = List.of(
            new Patient("p001", "Albert", 30, "Fever"),
            new Patient("p002", "Mary", 45, "Fracture"),
            new Staff("s001", "Dr. Smith", "Physician"),
            new Staff("s002", "Nina", "Nurse")
        );

        // Sample services including EHR and Inventory

        List<Service> services = List.of(
            new Appointment("p001", "Dr. Smith", "2025-04-08"),
            new Billing("p002", 900.0, "pending"),
            new Report("p002", "Healing as expected"),
            new EHR("p001", List.of("Diabetes", "Allergy to penicillin"), List.of("Paracetamol", "Vitamin D")),
            new Inventory("Paracetamol", 150, "Medicine"),
            new Inventory("Syringe", 300, "Equipment")
        );

        // Display users
        System.out.println("=== User Info ===");
        users.forEach(HospitalManagementSystem::);
    }
}
