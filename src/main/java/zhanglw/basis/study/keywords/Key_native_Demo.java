package zhanglw.basis.study.keywords;

/**
 * Created by zhanglw on 2016/12/18.
 */
public class Key_native_Demo {

    private static String HellNative_DLL = "dll/zhanglw_basis_study_keywords_Key_native_Demo.dll";

    static {
        String dllFile = Key_native_Demo.class.getResource("/").getPath() + HellNative_DLL;
        System.load(dllFile);
    }

    public static native void say();

    /**
     * 可以返回非基本类型
     *
     * @return
     */
    public native Key_native_Demo getDemo();

    /**
     * 可以抛出异常
     *
     * @return
     * @throws Exception
     */
    public native String getEx() throws Exception;

    /**
     * native 可以被子类用java方法重写
     */
    class TestNative extends Key_native_Demo {
        public Key_native_Demo getDemo() {
            return null;
        }
    }

    public static void main(String[] args) {
        say();
    }
}
