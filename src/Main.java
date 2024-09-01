import java.util.*;
//import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    static Scanner scan = new Scanner(System.in);


    // Add elements
    public static void arrayAdd() {
       List<String> animals = new ArrayList<>();//enmascaramos que estamos utilizando el arraylist
       animals.addLast("1");
       animals.addLast("2");
       animals.addLast("3");
       System.out.println(animals);
    }

    // Create from another array
    public static void createArray() {
        List<Integer> firstPrimeNUmber = new ArrayList<>();
        firstPrimeNUmber.add(2);
        firstPrimeNUmber.add(3);
        firstPrimeNUmber.add(5);
        firstPrimeNUmber.add(7);
        firstPrimeNUmber.add(11);
        Integer[] primos = new Integer []{2,3,4,5};
        //List<Integer> firsTenPrimeNumber = new ArrayList<>(Arrays.asList(primos));
        List<Integer> firsTenPrimeNumber = new ArrayList<>(firstPrimeNUmber);
        firsTenPrimeNumber.add(13);
        System.out.println(firstPrimeNUmber);
        System.out.println(firsTenPrimeNumber);

    }

    // Accessing elements
    public static void arrayAccess() {
    List<String> topCompanies = new ArrayList<>();
    topCompanies.add("Google");
    topCompanies.add("Microsoft");
    topCompanies.add("Apple");
    topCompanies.add("Amazon");
    try { /*puedo usar el index desde afuera y controlar con un if*/
        String bestCompany = topCompanies.get(0);
        System.out.println(bestCompany);
    } catch ( Exception ex){
        System.out.println(ex.getMessage());
    }

    }
    // Remove elements
    public static void arrayRemove() throws IndexOutOfBoundsException {
        /*List<Language> programmingLanguages = new ArrayList<>();
        programmingLanguages.add( new Language("C"));
        programmingLanguages.add( new Language("Python"));
        programmingLanguages.add( new Language("C++"));
        programmingLanguages.add( new Language("Java"));
        programmingLanguages.add( new Language("Kotlin"));
        programmingLanguages.add( new Language("Perl"));
        programmingLanguages.add( new Language("Ruby"));
        programmingLanguages.remove(5);
        esto no se puede hacer porque creamos un objeto con java pero no le estamos agregando un indice
        programmingLanguages.remove(new Language("Java"));
        System.out.print(programmingLanguages);*/
        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add( new String("C"));
        programmingLanguages.add( new String("Python"));
        programmingLanguages.add( new String("C++"));
        programmingLanguages.add( new String("Java"));
        programmingLanguages.add( new String("Kotlin"));
        programmingLanguages.add( new String("Perl"));
        programmingLanguages.add( new String("Ruby"));
        //System.out.print(programmingLanguages);
        programmingLanguages.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("C");
            }
        });
        System.out.println(programmingLanguages);

    }

    // Iterate array
    public static void arrayIterate() {
        List<Language> programmingLanguages = new ArrayList<>();

        programmingLanguages.add( new Language("C"));
        programmingLanguages.add( new Language("Python"));
        programmingLanguages.add( new Language("C++"));
        programmingLanguages.add( new Language("Java"));
        programmingLanguages.add( new Language("Kotlin"));
        programmingLanguages.add( new Language("Perl"));
        programmingLanguages.add( new Language("Ruby"));

        programmingLanguages.forEach(language -> {
            System.out.println(language.toString());
        });


    }

    // Search elements
    public static void arraySearch() {

    }
    public static void showMenu() {
        System.out.println("**** ArrayList search operations ****");
        System.out.println("1. Add element");
        System.out.println("2. Create an array from another");
        System.out.println("3. Array access");
        System.out.println("4. Remove elements");
        System.out.println("5. Iterate array ");
        System.out.println("6. Search element ");
        System.out.println("7. Finish");
        System.out.println("Choose an option:");
    }

    public static int chooseOption() {
        Scanner sc = new Scanner(System.in);
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
        showMenu();
        //chooseOption();
        menu();
    }

}