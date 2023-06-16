import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparator {

    private String name;
    private int age;
    private String city;

    public void setName(String Name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PersonComparator(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        List<PersonComparator> list = new ArrayList<>();
        list.add(new PersonComparator("Izhar", 23, "Thatta"));
        list.add(new PersonComparator("Haseeb", 21, "Karachi"));
        list.add(new PersonComparator("Hanan", 22, "Hyderabad"));

        System.out.println("Sorting by Name");
        Collections.sort(list, new NameComparator());
        for (PersonComparator i : list) {
            System.out.println(i.getName() + " " + i.getAge() + " " + i.getCity());
        }
        System.out.println("Sorting by Age");
        Collections.sort(list, new AgeComparator());
        for (PersonComparator i : list) {
            System.out.println(i.getName() + " " + i.getAge() + " " + i.getCity());
        }
        System.out.println("Sorting by City");
        Collections.sort(list, new CityComparator());
        for (PersonComparator i : list) {
            System.out.println(i.getName() + " " + i.getAge() + " " + i.getCity());
        }



    }
}