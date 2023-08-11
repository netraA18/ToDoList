import java.util.Scanner;

public class Task {
    private String taskDescription;
    private String taskName;
    private String taskDueDate;

    public Task(String taskName, String taskDescription, String taskDueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDueDate = taskDueDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(String taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    public void editTask(Scanner scanner) {
        System.out.print("a) Name, b) Description, c) Due date? Enter letter: ");
        String editLetter = scanner.nextLine();
        System.out.println();

        switch (editLetter.toLowerCase()) {
            case "a":
                System.out.print("Enter new name: ");
                this.taskName = scanner.nextLine();
                break;
            case "b":
                System.out.print("Enter new description: ");
                this.taskDescription = scanner.nextLine();
                break;
            case "c":
                System.out.print("Enter new due date: ");
                this.taskDueDate = scanner.nextLine();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
