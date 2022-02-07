package invoke.dynamic;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class InvokeViaCallSite {
    public static void main(String[] args) throws Throwable {
        InvokeViaCallSite ivcs = new InvokeViaCallSite();

        CallSite cs = ivcs.getPrintHelloCallSite();
        // invoke the method using bundled method handle
        cs.getTarget().invoke(ivcs, "Ikuo");
    }

    private CallSite getPrintHelloCallSite() throws Exception {
        MethodHandles.Lookup lk = MethodHandles.lookup();
        // return type, arguments
        MethodType mt = MethodType.methodType(void.class, String.class);
        // 完全修飾子に必要なクラス情報、メソッド名、メソッドシグネチャを渡し、メソッドをLookupする
        MethodHandle mh = lk.findVirtual(getClass(), "printHello", mt);
        return new ConstantCallSite(mh);
    }

    private void printHello(String name) { System.out.println("Hello " + name + "!"); }
}
