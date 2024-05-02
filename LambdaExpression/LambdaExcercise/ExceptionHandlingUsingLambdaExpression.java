package LambdaExcercise;
@FunctionalInterface
interface Operation{
    void performAndPrint(int val, int key);
}

public class ExceptionHandlingUsingLambdaExpression {


    public static void main(String[] args) {

        int[] arr = {1, 222, 333, 4444};
        int key = 0;
        process(arr, key, (a, b) -> System.out.println(a * b));
        // much descriptive exception handling approach using lambda
        process(arr, key, (a,b) -> {
            try{
                System.out.print(a/b);
            } catch(ArithmeticException e){
                System.out.println("Arithmetic Exception Occured!");
            }
        });
        // another way to handle exception (utilizing wrapper lambda or nested lambda
        process(arr, key, wrapperLambda((a, b) -> System.out.println(a/b)));

    }
    private static Operation wrapperLambda(Operation operation){
        return (val, key) -> {
            System.out.println("Printing from the wrapper ");
            try {
                operation.performAndPrint(val, key);
            } catch(ArithmeticException e){
                System.out.println("Arithmetic Exception occured");
            }
        };
    }
      public static void process(int[] arr, int key, Operation operation){
            for(int val : arr){
                operation.performAndPrint(val, key);
            }
      }
}
