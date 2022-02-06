package invoke.others;

import java.util.HashMap;
import java.util.Map;

public class Invokes {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        HashMap<String, String> hm = new HashMap<>();
        hm.put("now", "bar");
        Map<String, String> m = hm;
        m.put("foo", "baz");
    }
}
