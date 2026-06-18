public class Main {
    public static void main(String[] args) {
        System.out.println("Array memory representation:");
        System.out.println("- Arrays store elements in contiguous memory blocks.");
        System.out.println("- Each element is accessed by index in O(1) time.");
        System.out.println("Advantages: fast index access, simple structure, low overhead.\n");

        EmployeeManagerArray manager = new EmployeeManagerArray(5);

        manager.addEmployee(new Employee(101, "Ananya", "Developer", 70000));
        manager.addEmployee(new Employee(102, "Rohit", "Tester", 55000));
        manager.addEmployee(new Employee(103, "Meera", "Manager", 90000));

        System.out.println("Traverse employees:");
        manager.traverseEmployees();

        System.out.println("\nSearch employeeId 102:");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? found : "Not found");

        System.out.println("\nDelete employeeId 102:");
        System.out.println(manager.deleteEmployee(102) ? "Deleted" : "Not found");

        System.out.println("\nTraverse after deletion:");
        manager.traverseEmployees();

        System.out.println("\nTime complexity:");
        System.out.println("Add: O(1) when space is available");
        System.out.println("Search: O(n)");
        System.out.println("Traverse: O(n)");
        System.out.println("Delete: O(n) due to shifting");

        System.out.println("\nLimitations of arrays:");
        System.out.println("- Fixed size");
        System.out.println("- Insert/delete in middle is costly");
        System.out.println("Use arrays when size is known and fast index access is needed.");
    }
}
