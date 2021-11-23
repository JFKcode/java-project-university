import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int idx = 0;
        while(true) {
            System.out.println("1.Dodaj obiekt");
            System.out.println("2.Usun element");
            System.out.println("3.Wyswietl informacje");
            System.out.println("4.Wyswietlenie informacji danego podtypu");
            System.out.println("5.Wyswietl obiekty zaiwerajace dany ciag");
            System.out.println("6.Wykonaj akcje z interfejsu");

            if(sc.hasNextInt()) choice = sc.nextInt();


            switch (choice) {
                case 1:{
                    System.out.println("1.Executive");
                    System.out.println("2.Pracownik IT");
                    System.out.println("3.Pracownik produkcji");
                    System.out.println("4.Manager");
                    System.out.println("5.Pracownik laboratorium");
                    if(sc.hasNextInt()) choice = sc.nextInt();
                    System.out.println("Wczytaj imie:");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Wczytaj wiek:");
                    String age = sc.nextLine();
                    switch (choice) {
                        case 1 : {
                            System.out.println("Wczytaj od czego jest szefem (CTO, CEO, CMO, CFO)");
                            Executive.FieldOfExpertise foe = Executive.FieldOfExpertise.valueOf(sc.nextLine());
                            people.add(new Executive(name, idx++, foe, age));
                            break;
                        }
                        case 2: {
                            System.out.println("Wczytaj nazwe zespolu");
                            String teamName = sc.nextLine();
                            System.out.println("Wczytaj wynagrodzenie");
                            int salary = 0;
                            if(sc.hasNextInt()) salary = sc.nextInt();
                            people.add(new ITWorker(name, idx++, salary, teamName, age));
                            break;
                        }
                        case 3 : {
                            System.out.println("Wczytaj typ pracownika (DRIVER, BUILDER, ARCHITECT)");
                            ProductionWorker.ProductionTask pt = ProductionWorker.ProductionTask.valueOf(sc.nextLine());
                            System.out.println("Wczytaj wynagrodzenie");
                            int salary = 0;
                            if(sc.hasNextInt()) salary = sc.nextInt();
                            people.add(new ProductionWorker(name, idx++, salary, pt, age));
                            break;
                        }
                        case 4: {
                            System.out.println("Wczytaj liczbe osob ktora zarzadza");
                            int no = sc.nextInt();
                            System.out.println("Wczytaj wynagrodzenie");
                            int salary = 0;
                            if(sc.hasNextInt()) salary = sc.nextInt();
                            people.add(new Manager(name, idx++, salary, no, age));
                            break;
                        }
                        case 5: {
                            System.out.println("Wczytaj miasto w ktorym znajduje sie laboratorium");
                            String cityName = sc.nextLine();
                            System.out.println("Wczytaj wynagrodzenie");
                            int salary = 0;
                            if(sc.hasNextInt()) salary = sc.nextInt();
                            people.add(new LabWorker(name, idx++, salary, cityName, age));
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Podaj id obiektu do usuniecia: ");
                    int id = sc.nextInt();
                    people.removeIf(p -> p.getId() == id);
                    break;
                }
                case 3: {
                    for(Person p : people) {
                        System.out.println(p.toString());
                    }
                    break;
                }
                case 4: {
                    System.out.println("O jakich obiektach chcesz wyswietlic informacje?");
                    System.out.println("1.Executive");
                    System.out.println("2.Pracownik IT");
                    System.out.println("3.Pracownik produkcji");
                    System.out.println("4.Manager");
                    System.out.println("5.Pracownik laboratorium");
                    if(sc.hasNextInt()) choice = sc.nextInt();
                    Class<?> cls = Executive.class;
                    switch (choice) {
                        case 1 -> cls = Executive.class;
                        case 2 -> cls = ITWorker.class;
                        case 3 -> cls = ProductionWorker.class;
                        case 4 -> cls = Manager.class;
                        case 5 -> cls = LabWorker.class;
                    }
                    for(Person p : people) {
                        if(cls.isInstance(p)) System.out.println(p);
                    }
                    break;
                }

                case 5: {
                    System.out.println("Podaj ciag znakow");
                    sc.nextLine();
                    String seq = sc.nextLine();
                    for(Person p : people) {
                        if(p.getName().contains(seq)) System.out.println(p);
                    }
                    break;
                }

                case 6: {
                    for(Person p : people) {
                        if(p instanceof WorkerInterface) ((WorkerInterface) p).askForRise();
                    }
                    break;
                }


            }

        }
    }
}
