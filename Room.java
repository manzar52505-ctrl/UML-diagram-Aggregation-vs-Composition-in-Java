// Room class represents hospital rooms
// Room HAS medical equipment (Composition)

import java.util.ArrayList;
import java.util.List;

public class Room {

    private int roomNumber;                  // Room number
    private List<MedicalEquipment> equipments;  // Equipment inside room

    // Constructor
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.equipments = new ArrayList<>();
    }

    // Method to add equipment in room
    public void addEquipment(MedicalEquipment equipment) {
        equipments.add(equipment);
    }
}

