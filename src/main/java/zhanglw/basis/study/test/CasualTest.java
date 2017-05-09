package zhanglw.basis.study.test;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by zhanglianwei on 2017/2/10.
 */
public class CasualTest {

    public static void testStringStability() {
        String s = "abc";
        // 将ab的内存地址指向 "abc"
        String ab = s;
        // 将s变量的内存地址指向新建的内存地址:"abcef"
        s = s.concat("ef");
        // s 的值 变成 "abcef"
        System.out.println(s);
        // ab的值为"abc"
        System.out.println(ab);

    }

    public static class Apple {
        private String color;

        private Apple(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (!(obj instanceof Apple)) return false;
            if (obj == this) return true;
            return this.color.equals(((Apple) obj).color);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(color.hashCode());
        }
    }

    public static void main(String[] args) {
//        testStringStability();

        Apple a1 = new Apple("green");
        Apple a2 = new Apple("red");
        System.out.println(a1);
        System.out.println(a2);
        HashMap<Apple, Integer> m = new HashMap<>();
        m.put(a1, 10);
        m.put(a2, 20);
        System.out.println(m.get(new Apple("green")));
        System.out.println(new Apple("green"));
    }
}
