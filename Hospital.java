// Hospital class represents the main hospital
// A hospital HAS departments (Composition relationship)

import java.util.ArrayList;   // We use ArrayList to store multiple departments
import java.util.List;

public class Hospital {

    // Name of the hospital
    private String name;

    // List to store departments inside the hospital
    private List<Department> departments;

    // Constructor → This runs when we create a Hospital object
    public Hospital(String name) {
        this.name = name;

        // We initialize the list so we can add departments later
        this.departments = new ArrayList<>();
    }

    // Method to add a department into the hospital
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to display hospital information
    public void showHospitalDetails() {
        System.out.println("Hospital Name: " + name);

        // Loop through all departments and print them
        for (Department d : departments) {
            System.out.println("Department: " + d.getName());
        }
    }
}
