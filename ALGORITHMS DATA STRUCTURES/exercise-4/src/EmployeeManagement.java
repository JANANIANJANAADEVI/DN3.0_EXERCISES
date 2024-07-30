public class EmployeeManagement {
    private Employee[] employees;
    private int size;
    private int capacity;

    // Constructor
    public EmployeeManagement(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {
        if (size < capacity) {
            employees[size] = employee;
            size++;
        } else {
            System.out.println("Employee list is full. Cannot add more employees.");
        }
    }

    // Search Employee by ID
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse Employees
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee by ID
    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[size - 1] = null;
            size--;
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement(5);
        Employee e1 = new Employee(1, "Alice", "Manager", 70000);
        Employee e2 = new Employee(2, "Bob", "Developer", 50000);
        Employee e3 = new Employee(3, "Charlie", "Designer", 60000);

        em.addEmployee(e1);
        em.addEmployee(e2);
        em.addEmployee(e3);

        System.out.println("All employees:");
        em.traverseEmployees();

        System.out.println("Search for employee with ID 2:");
        Employee foundEmployee = em.searchEmployee(2);
        System.out.println(foundEmployee != null ? foundEmployee : "Employee not found.");

        System.out.println("Delete employee with ID 2:");
        em.deleteEmployee(2);

        System.out.println("All employees after deletion:");
        em.traverseEmployees();
    }
}
