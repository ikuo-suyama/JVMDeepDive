public class InvokeDynamicStackTrace {
    public static void main(String[] args) {
        System.out.println("test");
        Runnable r = () -> {
            try {
                throw new Exception();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        };
        r.run();
    }
}
