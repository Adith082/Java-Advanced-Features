package LambdaExcercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface Condition{
    boolean test(Person p);
}
public class UsingJava8 {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("john", "connor", 21),
                new Person("sam", "smiths", 24),
                new Person("joker", "cook", 34)
        );
        // sort the list by lastName using lambda expression
        Collections.sort(persons, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        // create a method which prints all the elements in the list
        printConditionally(persons, p->true);
        // create a method that prints all people having last name beginning with s'
        printConditionally(persons, p->p.getLastName().startsWith("s"));
        printConditionallyUtilizingFunctionPackageInterfaces(persons, p->p.getLastName().startsWith("s"));

        performConditionally(persons, p->p.getLastName().startsWith("s"), p-> System.out.println(p.getLastName()));

    }
    public static void printConditionally(List <Person> persons, Condition condition){
        for(Person p: persons){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }
    public static void printConditionallyUtilizingFunctionPackageInterfaces(List <Person> persons, Predicate<Person> predicate){
        for(Person p: persons){
            if(predicate.test(p)){
                System.out.println(p);
            }
        }
    }

    //consumer is another function package in-built interface

    public static void performConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p: persons){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }

}
