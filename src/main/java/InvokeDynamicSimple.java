public class InvokeDynamicSimple {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello");
        r.run();
    }
}
