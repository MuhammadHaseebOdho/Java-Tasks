import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparable implements Comparable<PersonComparable>{

    private String name;
    private int age;
    private String city;

    public void setName(String Name){
        this.name=name;
    }
    public String getName(){
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

    public PersonComparable(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public int compareTo(PersonComparable obj){
        if(this.age==obj.getAge()){
            return 0;
        } else if (this.age>obj.getAge()) {
            return 1;
        }else return -1;

    }

    public static void main(String[] args) {
        List<PersonComparable> list=new ArrayList<>();
        list.add(new PersonComparable("Izhar",23,"Thatta"));
        list.add(new PersonComparable("Haseeb",21,"Karachi"));
        list.add(new PersonComparable("Hanan",22,"Hyderabad"));
        Collections.sort(list);
        for (PersonComparable i: list) {
            System.out.println(i.getName()+" "+i.getAge()+" "+i.getCity());
        }



    }
}
