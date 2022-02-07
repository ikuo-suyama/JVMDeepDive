package invoke.dynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandler {
    public static void main(String[] args) {
        MethodHandler mh = new MethodHandler();
        System.out.println(mh.invokeByMH());
    }

    private String invokeByMH() {
        String ret = null;
        MethodHandle mh = this.getToStringHandle();
        try {
            ret = (String)mh.invoke(this);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return ret;
    }

    private MethodHandle getToStringHandle() {
        MethodHandle mh = null;
        // 返り値の型、引数の型1, ...
        MethodType mt = MethodType.methodType(String.class);
        MethodHandles.Lookup lk = MethodHandles.lookup();

        try {
            // 完全修飾子に必要なクラス情報、メソッド名、メソッドシグネチャを渡し、メソッドをLookupする
            mh = lk.findVirtual(getClass(), "toString", mt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mh;
    }
}
