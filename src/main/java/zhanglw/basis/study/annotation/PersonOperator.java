package zhanglw.basis.study.annotation;

/**
 * Created by zhanglw on 2017/2/26.
 */
public class PersonOperator {

    public static void dealAnnotation(Class<?> clazz) throws IllegalAccessException, InstantiationException {
        PersonAnnotation personAnnotationClass = clazz.getAnnotation(PersonAnnotation.class);
        Tom tom = (Tom)clazz.newInstance();
        tom.setAge(personAnnotationClass.age());
        tom.setName(personAnnotationClass.name());
        System.out.println(tom.toString());
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        dealAnnotation(Tom.class);
    }
}
