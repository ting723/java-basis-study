package zhanglw.basis.study.generic;

/**
 * Created by zhanglw on 2016/12/9.
 */
public class GenericDemo {

    static class Demo {

        private String name;

        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public void printType(Object o) {
            System.out.println(o.getClass().toString());
            if (o instanceof String) {
                setName(o.toString());
            } else if (o instanceof Integer) {
                setAge((Integer) o);
            }
        }

        @Override
        public String toString() {
            return "name:" + this.name + "\nage:" + this.age;
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        testGeneric(demo,"XiaoWan");
        testGeneric(demo,15);
        System.out.println(demo.toString());
    }

    public static <T> void testGeneric(Demo demo, T t) {
        demo.printType(t);
    }
}
