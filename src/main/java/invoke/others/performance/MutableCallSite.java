package invoke.others.performance;

import java.util.ArrayList;
import java.util.List;

public class MutableCallSite {
    public static void main(String[] args) {
        List<Long> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(exec());
        }
        System.out.println("------------");
        for (int i = 0; i < results.size(); i++) {
            System.out.println(i + "回目: " + results.get(i) + "ms");
        }
    }

    public static long exec() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int finalI = i;
            Runnable r = () -> System.out.print("Hello" + finalI);
            r.run();
        }
        return System.currentTimeMillis() - start;
    }
}
