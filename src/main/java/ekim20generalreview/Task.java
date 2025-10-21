package ekim20generalreview;

public class Task implements  ITask{

 int id ;
 String description ;
 boolean done ;

 Task(int id,String description){
this.id = id;
this.description=description;
this.done = false;
 }

  public   void markAsDone(){
done= true;
    }

  public   boolean isDone(){
        System.out.println(done);
    return done;}


   public String getDescription(){
        System.out.println(description);
return description;   }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
