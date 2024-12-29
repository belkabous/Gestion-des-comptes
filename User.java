import java.util.ArrayList;

public class User extends Person {
    Role role;
    String email;
    String mdp;


    @Override
    public String toString() {
        return "User{" +
                "role=" + role.getRole() +
                ", email='" + email + '\'' +
                ", mdp='" + mdp + '\'' +
                ", id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String id, String nom, int age, String email, String mdp, Role role) {

        super(id, nom, age);
        this.role = role;
        this.email = email;
        this.mdp = mdp;
    }

}
