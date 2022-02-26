public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener33 = () -> System.out.println("Error!");
        Worker worker = new Worker(listener, listener33);
        worker.start();
    }
}
