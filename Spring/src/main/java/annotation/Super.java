package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author yujt
 * @Date 2021/11/13 12:02
 * @Version 1.0
 */
// 合法标注范围
@Target(ElementType.TYPE)
// 使用范围
@Retention(RetentionPolicy.RUNTIME)
public @interface Super {
    String value() default "";
}
