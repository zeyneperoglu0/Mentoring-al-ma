package ekim20generalreview;

public class Main {

    public static void main(String[] args) {


  UserService u = new UserService();
        User use = new User(12,"Ali");
        u.addUser(use);


        ProjectService p = new ProjectService();
    Project project1 =   p.createProject(12,"Ödev Çalışmaları");
        Project project2 = p.createProject(12,"Ev işleri");

        TaskService taskService = new TaskService();
   Task t1 = taskService.createTask(12," ödev yap");
        Task t2 = taskService.createTask(13," ev işlerini yap");
project1.addTask(t1);
project2.addTask(t2);



User user = new User(12,"Ali");
user.addProject(project1);
user.addProject(project2);


taskService.markTaskDone(t1);
taskService.markTaskDone(t2);

        for (Project pr : user.getProjects()) {
            System.out.println("Proje: " + pr.title);
            for (Task task : pr.getTasks()) {
                System.out.println("  Görev: " + task.getDescription() + " | Tamamlandı mı? " + task.isDone());
            }
        }














    }
}
