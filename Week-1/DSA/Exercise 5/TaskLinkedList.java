public class TaskLinkedList {
    private static class Node {
        Task data;
        Node next;

        Node(Task data) {
            this.data = data;
        }
    }

    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.taskId == taskId) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public boolean deleteTask(int taskId) {
        if (head == null) {
            return false;
        }

        if (head.data.taskId == taskId) {
            head = head.next;
            return true;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.data.taskId == taskId) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
}
