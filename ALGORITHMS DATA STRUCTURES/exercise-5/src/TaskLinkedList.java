class TaskNode {
    Task task;
    TaskNode next;

    public TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskLinkedList {
    private TaskNode head;

    // Add Task
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search Task by ID
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse Tasks
    public void traverseTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete Task by ID
    public void deleteTask(int taskId) {
        if (head == null) return;

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        Task t1 = new Task(1, "Task 1", "Pending");
        Task t2 = new Task(2, "Task 2", "In Progress");
        Task t3 = new Task(3, "Task 3", "Completed");

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        System.out.println("All tasks:");
        taskList.traverseTasks();

        System.out.println("Search for task with ID 2:");
        Task foundTask = taskList.searchTask(2);
        System.out.println(foundTask != null ? foundTask : "Task not found.");

        System.out.println("Delete task with ID 2:");
        taskList.deleteTask(2);

        System.out.println("All tasks after deletion:");
        taskList.traverseTasks();
    }
}
