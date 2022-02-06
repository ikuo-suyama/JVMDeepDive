public class InvokeDynamicComplicatedTypeErase {
    public static void main(String[] args) {
        long l = 10L;
        SAM f = (i) -> (double) i / (double) l;
        f.apply(1);
    }

    @FunctionalInterface
    interface SAM {
        Double apply(Integer i);
    }
}
