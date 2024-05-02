

interface greet{
    void perform();
}
interface add{
    int addition(int a, int b);
}


public class LambdaAsInterfaceType {

    public static void main(String[] args){

        greet sayHello = () -> System.out.println("Hello");

        add addTwoNumbers = (int a, int b) -> a + b;

        sayHello.perform();
        System.out.println(addTwoNumbers.addition(1, 2));




        //Utilising anonymous inner class to do the same thing as lambda expressions
        // but they are not the same thing
        greet innerClassGreeting = new greet() {
            @Override
            public void perform() {
                System.out.println("hola");
            }
        };

       innerClassGreeting.perform();





    }


}
