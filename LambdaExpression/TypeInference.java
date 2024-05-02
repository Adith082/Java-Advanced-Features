

interface  StringLengthLambda{

       int stringLength(String s);

        }


public class TypeInference {


    public static void printLambda(StringLengthLambda l){
        System.out.println(l.stringLength("Hello"));
    }
    public static void main(String[] args) {
        printLambda((s) -> s.length());
    }
}
