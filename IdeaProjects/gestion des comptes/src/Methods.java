import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

static Scanner sc = new Scanner(System.in);
static ArrayList<Person> personnes = new ArrayList<>();


    public  void add(){

        System.out.print(" enter l' id d'utilisateur : ");
        String id = sc.nextLine();
        System.out.print(" enter l' nom d'utilisateur : ");
        String nom = sc.nextLine();
        System.out.print(" enter age de l'utilisateur : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print(" eneter l'email d'utilisateur : ");
        String email = sc.nextLine();
        System.out.print(" enter le mot de passe d'utilisateur : ");
        String mdp = sc.nextLine();
        System.out.println("1-administrateur\n2-employee\n3-client");
        Role roles = new Role();
        int choix = sc.nextInt();
        switch(choix){
            case 1:
                boolean admin = true;
                roles.setAdmin(admin);
                break;

        }
        personnes.add(new Person(id, nom, age, email, mdp));


    }

    public void display(){

        for (Person person : personnes) {
            System.out.println(person);
            Role roles = new Role();

            if (roles.getAdmin()) {
                System.out.println("administrateur");
            }
        }

    }










    /*
    ajout
    modification
    suppression
    recherche
    affichage des role associe
     */
}
