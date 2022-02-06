package invoke.others;

public class Invokes implements IInvoke {
    public static void main(String[] args) {
        int i = 1;
        Invokes.staticMethod(i);
        Invokes invs = new Invokes();
        invs.privateMethod(i);
        invs.method(i);
        invs.interfaceMethod(i);
    }

    private int privateMethod(int i) {
        return i;
    }
    public int method(int i) {
        return i;
    }
    public static int staticMethod(int i) {
        return i;
    }
    @Override
    public int interfaceMethod(int i) {
        return i;
    }
}

interface IInvoke {
    int interfaceMethod(int i);
}
