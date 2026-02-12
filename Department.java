// Department class represents different departments like Cardiology, Neurology
// A department HAS rooms (Composition)

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;          // Name of department
    private List<Room> rooms;     // Rooms inside department

    // Constructor
    public Department(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    // Getter method to return department name
    public String getName() {
        return name;
    }

    // Method to add room in department
    public void addRoom(Room room) {
        rooms.add(room);
    }
}
