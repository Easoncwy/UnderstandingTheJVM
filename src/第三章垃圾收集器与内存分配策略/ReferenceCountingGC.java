package 第三章垃圾收集器与内存分配策略;

/**
 * Created by eason on 2016/12/9.
 */
public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC(){
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objA;
        objB.instance = objB;

        objA = null;
        objB = null;
        //假设在这一行发生GC, objA 和 objB 是否能被回收?
        System.gc();

    }

    public static void main(String[] args) {
        testGC();
    }

}
