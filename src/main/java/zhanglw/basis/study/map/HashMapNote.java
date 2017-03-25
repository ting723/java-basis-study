package zhanglw.basis.study.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhanglw on 2017/3/20.
 */
public class HashMapNote {

    public static void main(String[] args) {

        Map<String, String> dmap = new HashMap<>();
        Map<String, String> map = new HashMap<>(6);
        Map<String, String> m2 = new HashMap<>(10, 0.7f);
        Map<String, String> m3 = new HashMap<>(map);
        int cap = 32;
        // >>> 无符号右移
        int r = cap >>> 1;
        //r|=r; //位或操作
        r = r | r;
        // r=15
        r |= r >>> 1;
        System.out.println(r);
        m3.put("s", "test");
        System.out.println(m3.put(null, "ss"));
        System.out.println(m3.put("nn", null));
        System.out.println(m3.get("nn"));

        A a = new A();
        a.setA(99);
        A b = new A();
        b.setA(99);
        Map<A, Integer> hashTest = new HashMap<>();
        hashTest.put(a, 99);
        hashTest.put(b, 99);

        System.out.println(hashTest.get(a));
        System.out.println(hashTest.get(b));
        System.out.println(a == b);
    }

    static class A {
        private Integer a;

        public Integer getA() {
            return a;
        }

        public void setA(Integer a) {
            this.a = a;
        }

        @Override
        public int hashCode() {
            return 100;
        }

        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }
}
