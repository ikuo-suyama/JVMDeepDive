package invoke.dynamic;

import java.util.function.Function;

public class InvokeDynamicComplicated {
    public static void main(String[] args) {
        long l = 10L;
        Function<Integer, Double> f = (i) -> (double)i / (double)l;
        f.apply(1);
    }
}
