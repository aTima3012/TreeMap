import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Person> young = (o)->o.getAge()<18;
        List<Person> people = new ArrayList<>();
        Person o1 = new Person("Петр", "Петров", 30);
        Person o2 = new Person("Иван", "Петров", 15);
        Person o3 = new Person("Сидр", "Сидоров", 50);
        Person o4 = new Person("Антон", "Антонов", 5);
        people.add(o1);
        people.add(o2);
        people.add(o3);
        people.add(o4);
        people.sort(new PersonComparator(4));
        people.removeIf(young);
        System.out.println(people);

    }
}