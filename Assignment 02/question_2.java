package com.sunbeam;

class Employee {
    int id;
    double salary;  
    
   
    public Employee() {}
    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", salary=" + salary + "]";
    }
}

public class question_2 {

    
    public static void sortBySalary(Employee[] e, int N) {
       
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                
                if (e[j+1].getSalary() <e[j].getSalary()) {
                    
                    Employee temp = e[j];
                    e[j] = e[j + 1];
                    e[j + 1] = temp;
                }
            }
        }
    }

    
    public static void main(String[] args) {
        
        Employee[] employees = {
            new Employee(12, 50000),
            new Employee(20, 1000),
            new Employee(20, 75000),
           
        };

        System.out.println("Before Sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

       
        sortBySalary(employees, employees.length);

        System.out.println("\nAfter Sorting by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
