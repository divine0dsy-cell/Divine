import java.util.*;
public class MapProg {
    public static void main(String args[]) {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(101, "Aman");
        m1.put(102, "Raju");
        m1.put(103, "Rahul");
        m1.put(103, "Rahul");
        System.out.println(m1);
        System.out.println(m1.get(102));
        m1.remove(101);
        System.out.println(m1);
    }
}
