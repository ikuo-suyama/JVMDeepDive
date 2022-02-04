import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class InvokeLambdaByHandler {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello");
        InvokeLambdaByHandler ih = new InvokeLambdaByHandler();
        ih.invokeLambdaByMH();
    }

    private void invokeLambdaByMH() {
        MethodHandle mh = this.getLambdaHandler();
        try {
            mh.invoke();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private MethodHandle getLambdaHandler() {
        MethodHandle mh = null;
        // 返り値の型、引数の型1, ...
        MethodType mt = MethodType.methodType(void.class);
        MethodHandles.Lookup lk = MethodHandles.lookup();

        try {
            // 完全修飾子に必要なクラス情報、メソッド名、メソッドシグネチャを渡し、メソッドをLookupする
            mh = lk.findStatic(getClass(), "lambda$main$0", mt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mh;
    }

}
