package jit;

public class PolymorphismTest {
    public interface Coin { void  deposit(); }

    public static int moneyBox = 0;

    public class Nickel implements Coin {
        @Override
        public void deposit() {
            moneyBox += 5;
        }
    }

    public class Dime implements Coin {
        @Override
        public void deposit() {
            moneyBox += 10;
        }
    }

    public class Qurter implements Coin {
        @Override
        public void deposit() {
            moneyBox += 25;
        }
    }

    public PolymorphismTest() {
        Coin nickel = new Nickel();
        Coin dime = new Dime();
        Coin quarter = new Qurter();

        Coin coin = null;

        // chnage the variable maxImplementations to control the inlining behaviour
        // 2 - bimorphic dispatch   - the method call with be inlined
        // 3 - megamorphoic dispach - the method call with not be inlined

        final int maxImplementations = 2;

        for (int i = 0; i < 100_000; i++) {
            switch (i % maxImplementations) {
                case 0: coin = nickel; break;
                case 1: coin = dime; break;
                case 2: coin = quarter; break;
            }

            coin.deposit();
        }

        System.out.println("moneyBox:" + moneyBox);
    }

    public static void main(String[] args) {
        new PolymorphismTest();
    }
}
