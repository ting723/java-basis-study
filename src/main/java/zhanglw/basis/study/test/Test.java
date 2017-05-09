package zhanglw.basis.study.test;

/**
 * Created by zhanglianwei on 2017/2/10.
 */
public class Test {

    public static void main(String[] args) {
        // 相当于Integer a = Integer.valueOf(1111);
        Integer a = 111;
        Integer b = Integer.valueOf(111);
        System.out.println(new Integer(111)==new Integer(111));
        System.out.println(a==b);
    }
}
