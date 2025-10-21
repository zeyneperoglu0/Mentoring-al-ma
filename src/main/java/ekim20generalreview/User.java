package ekim20generalreview;

import java.util.ArrayList;
import java.util.List;

public class User implements IUser {

    int id;
    String name;
    List<Project> projects;

    User(int id, String name) {
        this.id=id;
        this.name=name;
        this.projects = new ArrayList<>();

    }


   public void addProject(Project project) {
        projects.add(project);
    }

 public    void removeProject(Project project) {
        projects.remove(project);
    }

    public List<Project> getProjects() {
        System.out.println(projects);
        return projects;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", projects=" + projects +
                '}';
    }
}