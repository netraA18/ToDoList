import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task {
    public String taskName;
    public String taskDescription;
    public String taskDueDate;
    public String taskStatus;
    public int numbOfTask;
    ArrayList<String> allTasks = new ArrayList<String>();
    public int numbChoice; 
    Scanner scanner = new Scanner(System.in);

    public void addTask() {

        System.out.println();
        System.out.print("How many tasks? ");
        String taskNumb = scanner.nextLine();
        numbOfTask = Integer.parseInt(taskNumb);
        int i;
        System.out.println();

        for (i = 1; i <= numbOfTask; i++) {
            System.out.print("Enter task " + i + " name: ");
            this.taskName = scanner.nextLine();
            allTasks.add(taskName);

            System.out.print("Enter task " + i + " description: ");
            this.taskDescription = scanner.nextLine();
            allTasks.add(taskDescription);

            System.out.print("Enter task " + i + " due date: ");
            this.taskDueDate = scanner.nextLine();
            allTasks.add(taskDueDate);

            System.out.println();
        }

    }

    public int ask_Numb() {
        System.out.print("Enter a number or press 0 to go to home page: ");
        String numb = scanner.nextLine();
        System.out.println();
        numbChoice = Integer.parseInt(numb);
        // scanner.close();

        return numbChoice;
    }

    public void viewallTasks() {
        int n = allTasks.size();

        int taskCount = 1;
        for (int j = 0; j < n; j++) {
            if (n == 3) {
                System.out.println(allTasks);
                break;
            } else if (n > 3) {
                List<String> selectedList = allTasks.subList(j, j + 3);
                j += 2;
                System.out.println("Task " + taskCount + ": \n" + selectedList);
                System.out.println();
                taskCount++;
            }
        }

    }

    public void changeTasks() {
        int n = allTasks.size();

        int taskCount = 1;
        for (int j = 0; j < n; j += 3) {
            List<String> selectedList = allTasks.subList(j, Math.min(j + 3, n));
            System.out.println("Task " + taskCount + ": \n" + selectedList);

            
            System.out.print("Do you want to edit this task? ");
            String taskNumb = scanner.nextLine();
            System.out.println();
            if (taskNumb.equals("yes")) {
                editSingleTask(selectedList);
            }

            System.out.println();
            taskCount++;
        }
    }

    private void editSingleTask(List<String> selectedList) { //private limits it to the task class 
        
        System.out.print("a) Name, b) description, or c) due date? enter letter: ");
        String editLetter = scanner.nextLine();
        System.out.println();

        switch (editLetter) { //pass in editLetter as the parameter -- compares it to this
            case "a":
                System.out.print("Enter name: ");
                this.taskName = scanner.nextLine();
                selectedList.set(0, this.taskName);
                break; 
            case "b":
                System.out.print("Enter description: ");
                this.taskDescription = scanner.nextLine();
                selectedList.set(1, this.taskDescription);
                break;
            case "c":
                System.out.print("Enter due date: ");
                this.taskDueDate = scanner.nextLine();
                selectedList.set(2, this.taskDueDate);
                break;
            
        }
    }

    public void editTasks() {
        changeTasks();
    }
}