package LambdaExcercise;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferencesExample1 {
    public static void main(String[] args) {
        // utilizing method reference here calling the static method from class reference
        Thread t = new Thread(MethodReferencesExample1::printMessage); // same as calling new Thread(()->printMessage())
        t.start();

        List<Person> persons = Arrays.asList(
                new Person("john", "connor", 21),
                new Person("sam", "smiths", 24),
                new Person("joker", "cook", 34)
        );

        System.out.println("printing all the persons");

        performConditionally(persons, (p)->true, System.out::println); // (p) -> system.out.println(p) instead of this part
        // here system.out is the object of the println method
        // the method reference syntax here figures out about printing each person object due to consumer interface reference

    }

    public static void performConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person person: persons){
            if(predicate.test(person)){
                consumer.accept(person);
            }
        }
    }
    public static void printMessage(){
        System.out.println("the dark knight returns");
    }
}
