package hello.aop.member.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)               // 클래스에 적용하는 애노테이션
@Retention(RetentionPolicy.RUNTIME)     // 런타임동안 애노테이션 존재
public @interface ClassAop {
}
