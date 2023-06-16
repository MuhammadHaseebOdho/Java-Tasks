import java.util.Comparator;

public class CityComparator implements Comparator<PersonComparator> {
    
    public int compare(PersonComparator o1, PersonComparator o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
