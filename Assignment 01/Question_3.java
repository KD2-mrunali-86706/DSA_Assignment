package assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
    int empid;
    String name;

    public Employee() {}

    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + "]";
    }

    // Linear search for empId
    public static int linearSearch(Employee[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getEmpid() == key) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Linear search for name
    public static int linearSearch(Employee[] arr, String key) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].getName().equalsIgnoreCase(key)) {
                return j; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(1, "Mru");
        employees[1] = new Employee(10, "Mrunali");
        employees[2] = new Employee(18, "Shivu");
        employees[3] = new Employee(19, "Neha");
        employees[4] = new Employee(5, "Ravi");

        // Sort by empId
        Arrays.sort(employees, Comparator.comparingInt(Employee::getEmpid));
        System.out.println("Sorted array by empId: " + Arrays.toString(employees));

        // Search by empId
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = sc.nextInt();
        int index = Employee.linearSearch(employees, id);
        if (index != -1) {
            System.out.println("Employee with empid " + id + " found at index: " + index);
        } else {
            System.out.println("Employee with empid " + id + " not found.");
        }

        // Sort by name
        Arrays.sort(employees, (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        System.out.println("Sorted array by name: " + Arrays.toString(employees));

        // Search by name
        System.out.println("Enter name:");
        sc.nextLine(); // Consume newline
        String n = sc.nextLine();
        int indexn = Employee.linearSearch(employees, n);
        if (indexn != -1) {
            System.out.println("Employee with name " + n + " found at index: " + indexn);
        } else {
            System.out.println("Employee with name " + n + " not found.");
        }

        sc.close(); // Close the scanner
    }
}
