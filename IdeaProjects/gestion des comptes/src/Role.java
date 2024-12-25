import java.util.ArrayList;

public class Role {

Boolean admin = false;
String employee;
String client;

public Role() {


}

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getEmplyee() {
        return employee;
    }

    public void setEmplyee(String emplyee) {
        this.employee = emplyee;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

/*
administrateur
client
employees
 */
}

