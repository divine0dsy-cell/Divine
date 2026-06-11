import java.util.*;
public class LinkedhashMapProg {
    public static void main(String args[]){
       Map m1= new LinkedHashMap();
        m1.put(104, "Divya");
        m1.put(106, "Divya");
        m1.put(101, "Rahul");
        m1.put(105, "Raju");
        m1.put(103, "Sejal");
        System.out.println(m1);
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.size());
    }
}
