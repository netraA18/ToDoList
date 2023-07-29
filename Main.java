import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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
        
        // static void homePage() {
        //     System.out.println("--ToDo List--\n");
        //     System.out.println("1. Add Task");
        //     System.out.println("2. View All Tasks");
        //     System.out.println("3. Edit Task\n");

        // }
        
      
        
        Scanner chooseNumb = new Scanner(System.in);
        String numb;
        System.out.print("Enter a number: ");
        numb = chooseNumb.nextLine();
        
        int numbChoice = Integer.parseInt(numb);

        
        if (numbChoice == 1) {
            task.addTask();
    
        }
        // if(numbChoice == 2) {
        //     task.viewTasks();
        // }

       
        

        

        

        
        
        



        

        
    }
}
