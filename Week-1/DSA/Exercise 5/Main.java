public class Main {
    public static void main(String[] args) {
        System.out.println("Types of linked lists:");
        System.out.println("- Singly Linked List: each node points to next node.");
        System.out.println("- Doubly Linked List: each node points to previous and next node.\n");

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design UI", "Pending"));
        taskList.addTask(new Task(2, "Write API", "In Progress"));
        taskList.addTask(new Task(3, "Test Module", "Pending"));

        System.out.println("Traverse tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearch taskId 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Not found");

        System.out.println("\nDelete taskId 2:");
        System.out.println(taskList.deleteTask(2) ? "Deleted" : "Not found");

        System.out.println("\nTraverse after deletion:");
        taskList.traverseTasks();

        System.out.println("\nTime complexity:");
        System.out.println("Add: O(n) (at end in singly list)");
        System.out.println("Search: O(n)");
        System.out.println("Traverse: O(n)");
        System.out.println("Delete: O(n)");

        System.out.println("\nAdvantages over arrays for dynamic data:");
        System.out.println("- Dynamic size");
        System.out.println("- Easy insertion/deletion without shifting all elements");
    }
}
