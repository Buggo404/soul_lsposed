package lombok;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface SneakyThrows {
    java.lang.Class<? extends java.lang.Throwable>[] value() default {java.lang.Throwable.class};
}
