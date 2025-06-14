package lombok;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@java.lang.Deprecated
/* loaded from: classes.dex */
public @interface Delegate {
    java.lang.Class<?>[] excludes() default {};

    java.lang.Class<?>[] types() default {};
}
