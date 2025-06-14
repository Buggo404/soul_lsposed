package retrofit2.http;

@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface Part {
    java.lang.String encoding() default "binary";

    java.lang.String value() default "";
}
