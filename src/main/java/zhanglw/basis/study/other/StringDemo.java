package zhanglw.basis.study.other;

/**
 * Created by zhanglianwei on 2017/5/11.
 */
public class StringDemo {

    public static void main(String[] args) {
        String a = "He";
        String b = "llo";
        String ab = "Hello";
        String c = a + b;
        final String d = "Hello";
        System.out.println((a + b) == c);
        System.out.println((a + b) == ab);
        System.out.println(c == ab);
        System.out.println(d == ab);
    }
}
