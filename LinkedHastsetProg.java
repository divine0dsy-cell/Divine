import java.util.*;
public class LinkedHastsetProg {
    public static void main(String args[]){
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        ls.add("Tiger");
        ls.add("Lion");
        ls.add("Lion");
        ls.add("Monkey");
        ls.add("Cat");
        System.out.println(ls);
    }
}
