import java.beans.Introspector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterator {
    public static void main(String[] args) {
        Map<Integer,String> studentsdata=new HashMap<Integer,String>();
        studentsdata.put(3,"Haseeb");
        studentsdata.put(19,"Touqeer");
        studentsdata.put(39,"Hanan");
        studentsdata.put(41,"Izhar");
        studentsdata.put(83,"Israr");

        //For Each Loop
        System.out.println("Using For Each Loop ");
        for(Map.Entry<Integer,String> i: studentsdata.entrySet()){
            System.out.println("Roll Number:"+i.getKey());
            System.out.println("Name:"+i.getValue());

        }

        //Using Iterator
        System.out.println("\nUsing HashMap Iterator ");
        //Set set=studentsdata.entrySet();
        for (Map.Entry<Integer, String> entry : studentsdata.entrySet()) {
            System.out.println("Roll Number:" + entry.getKey());
            System.out.println("Name:" + entry.getValue());
        }



        //Using Hashmap Keyset
        System.out.println("\nUsing HashMap KeySet");
        Set setViewOfKeys = studentsdata.keySet();
        for (Object setViewOfKey : setViewOfKeys) {
            Integer key = (Integer) setViewOfKey;
            System.out.println("Roll Number: "+key);
            System.out.println("Name:"+studentsdata.get(key));
        }
    }
}
