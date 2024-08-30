import java.util.*;
import java.util.function.Predicate;

public class Main {

    static Scanner scan = new Scanner(System.in);


    // Add elements
    public static void arrayAdd() {

    }

    // Create from another array
    public static void createArray() {

    }

    // Accessing elements
    public static void arrayAccess() {

    }

    // Remove elements
    public static void arrayRemove() {

    }

    // Iterate an array
    public static void arrayIterate() {

    }

    // Search elements
    public static void arraySearch() {

    }
    public static void showMenu() {
        System.out.println("**** ArrayList search operations ****");
        System.out.println("1. Add element");
        System.out.println("2. Create an aarray from another");
        System.out.println("3. Array access");
        System.out.println("4. Remove elements");
        System.out.println("5. Iterate array ");
        System.out.println("6. Search element ");
        System.out.println("7. Finish");
        System.out.println("Choose an option:");
    }

    public static int chooseOption() {
        //Scanner sc = new Scanner(System.in);
        try {
            int option = scan.nextInt();
            return option;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }



    public static void menu() {
        int option = 0;
        while (option != 7) {
            showMenu();
            option = chooseOption();
            switch(option) {
                case 1:
                    arrayAdd();
                    break;
                case 2:
                    createArray();
                    break;
                case 3:
                    arrayAccess();
                    break;
                case 4:
                    arrayRemove();
                    break;
                case 5:
                    arrayIterate();
                    break;
                case 6:
                    arraySearch();
                    break;
                case 7:
                    System.out.println("See you soon");
                    break;
                default :
                    System.out.println("Wrong option");
                    break;
            }
        }
    }
    public static void main(String[] args) {
    }

}