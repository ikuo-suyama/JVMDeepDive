package jit;

public class Fib {
    public static void main(String[] args) {
        int i = Integer.valueOf(args[0]);
        System.out.println(fib(i));
    }

    private static int fib(int i) {
        if (i <= 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return (fib(i - 1) + fib(i - 2));
        }
    }
}
