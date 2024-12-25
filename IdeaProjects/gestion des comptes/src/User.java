import java.util.ArrayList;

public class User extends Person {
    Role role;

    public User(String id, String nom, int age, String email, String mdp, Role role) {

        super(id, nom, age, email, mdp);
        this.role = role;
    }
}
