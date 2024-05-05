import java.util.*;

public class Main {
    public static void main(String[] args) {

        TaskManager tasks = new TaskManager();

        tasks.addTask("Hacer la compra");
        tasks.addTask("reparar la pc");
        tasks.addTask("terminar la tarea del trabajo");
        tasks.addTask("completar subite");
        tasks.addTask("estudiar comunicacion");

        tasks.markTaskAsCompleted(2);
        tasks.removeTask(2);
        tasks.printTaskList();
        Boolean containsTask = tasks.isTaskInList("Hacer la compra");
        if(tasks.sizeTasks() == 0){
            System.out.println("La lista esta vacia");
        }
        tasks.sortTasks();
        String arrayTasks = tasks.toString();
    }
}