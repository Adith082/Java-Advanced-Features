package LambdaExcercise;

interface Process{
    void process(int i);
}
public class ClosuresExample {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;  // you can define b as final or b can be effectively final

        doProcess(a, (i)-> {
            System.out.println(i + b);
        });
    }
    public static void doProcess(int i, Process process){
        process.process(i);
    }
}

