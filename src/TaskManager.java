import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskManager {
    private List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task){
        tasks.add(task);
    }

    public void markTaskAsCompleted(int index){
        String task = tasks.get(index);
        System.out.println("Completada " + task);
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public void printTaskList(){
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }

    public boolean isTaskInList(String task){
        return tasks.contains(task);
    }

    public int sizeTasks(){
        return tasks.size();
    }

    public void sortTasks(){
        Collections.sort(tasks);
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasks=" + tasks +
                '}';
    }
}
