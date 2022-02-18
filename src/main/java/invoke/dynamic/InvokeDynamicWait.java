package invoke.dynamic;

import java.util.function.Function;

public class InvokeDynamicWait {
    public static void main(String[] args) throws InterruptedException {
        long l = 10L;
        Function<Integer, Double> f = (i) -> (double)i / (double)l;
        f.apply(1);
        Thread.sleep(1000000L);
    }
}
