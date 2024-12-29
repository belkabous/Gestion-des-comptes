import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static void menu(){
        System.out.println("1-ajouter un utilisateur \n" +
                "2-afficher un utilisateur \n"
        + "3-rechercher  un utilisateur \n"
        + "4-supprimer  un utilisateur \n"
        + "5-modification un utilisateur \n");
        System.out.println("choisir une option : ");
    }

    public static void main(String[] args) {

        Methods methods = new Methods();

        int choice ;
        while (true){
            menu();

            choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                    case 1:
                        methods.add();
                        break;
                    case 2:
                        methods.display();
                        break;
                    case 3:
                        methods.search();
                        break;
                    case 4:
                        methods.delete();
                        break;
                    case 5:
                        methods.update();
                        break;
            }
        }
    }
}
