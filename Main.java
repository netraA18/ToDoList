import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static int numbOfTask; //number of tasks the user wants to add

    public static void homePage() {
        System.out.println("--ToDo List--\n");
        System.out.println("1. Add Task");
        System.out.println("2. View All Tasks");
        System.out.println("3. Edit Task\n");

        }



    public static void addTask(Scanner scanner, List<Task> allTasks) {
        System.out.println();
        System.out.print("How many tasks? ");
        String taskNumb = scanner.nextLine();
        numbOfTask = Integer.parseInt(taskNumb);
    
        System.out.println();
    
        for (int i = 1; i <= numbOfTask; i++) {
            System.out.print("Enter task " + i + " name: ");
            String taskName = scanner.nextLine(); //sets the input to the variable taskName
    
            System.out.print("Enter task " + i + " description: ");
            String taskDescription = scanner.nextLine();
    
            System.out.print("Enter task " + i + " due date: ");
            String taskDueDate = scanner.nextLine();
    
            Task newTask = new Task(taskName, taskDescription, taskDueDate); 
            allTasks.add(newTask);
    
            System.out.println();
        }
    }

    
    public static void viewAllTasks(List<Task> allTasks) {
        int taskCount = 1;

        for (Task task : allTasks) { //for all task in the class Task, iterate through the arrayList
            System.out.println("Task " + taskCount + ": ");
            System.out.println("Name: " + task.getTaskName());
            System.out.println("Description: " + task.getTaskDescription());
            System.out.println("Due Date: " + task.getTaskDueDate());
            System.out.println();
            taskCount++;
        }
    }

    public void editTask(Scanner scanner) {
        System.out.print("a) Name, b) Description, c) Due date? Enter letter: ");
        String editLetter = scanner.nextLine();
        System.out.println();

        switch (editLetter.toLowerCase()) {
            case "a":
                System.out.print("Enter new name: ");
                String taskName = scanner.nextLine();
                break;
            case "b":
                System.out.print("Enter new description: ");
                String taskDescription = scanner.nextLine();
                break;
            case "c":
                System.out.print("Enter new due date: ");
                String taskDueDate = scanner.nextLine();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    
    
    public static void main(String[] args) {
        List<Task> allTasks = new ArrayList<>();

        homePage();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numbChoice = Integer.parseInt(scanner.nextLine());

        Task taskToEdit = null; //temporarily store a reference to a task

        while (numbChoice != 0) {
            switch (numbChoice) {
                case 1:
                    addTask(scanner, allTasks);
                    break;
                case 2:
                    viewAllTasks(allTasks);
                    break;
                case 3:
                    taskToEdit.editTask(scanner); 
                    break;
            }

            

            System.out.print("Enter a number: ");
            numbChoice = Integer.parseInt(scanner.nextLine());

            if (numbChoice == 3) {
                System.out.print("Enter the task number to edit: ");
                int taskNumberToEdit = Integer.parseInt(scanner.nextLine());

                if (taskNumberToEdit >= 1 && taskNumberToEdit <= allTasks.size()) {
                    taskToEdit = allTasks.get(taskNumberToEdit - 1); //to get the correct task 
                } else {
                    System.out.println("Invalid task number.");
                    taskToEdit = null; 
                }
            }
        }

        scanner.close();
    }

}