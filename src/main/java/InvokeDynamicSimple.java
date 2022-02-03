public class InvokeDynamicSimple {
    public static void main(String[] args) {
        System.out.println("test");
        Runnable r = () -> System.out.println("Hello");
        r.run();
    }

//    public static void test() {
//        java.lang.invoke.LambdaMetafactory.metafactory()
//    }
}
