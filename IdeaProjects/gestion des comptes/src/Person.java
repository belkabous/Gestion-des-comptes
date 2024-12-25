public class Person {

    String id;
    String nom;
    int age;
    String email;
    String mdp;

    public Person(String id, String nom, int age, String email, String mdp){
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.email = email;
        this.mdp = mdp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

   @Override
    public String toString() {
       return "Person{" +
               "id='" + id + '\'' +
               ",nom='" + nom + '\'' +
               ",age='" + age + '\'' +
               ",email='" + email + '\'' +
               ",mdp='" + mdp + '\'' +
               '}';
   }
}


