package zhanglw.basis.study.annotation;

/**
 * Created by zhanglw on 2017/2/26.
 */
@PersonAnnotation(name = "张三", age = 10)
public class Tom {
    @Override
    public String toString() {
        return "Tom{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
