package invoke.others;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.oracle.com/webfolder/technetwork/jp/javamagazine/Java-SO17-MethodInvoc.pdf
 */
public class MethodInvoc {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        HashMap<String, String> hm = new HashMap<>();
        hm.put("now", "bar");
        Map<String, String> m = hm;
        m.put("foo", "baz");
    }
}
