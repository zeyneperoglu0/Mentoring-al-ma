package ekim20generalreview;

public class TaskService {

   public Task createTask(int id, String description){
return new Task(id, description);
   }


  public  void  markTaskDone(Task task){
task.markAsDone();
      System.out.println("görev tamamlandı" + task.getDescription());
}

  }





