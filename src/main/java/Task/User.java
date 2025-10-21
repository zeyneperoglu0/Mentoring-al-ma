package Task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {

private String name ;
private LocalDateTime registerDate;

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}
