import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person o1 = new Person("Петр", "Петров", 30);
        Person o2 = new Person("Иван", "Петров", 15);
        Person o3 = new Person("Сидр", "Сидоров", 50);
        Person o4 = new Person("Антон", "Антонов", 75);
        people.add(o1);
        people.add(o2);
        people.add(o3);
        people.add(o4);
        people.sort(new PersonComparator(4));
        System.out.println(people);

    }
}