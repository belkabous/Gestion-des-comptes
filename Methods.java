import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Person> personnes = new ArrayList<>();


    public void add() {
        System.out.print(" enter l' id d'utilisateur : ");
        String id = sc.nextLine();
        sc.nextLine();
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
        String role = "";
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                role = "admin";
                break;
            case 2:
                role = "employee";
                break;
            case 3:
                role = "client";
                break;

            default:
                System.out.println("Invalid choice");
                break;

        }
        Role roles = new Role(role);
        personnes.add(new User(id, nom, age, email, mdp, roles));
    }


    public void display() {
        for (int i = 0; i < personnes.size(); i++) {
            System.out.println(personnes.get(i).toString());
        }
        if (personnes.size() == 0) {
            System.out.println("la liste est vide\n");
        }
    }


    void search() {
        System.out.print("Enter le nom: ");
        String searchNom = sc.nextLine();
        for (Person person : personnes) {
            if (person.getNom().equalsIgnoreCase(searchNom)) {
                System.out.println(person);
                return;
            }
        }
        System.out.printf("%s introuvable\n", searchNom);
    }


    void delete() {
        System.out.print("Entrer le nom d'utilisateur : ");
        String searchNom = sc.nextLine();
        for (Person person : personnes) {
            if (person.getNom().equalsIgnoreCase(searchNom)) {
                personnes.remove(person);
                System.out.println("l'utilisateur supprimer avec succes");
                return;
            }
        }
        System.out.printf("%s introuvable\n", searchNom);
    }


    void update() {
        System.out.print("Enter name of the user you want to update: ");
        String searchNom = sc.nextLine();
        for (Person person : personnes) {
            if (person.getNom().equalsIgnoreCase(searchNom)) {
                System.out.println("1. Update name" + "\n" + "2. Update age" + "3. Update email" + "\n" + "4. Update password" + "5. Update role" + "\n" + "6. Update phone number");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("enter new name: ");
                        person.setNom(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("enter new age: ");
                        person.setAge(sc.nextInt());
                        break;
                    /*
                    case 3:
                        System.out.print("enter new Email: ");
                        person.setEmail(sc.nextLine());
                        break;
                    case 4:
                        System.out.print("enter new Password: ");
                        person.setMdp(sc.nextLine());
                        break;
                    case 5:
                        System.out.print("enter new role: ");
                        userRole.setRole(sc.nextLine());
                        break;
                     */
                    default:
                        System.out.println("invalid choice");
                }
            }
        }
    }
}