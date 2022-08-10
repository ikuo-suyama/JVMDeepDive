package jit;

public class LongMethodTest {
    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            shortNonLeafMethod();
            longMethod(1, 2);
        }
    }

    public static void shortNonLeafMethod() {
        int i = 10;
        int j = 100;
        System.out.println(longMethod(i, j));
    }

    private static String longMethod(int i, int j) {
        i *= Math.random();
        j *= Math.random();

        if (i < j) {
            i = i + j;
        } else {
            i = i - j;
        }

        int k = 100;
        int l = 1000;
        double m = Math.sqrt(k) * Math.random();
        double n = Math.sqrt(l) * Math.random();

        if (m < n) {
            m = m + n;
            if (i < j) {
                i = i + j;
            } else {
                i = i - j;
            }
        } else {
            m = m - n;
            if (i < j) {
                i = i + j;
            } else {
                i = i - j;
            }
        }

        if (m < n) {
            m = m + n;
            if (i < j) {
                i = i + j;
            } else {
                i = i - j;
            }
        } else {
            m = m - n;
            if (i < j) {
                i = i + j;
            } else {
                i = i - j;
            }
        }

        String results = "results";
        results += " " + m;
        results += " " + i;

        return results;
    }
}