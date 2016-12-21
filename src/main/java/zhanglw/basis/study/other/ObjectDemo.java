package zhanglw.basis.study.other;

/**
 * Created by zhanglw on 2016/12/17.
 */
public class ObjectDemo {

    public static Object obj = new Object();

    public native void testObjMethod();

    /**
     * 显示继承
     * 默认是隐式继承
     */
    class ObjectTest extends Object{
    }

    public static void testArry() throws Throwable {
        ObjectDemo[] ab = new ObjectDemo[5];
        ab.finalize();
        System.out.println(ab);
    }

    public static void main(String[] args) throws Throwable {
        testArry();
    }

}
