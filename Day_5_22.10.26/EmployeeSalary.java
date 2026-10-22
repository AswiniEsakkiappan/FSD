package Day_5;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e;

	        e = new PermanentEmployee(101, "Aswini", 20000);

	        System.out.println("Employee ID: " + e.employeeId);
	        System.out.println("Employee Name: " + e.name);
	        System.out.println("Basic Salary: " + e.basicSalary);
	        System.out.println("Total Salary: " + e.calculateSalary());

	        System.out.println();

	        e = new ContractEmployee(102, "Arun", 15000);

	        System.out.println("Employee ID: " + e.employeeId);
	        System.out.println("Employee Name: " + e.name);
	        System.out.println("Basic Salary: " + e.basicSalary);
	        System.out.println("Total Salary: " + e.calculateSalary());

	}

}

class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee() {
    }

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }
}

class PermanentEmployee extends Employee {

    PermanentEmployee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

   
    double calculateSalary() {
        return basicSalary + (basicSalary * 20 / 100);
    }
}

class ContractEmployee extends Employee {

    ContractEmployee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    
    double calculateSalary() {
        return basicSalary + 2000;
    }
}
