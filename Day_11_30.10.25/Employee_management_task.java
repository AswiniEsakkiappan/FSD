package Day_11;
import java.util.*;

class Employee {
    int id;
    String name;
    int deptId;
    double salary;

    Employee(int id, String name, int deptId, double salary) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
        this.salary = salary;
    }

    void display(HashMap<Integer, String> departments) {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + departments.get(deptId));
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

public class Employee_management_task {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        HashMap<Integer, String> departments = new HashMap<>();

        // Adding departments

        departments.put(1, "HR");
        departments.put(2, "IT");
        departments.put(3, "Finance");

        // Adding employees

        employees.add(new Employee(101, "Aswini", 2, 50000));
        employees.add(new Employee(102, "Priya", 1, 35000));
        employees.add(new Employee(103, "Ram", 2, 60000));
        employees.add(new Employee(104, "Kavi", 3, 45000));
        employees.add(new Employee(105, "Anu", 1, 40000));

        // Display all employees

        System.out.println("ALL EMPLOYEE DETAILS");

        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            Employee e = it.next();
            e.display(departments);
        }

        // Search employee using ID

        System.out.println("SEARCH EMPLOYEE");

        int searchId = 103;
        boolean found = false;

        for (Employee e : employees) {
            if (e.id == searchId) {
                e.display(departments);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }

        // Remove employee using ID

        System.out.println("REMOVE EMPLOYEE");

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();

            if (e.id == 104) {
                itr.remove();
                System.out.println("Employee " + e.name + " deleted successfully");
                break;
            }
        }

        // Department-wise employees

        System.out.println("\nDEPARTMENT-WISE EMPLOYEES");

        for (Integer dept : departments.keySet()) {

            System.out.println("\nDepartment: " + departments.get(dept));

            for (Employee e : employees) {
                if (e.deptId == dept) {
                    System.out.println(e.name + " - " + e.salary);
                }
            }
        }

        // Check department using containsKey()

        System.out.println("\nDEPARTMENT CHECK");

        if (departments.containsKey(2)) {
            System.out.println("Department ID 2 exists: " + departments.get(2));
        } else {
            System.out.println("Department not found");
        }

        // Sort employees by salary (Ascending)

        Collections.sort(employees, new Comparator<Employee>() {

            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });

        System.out.println("\nEMPLOYEES SORTED BY SALARY");

        for (Employee e : employees) {
            e.display(departments);
        }

        // Find highest-paid employee

        Employee highest = Collections.max(employees,
            Comparator.comparingDouble(e -> e.salary));

        System.out.println("HIGHEST PAID EMPLOYEE");

        highest.display(departments);
    }
}
