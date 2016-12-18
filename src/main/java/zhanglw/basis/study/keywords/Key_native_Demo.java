package zhanglw.basis.study.keywords;

/**
 * Created by zhanglw on 2016/12/18.
 *
 */
public class Key_native_Demo {

    private static String HellNative_DLL = "dll/zhanglw_basis_study_keywords_Key_native_Demo.dll";

    static {
        String dllFile= Key_native_Demo.class.getResource("/").getPath()+ HellNative_DLL;
        System.load(dllFile);
    }

    public static native void say();

    public static void main(String[] args) {
//        say();
    }
}
