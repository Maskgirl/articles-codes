import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class SortKeysInTreeMapHavingDynamicInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Employee, String> employeeTreeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmployeeSalary() - emp2.getEmployeeSalary();
            }
        });

        System.out.println("Enter the number of employees: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for employee " + (i + 1) + ":");
            System.out.println("Employee ID: ");
            int employeeId = scanner.nextInt();
            System.out.println("Employee Name: ");
            String employeeName = scanner.next();
            System.out.println("Employee Salary: ");
            int employeeSalary = scanner.nextInt();

            Employee employee = new Employee(employeeId, employeeName, employeeSalary);
            employeeTreeMap.put(employee, employeeName);
        }

        for (Employee emp : employeeTreeMap.keySet()) {
            System.out.println(emp.getEmployeeName() + " - " + emp.getEmployeeSalary() + " - " + employeeTreeMap.get(emp));
        }
    }


}
