


public class RunnableUsingLambdas {


    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread utilizing anonymous inner class");
            }
        });

        th.run();

        Thread th2 = new Thread(() -> System.out.println("Thread utilizing lambdas due to runnable interface having only one method"));
         th2.run();
    }


}
