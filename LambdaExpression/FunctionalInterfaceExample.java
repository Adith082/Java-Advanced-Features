
@FunctionalInterface
interface multiply{

      int mul(int a, int b);

        }

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        multiply mylambda = (a, b) -> a*b;
        System.out.println(mylambda.mul(20, 20));
    }
}
