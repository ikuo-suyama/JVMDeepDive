package invoke.dynamic;

public class InvokeDynamicFunction {
    public static void main(String[] args) {
        Sam r = () -> System.out.println("Hello");
        r.test();
    }

    interface Sam {
        void test();
    }
}
