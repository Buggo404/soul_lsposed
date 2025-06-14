package lombok.core;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: com.usidqw.qwerklj.apk:lombok/core/HandlerPriority.SCL.lombok */
public @interface HandlerPriority {
    int value();

    int subValue() default 0;
}
