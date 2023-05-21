import java.util.Comparator;
import java.util.TreeMap;

public class SortKeysInTreeMapHavingStaticInputs {
    static public class Employee {
        private int employeeId;
        private String employeeName;
        private int employeeSalary;

        public Employee(int employeeId, String employeeName, int employeeSalary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.employeeSalary = employeeSalary;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public int getEmployeeSalary() {
            return employeeSalary;
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John", 5000);
        Employee emp2 = new Employee(102, "Mary", 6000);
        Employee emp3 = new Employee(103, "Bob", 5500);
        Employee emp4 = new Employee(104, "Alice", 4500);

        TreeMap<Employee,String> employeeTreeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmployeeSalary() - emp2.getEmployeeSalary();
            }
        });

        employeeTreeMap.put(emp1, "Employee 1");
        employeeTreeMap.put(emp2, "Employee 2");
        employeeTreeMap.put(emp3, "Employee 3");
        employeeTreeMap.put(emp4, "Employee 4");

        for (Employee emp : employeeTreeMap.keySet()) {
            System.out.println(emp.getEmployeeName() + " - " + emp.getEmployeeSalary() + " - " + employeeTreeMap.get(emp));
        }
    }

}
