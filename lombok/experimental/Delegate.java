package lombok.experimental;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Delegate {
    java.lang.Class<?>[] excludes() default {};

    java.lang.Class<?>[] types() default {};
}
