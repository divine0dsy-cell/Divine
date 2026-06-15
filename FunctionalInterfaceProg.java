import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
public class FunctionalInterfaceProg {
    public static void main(String args[]){
        //Predicate functional interface
        Predicate<String> StartWithD= word->word.charAt(0)=='D';
        System.out.println(StartWithD.test("Divya"));
        System.out.println(StartWithD.test("java"));

        //Supplier functional interface
        Supplier<String> supplier = ()->"Java";
        System.out.println("Supplier:" + supplier.get());

        //Consumer functional interface
        Consumer<String> consumer = name->System.out.println("consumer: Hello"+ name);
        consumer.accept("Divya");

        //Function functional interface
        Function<Integer,Integer> square=n->n*n;
        System.out.println("Function:Square= " + square.apply(50));
    }
}
