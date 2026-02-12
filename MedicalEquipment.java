// MedicalEquipment class represents machines like X-ray, MRI
// Equipment HAS parts (Composition)

import java.util.ArrayList;
import java.util.List;

public class MedicalEquipment {

    private String equipmentName;   // Name of equipment
    private List<Part> parts;       // Parts inside equipment

    // Constructor
    public MedicalEquipment(String equipmentName) {
        this.equipmentName = equipmentName;
        this.parts = new ArrayList<>();
    }

    // Method to add part
    public void addPart(Part part) {
        parts.add(part);
    }
}
