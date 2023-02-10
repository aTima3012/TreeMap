import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxNobility;

    public PersonComparator(int maxNobility) {
        this.maxNobility = maxNobility;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int nobility1 = Math.min(o1.getSurname().split("[ -]").length, maxNobility);
        int nobility2 = Math.min(o2.getSurname().split("[ -]").length, maxNobility);
        if (nobility1 != nobility2) {
            return Integer.compare(nobility1, nobility2);
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
