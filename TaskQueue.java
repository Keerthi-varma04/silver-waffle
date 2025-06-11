import java.util.ArrayList;
import java.util.Scanner;
public class TaskQueue {
    private ArrayList<String> queue = new ArrayList<>();
    public void addTask(String task) {
        queue.add(task);
    }
    public String completeTask() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }
    public String nextTask() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.get(0);
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public static void main(String[] args) {
        TaskQueue tq = new TaskQueue();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter task " + (i + 1) + ": ");
            String task = sc.nextLine();
            tq.addTask(task);
        }
        while (!tq.isEmpty()) {
            System.out.println("\nCurrent task: " + tq.nextTask());
            System.out.print("Mark this task as complete? (yes/no): ");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("Completed: " + tq.completeTask());
            } else {
                System.out.println("Task not completed. Exiting...");
                break;
            }
        }

        if (tq.isEmpty()) {
            System.out.println("All tasks completed!");
        } else {
            System.out.println("Remaining tasks in queue:");
            while (!tq.isEmpty()) {
                System.out.println(tq.completeTask());
            }
        }
        sc.close();
    }
}