package ekim20generalreview;

import java.util.ArrayList;
import java.util.List;

public class Project implements IProject {

 int id;
 String title ;
 List<Task> tasks ;

 Project (int id,String title){
this.id = id;
this.title = title;
this.tasks = new ArrayList<>();


    }
   public void removeTask (Task task){
tasks.remove(task);
if (tasks.isEmpty()){
    System.out.println("task boş");

}
    }

    public List<Task> getTasks(){
        System.out.println(tasks);
return tasks;    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
        if (task.equals(task)){
            System.out.println("task eklendi");
        }else {
            System.out.println("Task eklenemedi");
        }
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
