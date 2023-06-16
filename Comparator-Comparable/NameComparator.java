import java.util.Comparator;

public class NameComparator implements Comparator<PersonComparator> {
    public int compare(PersonComparator o1,PersonComparator o2){
        return o1.getName().compareTo(o2.getName());
    }
}
