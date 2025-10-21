package ekim20generalreview;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    List<User> users;
    UserService() {
        this.users = new ArrayList<>();
    }


   public void  addUser(User user){
     users.add(user);
if (users.contains(user)){
    System.out.println("var");
} else   {
    System.out.println("yok");
}
   }

public void removeUser(User user){
    users.remove(user);
     if (users.isEmpty()){
         System.out.println("boş liste");
     }

       }


//   public  User getUserById(int id){
//if (id==users.indexOf(id)){
//    System.out.println("Doğru kullanıcı ");
//}
//  return ; }

















}
