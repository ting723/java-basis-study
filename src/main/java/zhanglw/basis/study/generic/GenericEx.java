package zhanglw.basis.study.generic;

/**
 * Created by zhanglw on 2017/2/14.
 */
public class GenericEx {

    public static void main(String[] args) {
        System.out.println(ArrayAlg.minmax("A", "B", "Z").getFirst());
    }
}

/**
 * 泛型类
 * @param <T>
 */
class Pair<T> {

    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}

class ArrayAlg {
    /**
     * 泛型方法
     * @param t
     * @return
     */
//    public static Pair<String> minmax(String... t) {
//        if (t == null || t.length == 0) return null;
//        String min = t[0];
//        String max = t[0];
//        for (int i = 1; i < t.length; i++) {
//            if (t[i].compareTo(min) < 0) {
//                min = t[i];
//            }
//            if (t[i].compareTo(max) > 0) {
//                max = t[i];
//            }
//        }
//
//        return new Pair<>(min, max);
//    }


    /**
     * 泛型比较
     * @param t
     * @param <T>
     * @return
     */
    public static <T extends Comparable<T>> Pair<T> minmax(T... t) {
        if (t == null || t.length == 0) return null;
        T min = t[0];
        T max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i].compareTo(min) < 0) {
                min = t[i];
            }
            if (t[i].compareTo(max) > 0) {
                max = t[i];
            }
        }

        return new Pair<>(min, max);
    }
}

