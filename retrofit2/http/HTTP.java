package retrofit2.http;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface HTTP {
    boolean hasBody() default false;

    java.lang.String method();

    java.lang.String path() default "";
}
