import java.util.*;
public class ListInterface {
    public static void main(String args[]){
    List city = new ArrayList();
    city.add("Mumbai");
    city.add("Pune");
    city.add("Nagpur");
    city.add("Solapur");
    System.out.println(city);
    city.remove("Mumbai");
    System.out.println(city);
    city.set(2,"Kolhapur");
    System.out.println(city);
    city.add(2,"Nanded");
    city.add(1,"Tuljapur");
    System.out.println(city);
    Collections.sort(city);
    System.out.println(city);
}
}
