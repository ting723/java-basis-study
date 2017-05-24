package zhanglw.basis.study.annotation;

import java.lang.annotation.*;

/**
 * Created by zhanglw on 2017/2/26.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PersonAnnotation {

    String name() default "";

    int age() default -1;

}
