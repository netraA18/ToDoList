import java.util.Scanner;


public class Main {

    public static void homePage() {
            System.out.println("--ToDo List--\n");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Edit Task\n");

        }
    
    public static void main(String[] args) {
        Task task = new Task();
        // task.displayTask();
        homePage();
        
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numb = scanner.nextLine();
        
        int numbChoice = Integer.parseInt(numb);

        if (numbChoice == 1) {
            task.addTask();
        }

        
        while (numbChoice != 0) {
            numbChoice = task.ask_Numb();

            
            if (numbChoice == 2) {
                task.viewallTasks();
            }

            if (numbChoice == 0) {
                homePage();
            }

            if (numbChoice == 1) {
            task.addTask();
        }

            if (numbChoice == 3) {
                task.editTasks();
            }
        }
        scanner.close();
        
    }
}
