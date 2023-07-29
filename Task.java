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

    
    

    // public Task(String taskName, String taskDescription, String taskDueDate) {
    //     this.taskName = taskName;
    //     this.taskDescription = taskDescription;
    //     this.taskDueDate = taskDueDate;
    //     this.taskStatus = "Incomplete";
    // }

    public void addTask() {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("How many tasks? ");
        
        String taskNumb = scanner.nextLine();
        

        numbOfTask = Integer.parseInt(taskNumb);
        int i;
        System.out.println();
        for (i = 1; i <= numbOfTask; i++) {
            System.out.print("Enter task " + i + " name: ");
            this.taskName = scanner.nextLine(); //taskName stores it 
            // System.out.println(taskName);
            allTasks.add(taskName);

            System.out.print("Enter task " + i + " description: ");
            this.taskDescription = scanner.nextLine();
            allTasks.add(taskDescription);

            System.out.print("Enter task " + i + " due date: ");
            this.taskDueDate = scanner.nextLine();
            allTasks.add(taskDueDate);

            
            System.out.println();

        }

        
        Scanner chooseNumb = new Scanner(System.in);
        String numb;
        System.out.print("Enter a number or press 0 to go to home page: ");
        numb = chooseNumb.nextLine();
        System.out.println();
        int numbChoice = Integer.parseInt(numb);
        scanner.close();

    
        int n = allTasks.size();


        if (numbChoice == 2) {
            int taskCount = 1;
            for (int j = 0; j < n; j++) {
                if (n == 3) {
                    System.out.println(allTasks);
                    break;
                } else if (n > 3) {
                    List<String> selectedList = allTasks.subList(j, j + 3);
                    j+=2;
                    System.out.println("Task " +  taskCount + ": \n" + selectedList);
                    System.out.println();
                    taskCount++;
                }

            }
            // System.out.println(allTasks);
            
        }
        if (numbChoice == 0) {
            System.out.println("--ToDo List--\n");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Edit Task\n");
        }




        
    }




   

    
}
