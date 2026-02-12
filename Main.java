// Main class to test our whole Hospital System

public class Main {

    public static void main(String[] args) {

        // Create Hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create Department
        Department cardiology = new Department("Cardiology");

        // Create Room
        Room room101 = new Room(101);

        // Create Equipment
        MedicalEquipment mri = new MedicalEquipment("MRI Machine");

        // Create Parts
        Part battery = new Part("Battery");
        Part screen = new Part("Display Screen");

        // Add parts to equipment
        mri.addPart(battery);
        mri.addPart(screen);

        // Add equipment to room
        room101.addEquipment(mri);

        // Add room to department
        cardiology.addRoom(room101);

        // Add department to hospital
        hospital.addDepartment(cardiology);

        // Show hospital details
        hospital.showHospitalDetails();
    }
}
