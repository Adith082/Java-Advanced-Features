package LambdaExcercise;

import LambdaExcercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
interface Conditions{
    boolean test(Person p);
}
class UsingJava7 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("john", "connor", 21),
                new Person("sam", "smiths", 24),
                new Person("joker", "cook", 34)
        );
        // sort the list by lastName
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        // create a method which prints all the elements in the list
        printAll(persons);

        // create a method that prints all people having last name beginning with s'
        printConditionally(persons, new Conditions() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("s");
            }
        });
    }

      public static void printConditionally(List <Person> persons, Conditions condition){
        for(Person p: persons){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
      }

      public static void printAll(List<Person> persons){
          for(Person p : persons){
              System.out.println(p);
          }
      }

}